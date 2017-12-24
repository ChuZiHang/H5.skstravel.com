package com.skstravel.web.controller;

import com.cmbchina.ccd.cmblife.sdk.CmblifeUtils;
import com.google.gson.*;
import com.skstravel.common.api.Constants;
import com.skstravel.common.api.ZHClient;
import com.skstravel.common.httpclient.HttpClient;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersZhaohang;
import com.skstravel.common.model.sksports2.SkUsersZhaohangExample;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.common.service.SkUsersService;
import com.skstravel.common.service.SkUsersZhaohangService;
import com.skstravel.common.utils.CookieUtils;
import com.skstravel.common.utils.ParamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAKey;
import java.util.*;


/**
 * Created by Q_先森 on 2017/12/20.
 */
@Controller
@RequestMapping("/h5/zhaohang")
public class ZhaoHangController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZhaoHangController.class);

    @Autowired
    private HttpClient httpClient;

    @Autowired
    private ISkOrderInfoService iSkOrderInfoService;

    @Autowired
    private SkUsersZhaohangService skUsersZhaohangService;

    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;

    @Autowired
    private SkUsersService skUsersService;

    /**
     * 获取授权登陆协议
     * @param request
     * @param response
     * @throws GeneralSecurityException
     * @throws IOException
     */
    @RequestMapping("/approval")
    public void approval(HttpServletRequest request,HttpServletResponse response) throws GeneralSecurityException, IOException {
        LOGGER.debug("请求授权协议生成，如果存在openID，直接跳转项目首页");
        String openId = ParamUtils.getParameter(request, "open_id");
        LOGGER.debug("openId================================" + openId);
        if ("".equals(openId)) {// 未授权
            String funcName = "approval";

            Map<String, String> params = new HashMap<>();
            params.put("mid", Constants.mid);
            params.put("aid", Constants.aid);
            params.put("date", CmblifeUtils.genDate());
            params.put("random", CmblifeUtils.genRandom());
            params.put("clientType", "h5");
            params.put("responseType", "code");
            params.put("callback", "http://域名/h5/zhaohang/getCode.controller"); // 成功授权后的回调地址，App跳转方式不传此字段。目前支持http(s)回调和JS回调，若使用http(s)回调，则回调地址必须是申请应用时填写的主域名下的地址；
            params.put("scope", "defaultScope");
            params.put("state", "1234567890");
            String sign = CmblifeUtils.sign(funcName, params, Constants.MERCHANT_PRI_KEY);
            params.put("sign", sign);
            String protocol = CmblifeUtils.genProtocol(funcName, params, Constants.MERCHANT_PRI_KEY);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("str",protocol);
            response.getWriter().write(jsonObject.toString());
            response.getWriter().flush();
        } else{
            LOGGER.debug("============已经授权====================");
            SkUsersZhaohangExample skUsersZhaohangExample = new SkUsersZhaohangExample();
            skUsersZhaohangExample.createCriteria().andOpenIdEqualTo(openId);
            List<SkUsersZhaohang> skUsersZhaohangs = skUsersZhaohangService.selectByExample(skUsersZhaohangExample);
            SkUsersZhaohang skUsersZhaohang = skUsersZhaohangs.get(0);
            // 放进cookie
            CookieUtils.setCookie("memberId", skUsersZhaohang.getUserId()+"", -1, response, "域名");
            // 重定向到首页
            response.sendRedirect("域名地址/index/index.controller");
        }

    }

    /**
     * 首页
     * @param request
     * @param response
     * @throws IOException
     * @throws GeneralSecurityException
     */
    @RequestMapping("/index")
    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException, GeneralSecurityException {

        String openId = ParamUtils.getParameter(request, "open_id");
        LOGGER.debug("openId================================" + openId);
        if ("".equals(openId)) {// 未授权
            String funcName = "approval";

            Map<String, String> params = new HashMap<>();
            params.put("mid", Constants.mid);
            params.put("aid", Constants.aid);
            params.put("date", CmblifeUtils.genDate());
            params.put("random", CmblifeUtils.genRandom());
            params.put("clientType", "h5");
            params.put("responseType", "code");
            params.put("callback", ""); // 成功授权后的回调地址，App跳转方式不传此字段。目前支持http(s)回调和JS回调，若使用http(s)回调，则回调地址必须是申请应用时填写的主域名下的地址；
            params.put("scope", "defaultScope");
            params.put("state", "");
            String sign = CmblifeUtils.sign(funcName, params, Constants.MERCHANT_PRI_KEY);
            params.put("sign", sign);
            String protocol = CmblifeUtils.genProtocol(funcName, params, Constants.MERCHANT_PRI_KEY);

//            String result = httpClient.post("https://open.cmbchina.com/AccessGateway/transIn/approval.json/", "UTF-8", params);
            LOGGER.debug("============招行获取授权====================");
            response.sendRedirect(Constants.URL+protocol);
        }else{ // 已授权直接登录

            LOGGER.debug("============已经授权====================");
            // 直接查自己的用户表
            long memberId = 0L;
            // 放进cookie
            CookieUtils.setCookie("memberId", memberId+"", -1, response, "域名");
            // 重定向到首页
            response.sendRedirect("https://域名/app/home/index");
        }
    }

    /**
     * 获取授权码
     * @param request
     * @param response
     * @throws GeneralSecurityException
     */
    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException, IOException {
        String respCode = ParamUtils.getParameter(request, "respCode");
        String respMsg = ParamUtils.getParameter(request, "respMsg");
        String mid = ParamUtils.getParameter(request, "mid");
        String aid = ParamUtils.getParameter(request, "aid");
        String date = ParamUtils.getParameter(request, "date");
        String state = ParamUtils.getParameter(request, "state");
        String code = ParamUtils.getParameter(request, "code");
        String scope = ParamUtils.getParameter(request, "scope");
        String sign = ParamUtils.getParameter(request, "sign");

        // 验证签名

        //  获取accessToken接口
        String funcName = "accessToken";
        Map<String, String> params = new HashMap<>();
        params.put("mid", Constants.mid);
        params.put("aid", Constants.aid);
        params.put("date", CmblifeUtils.genDate());
        params.put("random", CmblifeUtils.genRandom());
        params.put("grantType", "authorizationCode");
        params.put("code", code);

        String mysign = CmblifeUtils.sign(funcName, params, Constants.MERCHANT_PRI_KEY);
        params.put("sign", mysign);

        String result = httpClient.post("https://open.cmbchina.com/AccessGateway/transIn/accessToken.json", "UTF-8", params);
        JsonElement jsonElement = new JsonParser().parse(result);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String respCode1 = asJsonObject.get("respCode").getAsString();
        if(respCode.equals("1000")){
            String acccessToken = asJsonObject.get("acccessToken").getAsString();
            String openId = asJsonObject.get("openId").getAsString();
            String expiresIn = asJsonObject.get("expiresIn").getAsString();
            // 是否建表存储令牌和openId
            Date now = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(now);
            calendar.add(Calendar.MILLISECOND,Integer.parseInt(expiresIn));

            // 确定一下第一次需要填充的字段
            SkUsers skUsers = new SkUsers();
            skUsers.setRegTime((int) now.getTime());
            skUsers.setLastTime(now);
            skUsers.setIsThird("1");
            // 设置主键返回
            int i = skUsersService.insertSelective(skUsers);

            SkUsersZhaohang skUsersZhaohang = new SkUsersZhaohang();
            skUsersZhaohang.setUserId(i);
            skUsersZhaohang.setOpenId(openId);
            skUsersZhaohang.setAcccessToken(acccessToken);
            skUsersZhaohang.setCreateDate(now);
            skUsersZhaohang.setExpiresIn(calendar.getTime());
            skUsersZhaohangService.insertSelective(skUsersZhaohang);

            CookieUtils.setCookie("memberId", i+"", -1, response, "域名");

            // 跳转项目首页
            response.sendRedirect("域名地址/index/index.controller");
        }else{
            // 跳转授权页
            response.sendRedirect("域名地址/modules/approval.jsp");
        }

    }

    /**
     * 拼接支付报文
     * @param request
     * @param response
     * @throws GeneralSecurityException
     * @throws IOException
     */
    @RequestMapping("/payOrder")
    public void payOrder(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException, IOException {

        String orderId = ParamUtils.getParameter(request, "orderId");
        SkOrderInfo skOrderInfo = iSkOrderInfoService.selectByPrimaryKey(Integer.parseInt(orderId));

        String funcName = "pay";

        Map<String, String> params = new HashMap<>();
        params.put("mid", Constants.mid);
        params.put("aid", Constants.aid);
        params.put("date", CmblifeUtils.genDate());
        params.put("random", CmblifeUtils.genRandom());
        // params.put("merchantName", "authorizationCode"); //商户名称，App支付时必传
        // params.put("storeNo", code); // 门店号
        params.put("billNo",orderId);
        // FIXME
        params.put("productName","");
        params.put("amount",skOrderInfo.getOrderAmount().multiply(BigDecimal.valueOf(100))+""); // 订单金额（单位为分）
        params.put("bonus","0"); // 订单积分，无积分则传0
        // params.put("returnUrl","0"); // 掌上生活客户端支付成功重定向页面地址，默认为掌上生活支付成功页；App支付时不需要传入
        params.put("notifyUrl","域名/h5/zhaohang/getNotify"); // 后台通知接口地址
        params.put("payPeriod",60*60*10+""); // 距离商户订单创建时间，剩余的可支付时间间隔（秒）
        String sign = CmblifeUtils.sign(funcName, params, Constants.MERCHANT_PRI_KEY);
        params.put("sign",sign);
        String protocol = CmblifeUtils.genProtocol(funcName, params, Constants.MERCHANT_PRI_KEY);
        response.getWriter().print(protocol);
    }

    /**
     * 接收支付通知
     * @param request
     * @param response
     * @throws GeneralSecurityException
     * @throws IOException
     */
    @RequestMapping("/getNotify")
    public void notify(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException, IOException {
        Map<String, String> params = new HashMap<>();
        Gson gson = new GsonBuilder().create();

        String mid = ParamUtils.getParameter(request, "mid");
        String aid = ParamUtils.getParameter(request, "aid");
        String date = ParamUtils.getParameter(request, "date");
        String encryptBody = ParamUtils.getParameter(request, "encryptBody");
        String sign = ParamUtils.getParameter(request, "sign");

        Map<String,String> map = new HashMap<>();
        map.put("mid",mid);
        map.put("aid",aid);
        map.put("date",date);
        map.put("encryptBody",encryptBody);
        map.put("sign",sign);
        LOGGER.debug("支付接收通知======================================"+map.toString());
        // 验签
        boolean flag = CmblifeUtils.verify(map, Constants.CMBLIFE_PUB_KEY);
        if(flag){
            // 解密(微信说的是铭文，所以直接gson)
            // String[] split = encryptBody.split("|");
            JsonElement parse = new JsonParser().parse(encryptBody);
            JsonObject asJsonObject = parse.getAsJsonObject();

            String billNo = asJsonObject.get("billNo").getAsString();// 商户订单号
            String storeNo = asJsonObject.get("storeNo").getAsString();// 门店号
            String payDate = asJsonObject.get("payDate").getAsString();// 支付时间 yyyyMMddHHmmss
            String result = asJsonObject.get("result").getAsString();// 支付结果，2：成功，3：失败，200：支付成功通知失败，300：支付失败通知失败
            String message = asJsonObject.get("message").getAsString();// 说明文字/错误信息
            String amount = asJsonObject.get("amount").getAsString();// 订单金额（单位为分）
            String bonus = asJsonObject.get("bonus").getAsString();// 订单积分
            String payType = asJsonObject.get("payType").getAsString();// 支付方式，从左往右，第一位：招行贷记，第二位：招行借记，第三位：招行外贷记，第四位：招行外借记
            String refNum = asJsonObject.get("refNum").getAsString();// 交易参考号，支付失败时不存在，对账相关
            String orderNum = asJsonObject.get("orderNum").getAsString();// 主机订单号，分期或积分交易返回，支付失败时不存在，对账相关
            String shieldCardNo = asJsonObject.get("shieldCardNo").getAsString();// 屏蔽卡号，积分支付时不存在

            // 修改订单状态 比对金额
            SkOrderInfo skOrderInfo = iSkOrderInfoService.selectByPrimaryKey(Integer.parseInt(billNo));
            // 订单状态 0 未确认 1 已确认 2 已取消 3 无效 4 退货 5 已分单  6 部分分单
            // 支付状态 0 未付款 1 付款中 2 已付款
            String sql = "UPDATE sk_order_info SET STATUS = ? WHERE order_id = "+ billNo;
            Object[] objects = {};
            switch (result){
                case "2":
                    jdbcTemplateForSksports2.update(sql,new Object[]{2});
                    break;
                case  "3":
                    break;
                case "200":
                    jdbcTemplateForSksports2.update(sql,new Object[]{2});
                    break;
                case "300":
                    break;
            }

            params.put("respCode", "1000"); // 应答码，若处理成功则为1000，若失败为1001

        }else{
            params.put("respCode", "1001"); // 应答码，若处理成功则为1000，若失败为1001
        }
        String respSign = CmblifeUtils.sign(params, Constants.MERCHANT_PRI_KEY);
        params.put("sign",respSign);
        response.getWriter().print(gson.toJson(params));
    }
}
