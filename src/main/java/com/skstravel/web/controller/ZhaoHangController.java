package com.skstravel.web.controller;

import com.cmbchina.ccd.cmblife.sdk.CmblifeUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.skstravel.common.api.Constants;
import com.skstravel.common.api.ZHClient;
import com.skstravel.common.httpclient.HttpClient;
import com.skstravel.common.utils.CookieUtils;
import com.skstravel.common.utils.ParamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Q_先森 on 2017/12/20.
 */
@Controller
@RequestMapping("/h5/zhaohang")
public class ZhaoHangController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZhaoHangController.class);

    @Autowired
    private HttpClient httpClient;

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
            response.sendRedirect(protocol);
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

    @RequestMapping("/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws GeneralSecurityException {
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
            // 是否建表存储令牌和openId

        }
    }
}
