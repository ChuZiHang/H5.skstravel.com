package com.skstravel.web.controller;

import com.cmbchina.ccd.cmblife.sdk.CmblifeUtils;
import com.google.gson.*;
import com.skstravel.common.api.Constants;
import com.skstravel.common.httpclient.HttpClient;
import com.skstravel.common.mapper.sksports2.SkOrderComboMapper;
import com.skstravel.common.mapper.sksports2.SkOrderPayLogMapper;
import com.skstravel.common.model.sksports2.*;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.common.service.SkUsersService;
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

//    @Autowired
//    private SkUsersZhaohangService skUsersZhaohangService;

    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;

    @Autowired
    private SkUsersService skUsersService;

    @Autowired
    private SkOrderComboMapper skOrderComboMapper;

    @Autowired
    private SkOrderPayLogMapper skOrderPayLogMapper;

    /**
     * 获取授权登陆协议
     *
     * @param request
     * @param response
     * @throws GeneralSecurityException
     * @throws IOException
     */
    @RequestMapping("/approval")
    public void approval(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException, IOException {
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
            params.put("callback", "https://cmb-h5.skstravel.com/h5/zhaohang/getCode.controller"); // 成功授权后的回调地址，App跳转方式不传此字段。目前支持http(s)回调和JS回调，若使用http(s)回调，则回调地址必须是申请应用时填写的主域名下的地址；
            params.put("scope", "defaultScope");
            params.put("state", "1234567890");
            String sign = CmblifeUtils.sign(funcName, params, Constants.MERCHANT_PRI_KEY);
            params.put("sign", sign);
            String protocol = CmblifeUtils.genProtocol(funcName, params, Constants.MERCHANT_PRI_KEY);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("str", protocol);
            LOGGER.debug("============授权协议答应====================protocol" + protocol);
            response.getWriter().write(jsonObject.toString());
            response.getWriter().flush();
        } else {
            LOGGER.debug("============已经授权====================");
            SkUsersZhaohangExample skUsersZhaohangExample = new SkUsersZhaohangExample();
            skUsersZhaohangExample.createCriteria().andOpenIdEqualTo(openId);
//            List<SkUsersZhaohang> skUsersZhaohangs = skUsersZhaohangService.selectByExample(skUsersZhaohangExample);
//            SkUsersZhaohang skUsersZhaohang = skUsersZhaohangs.get(0);
            // 放进cookie
//            CookieUtils.setCookie("memberId", skUsersZhaohang.getUserId() + "", -1, response, Constants.domain);
            // 重定向到首页
            response.sendRedirect("https://cmb-h5.skstravel.com/index/index.controller");
        }

    }

    /**
     * 首页
     *
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
            response.sendRedirect(Constants.URL + protocol);
        } else { // 已授权直接登录

            LOGGER.debug("============已经授权====================");
            // 直接查自己的用户表
            long memberId = 0L;
            // 放进cookie
            CookieUtils.setCookie("memberId", memberId + "", -1, response, "域名");
            // 重定向到首页
            response.sendRedirect("https://域名/app/home/index");
        }
    }

    /**
     * 获取授权码
     *
     * @param request
     * @param response
     * @throws GeneralSecurityException
     */
    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException, IOException {

        LOGGER.debug("获取授权码=======================" + request.getParameterMap().toString());

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

        LOGGER.debug("获取openId===================================result" + result);

        JsonElement jsonElement = new JsonParser().parse(result);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String respCode1 = asJsonObject.get("respCode").getAsString();
        if (respCode.equals("1000")) {
            String acccessToken = asJsonObject.get("acccessToken").getAsString();
            String openId = asJsonObject.get("openId").getAsString();
            String expiresIn = asJsonObject.get("expiresIn").getAsString();
            // 是否建表存储令牌和openId
            Date now = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(now);
            calendar.add(Calendar.MILLISECOND, Integer.parseInt(expiresIn));

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
//            skUsersZhaohangService.insertSelective(skUsersZhaohang);

            CookieUtils.setCookie("memberId", i + "", -1, response, Constants.domain);
            LOGGER.debug("注册用户成功直接跳转项目首页");
            // 跳转项目首页
            response.sendRedirect("https://cmb-h5.skstravel.com/index/index.controller");
        } else {
            LOGGER.debug("失败了,,,跳转授权页====================");
            // 跳转授权页
            response.sendRedirect("https://cmb-h5.skstravel.com/modules/index1.jsp");
        }

    }

    /**
     * 拼接支付报文
     *
     * @param request
     * @param response
     * @throws GeneralSecurityException
     * @throws IOException
     */
    @RequestMapping("/payOrder")
    public void payOrder(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException, IOException {
        LOGGER.debug("拼接支付报文====================");
        String orderId = ParamUtils.getParameter(request, "entityId");
        SkOrderInfo orderInfo = iSkOrderInfoService.selectByPrimaryKey(Integer.parseInt(orderId));
        SkOrderComboExample skOrderComboExample = new SkOrderComboExample();
        skOrderComboExample.createCriteria().andOrderIdEqualTo(Integer.parseInt(orderId));
        List<SkOrderCombo> skOrderCombos = skOrderComboMapper.selectByExample(skOrderComboExample);
        String productName = "";
        if (skOrderCombos != null && skOrderCombos.size() > 0) {
            productName = skOrderCombos.get(0).getGoodsName();
        }

        String funcName = "pay";

        Map<String, String> params = new HashMap<>();
        params.put("mid", Constants.mid);
        params.put("aid", Constants.aid);
        params.put("date", CmblifeUtils.genDate());
        params.put("random", CmblifeUtils.genRandom());
        params.put("merchantName", "authorizationCode"); //商户名称，App支付时必传
//         params.put("storeNo", code); // 门店号
        params.put("billNo", orderId);
//        params.put("billNo", "1234567890");
        // FIXME
        params.put("productName", productName);
//        params.put("productName", "世界杯门票套餐");
        BigDecimal one = new BigDecimal("1");
        BigDecimal amount = orderInfo.getGoodsAmount().multiply(BigDecimal.valueOf(100));
        params.put("amount",(amount.setScale(0, BigDecimal.ROUND_HALF_UP)).toString()); // 订单金额（单位为分）
//        params.put("amount","100"); // 订单金额（单位为分）
        params.put("bonus", "0"); // 订单积分，无积分则传0
        params.put("returnUrl", "https://cmb-h5.skstravel.com/orderinfo/myorder"); // 掌上生活客户端支付成功重定向页面地址，默认为掌上生活支付成功页；App支付时不需要传入
        params.put("notifyUrl", "https://cmb-h5.skstravel.com/h5/zhaohang/getNotify"); // 后台通知接口地址
        params.put("payPeriod", 60 * 60 * 10 + ""); // 距离商户订单创建时间，剩余的可支付时间间隔（秒）
        String protocol = CmblifeUtils.genProtocol(funcName, params, Constants.MERCHANT_PRI_KEY);
        LOGGER.debug("拼接支付报文====================protocol:" + protocol);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("str", protocol);
        response.getWriter().print(jsonObject.toString());
        response.getWriter().flush();
    }

    /**
     * 接收支付通知
     *
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
        String billno = ParamUtils.getParameter(request, "billno"); // 商户订单号
        String storeno = ParamUtils.getParameter(request, "storeno"); // 门店号
        String result = ParamUtils.getParameter(request, "result"); // 支付结果，2：成功，3：失败，200：支付成功通知失败，300：支付失败通知失败
        String message = ParamUtils.getParameter(request, "message");
        String amount = ParamUtils.getParameter(request, "amount"); // 订单金额（单位分）
        String bonus = ParamUtils.getParameter(request, "bonus"); // 订单积分
        String paytype = ParamUtils.getParameter(request, "paytype"); // 支付方式，从左往右，第一位：招行贷记，第二位：招行借记，第三位：招行外贷记，第四位：招行外借记
        String refnum = ParamUtils.getParameter(request, "refnum"); // 交易参考号
        String ordernum = ParamUtils.getParameter(request, "ordernum"); // 主机订单号，招行信用卡与积分支付返回，其余支付方式不返回
        String bankpayserial = ParamUtils.getParameter(request, "bankpayserial"); // 支付流水号
        String cuprefno = ParamUtils.getParameter(request, "cuprefno"); // 银联参考号
        String shieldcardno = ParamUtils.getParameter(request, "shieldcardno"); // 屏蔽卡号，积分支付时不存在
        String sign = ParamUtils.getParameter(request, "sign");

        Map<String, String> map = new HashMap<>();
        map.put("mid", mid);
        map.put("aid", aid);
        map.put("date", date);
        map.put("billno", billno);
        if (!storeno.isEmpty()) {
            map.put("storeno", storeno);
        }
        map.put("result", result);
        if (!message.isEmpty()) {
            map.put("message", message);
        }
        map.put("amount", amount);
        map.put("bonus", bonus);
        map.put("paytype", paytype);
        map.put("refnum", refnum);
        if (!ordernum.isEmpty()) {
            map.put("ordernum", ordernum);
        }
        map.put("bankpayserial", bankpayserial);
        if (!cuprefno.isEmpty()) {
            map.put("cuprefno", cuprefno);
        }
        if (!shieldcardno.isEmpty()) {
            map.put("shieldcardno", shieldcardno);
        }
        map.put("sign", sign);
        LOGGER.debug("支付接收通知======================================" + map.toString());
        // 验签
        boolean flag = CmblifeUtils.verify(map, Constants.CMBLIFE_PUB_KEY);
        LOGGER.debug("支付接收通知====================flag:" + flag);
        if (flag) {

            // 修改订单状态 比对金额
            SkOrderInfo skOrderInfo = iSkOrderInfoService.selectByPrimaryKey(Integer.parseInt(billno));
            // 订单状态 0 未确认 1 已确认 2 已取消 3 无效 4 退货 5 已分单  6 部分分单
            // 支付状态 0 未付款 1 付款中 2 已付款
            // 订单的相应的字段进行修改

            int payTime = (int) (System.currentTimeMillis()/1000);
            String sql = "UPDATE sk_order_info SET STATUS = ? , pay_time = ?,pay_name = '招行支付'  WHERE order_id = " + billno;
            Object[] objects = {};
            switch (result) {
                case "2":
                    jdbcTemplateForSksports2.update(sql, new Object[]{2,payTime});
                    break;
                case "3":
                    break;
                case "200":
                    jdbcTemplateForSksports2.update(sql, new Object[]{2,payTime});
                    break;
                case "300":
                    break;
                default:
                    break;
            }

            SkOrderPayLog skOrderPayLog = new SkOrderPayLog();
            skOrderPayLog.setOrderId(Integer.parseInt(billno));
            skOrderPayLog.setTradeNo(refnum);
            skOrderPayLog.setPayType(Short.parseShort("9"));
            skOrderPayLog.setPayFee(Integer.parseInt(amount));
            skOrderPayLog.setOutTradeNo(bankpayserial);
            skOrderPayLog.setUserId(skOrderInfo.getUserId());
            skOrderPayLog.setPayStatus(Byte.parseByte("1"));
            skOrderPayLog.setReturnData(map.toString());
            skOrderPayLog.setCreateTime(new Date());
            skOrderPayLog.setUpdateTime(new Date());

            skOrderPayLogMapper.insertSelective(skOrderPayLog);
            params.put("respCode", "1000"); // 应答码，若处理成功则为1000，若失败为1001

        } else {
            params.put("respCode", "1001"); // 应答码，若处理成功则为1000，若失败为1001
        }
        String respSign = CmblifeUtils.sign(params, Constants.MERCHANT_PRI_KEY);
        params.put("sign", respSign);
        response.getWriter().print(gson.toJson(params));
    }
    
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1.12);
        BigDecimal dd = a.multiply(new BigDecimal(100));
        BigDecimal ddd = dd.setScale(0, BigDecimal.ROUND_HALF_UP);
        System.out.println(ddd);
    }
}
