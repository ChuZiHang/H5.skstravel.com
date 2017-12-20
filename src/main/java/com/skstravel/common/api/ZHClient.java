package com.skstravel.common.api;

import com.cmbchina.ccd.cmblife.sdk.CmblifeUtils;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Q_先森 on 2017/12/20.
 */
public class ZHClient {
    /**
     * 生成支付协议
     *
     * @return
     */
    public static String genPayProtocol() {
        // 1. 协议名称
        String funcName = "pay";
        // 2. 协议中的参数
        Map<String, String> params = new HashMap<String, String>();
        params.put("merchantName", "测试商户");
        params.put("productName", "测试商品");
        params.put("billNo", "fac23a95210c4c80a1fa8e903f9ff822");
        params.put("amount", "1800");
        params.put("bonus", "0");
        params.put("notifyUrl", "http://test.com/merchant/payNotify.json");
        params.put("returnUrl", "http://test.com/merchant/payResult.html");
        // 3. 生成协议
        return genProtocol(funcName, params);
    }

    /**
     * 对查询订单信息（getPayOrder）的请求签名
     *
     * @return
     */
    public static Map<String, String> signForGetPayOrder() {
        // 1. 请求接口名称
        String funcName = "getPayOrder";
        // 2. 请求参数
        Map<String, String> params = new HashMap<String, String>();
        params.put("billNo", "fac23a95210c4c80a1fa8e903f9ff822");
        String sign = signForRequest(funcName, params);
        params.put("sign", sign);
        return params;
    }

    /**
     * 对授权回调进行验签
     *
     * @return
     */
    public static boolean verifyForApprovalCallback() {
        String cmbData = "{\"respCode\":\"1000\",\"respMsg\":\"成功\",\"code\":\"code\",\"state\":\"state\",\"scope\":\"scope\",\"sign\":\"Z+KftkaaItXMdUang8WekjedTaccNVEzmBg9J1a4njKFjphbLiMO1c80JnzaC6CWy7uA9+RCfDoVfRwmRDrxf7LKkRwSrdmr7GOafT3Q6AcskBS+DbDWmPw8J4/MgbTZqjX9byUuWwuAuqhAJiQOONww4NR15Y/fgt9LSWyxnFex560bKQn5jW2/rrWG5VQUb9IG2mFgZycJ13Q31s4T+/MDoK2GYCuiBBSJWJ7NRJBp+uHVO/OwTne/9oLkAie8SxFw7qqPUJyN+Vb5OZDL79JlcK0Idrp7hW64hvd9tppjImvUx8dpCp+m0oSZrHsc2yiLpaWyEEPyWrZGVrr2yQ==\"}";
        return verifyForResponse(cmbData);
    }

    /**
     * 对支付结果通知请求进行验签
     *
     * @return
     */
    public static boolean verifyForPayNotifyRequest() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("mid", "a1eabca4ef6443c6a15def95ab4bf6c0");
        params.put("aid", "0cb30543eaf24ce6873327969f0a944c");
        params.put("date", "20170830154121");
        params.put("random", "484e5ed8c5ed469192c5bbee34b76d89");
        params.put("billNo", "fac23a95210c4c80a1fa8e903f9ff822");
        params.put("result","2");
        params.put("amount","1800");
        params.put("bonus","0");
        params.put("refNum","708900646898");
        params.put("payType","1000");
        params.put("shieldCardNo","4392********5426");
        params.put("sign","j/ueCITX+6zcdUxVCNnI06XGNkdLvHjvDgwOjr4g9AyUyS1fKg42uMDJFp3c7GHCm1szOOU34+JvBNdGH43WkhGYfSZCcWAiFUZC1ej0c5LZ3lT4Vr0MwiqVhs3FMoMcVMPydCBm1LU5e0ib3g2EOqYsF1oCROvAptEL3hzwZmQQ/2lUkYAeuPGcAzZnBValXrMPH7SAbVL7yS/9Q9bOZvneWnQEtlBzVNgwYON/xOJNIB0/1gjLhHPffw7AshRNKHmevHrdh0b0FUVXx18M6LBOCp3jBm5ksB/Ih+9AtRY5br8H5Eu9cv4lQLr4oQ8z1H1OtRRGklRM8Vt7Fnvw4Q==");
        return verifyForRequest(params);
    }

    /**
     * 对支付结果通知响应进行签名
     *
     * @return
     */
    public static String signForPayNotifyResponse() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("respCode", "1000");
        return signForResponse(params);
    }

    /**
     * 生成协议
     *
     * @param funcName
     * @param params
     * @return
     */
    public static String genProtocol(String funcName, Map<String, String> params) {
        try {
            // 1. 增加公共参数
            params.put("mid", "a1eabca4ef6443c6a15def95ab4bf6c0");
            params.put("aid", "0cb30543eaf24ce6873327969f0a944c");
            params.put("date", CmblifeUtils.genDate());
            params.put("random", CmblifeUtils.genRandom());

            // 2. 生成协议
            String protocol = CmblifeUtils.genProtocol(funcName, params, Constants.MERCHANT_PRI_KEY);
            System.out.println("生成协议成功: " + protocol);
            return protocol;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("生成协议异常: " + Utils.getStackTrace(e));
            return null;
        }
    }

    /**
     * 对请求签名
     * 商户 --> 掌上生活
     *
     * @param funcName
     * @param params
     * @return
     */
    public static String signForRequest(String funcName, Map<String, String> params) {
        try {
            // 1. 拼接请求头
            String prefix = funcName + ".json";
            // 2. 增加公共参数
            params.put("mid", Constants.mid);
            params.put("aid", Constants.aid);
            params.put("date", CmblifeUtils.genDate());
            params.put("random", CmblifeUtils.genRandom());
            // 3. 签名
            String sign = CmblifeUtils.sign(prefix, params, Constants.MERCHANT_PRI_KEY);
            System.out.println("对请求签名成功: " + sign);
            return sign;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("对请求签名异常: " + Utils.getStackTrace(e));
            return null;
        }
    }

    /**
     * 对响应签名
     * 商户 --> 掌上生活
     *
     * @param params
     * @return
     */
    public static String signForResponse(Map<String, String> params) {
        try {
            String sign = CmblifeUtils.sign(params, Constants.MERCHANT_PRI_KEY);
            System.out.println("对响应签名成功: " + sign);
            return sign;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("对响应签名异常: " + Utils.getStackTrace(e));
            return null;
        }
    }

    /**
     * 对请求验签
     * 掌上生活 --> 商户
     *
     * @param params
     * @return
     */
    public static boolean verifyForRequest(Map<String, String> params) {
        try {
            boolean result = CmblifeUtils.verify(params, Constants.CMBLIFE_PUB_KEY);
            System.out.println("对请求验签" + (result ? "成功" : "失败"));
            return result;
        } catch (Exception e) {
            System.out.println("对请求验签异常: " + Utils.getStackTrace(e));
            return false;
        }
    }

    /**
     * 对响应验签
     * 掌上生活 --> 商户
     *
     * @param response
     * @return
     */
    public static boolean verifyForResponse(String response) {
        try {
            Map<String, String> params = new Gson().fromJson(response, Map.class);
            boolean result = CmblifeUtils.verify(params, Constants.CMBLIFE_PUB_KEY);
            System.out.println("对响应验签" + (result ? "成功" : "失败"));
            return result;
        } catch (Exception e) {
            System.out.println("对响应验签异常: " + Utils.getStackTrace(e));
            return false;
        }
    }
}
