package com.skstravel.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


/**
 * @author JefferyChang
 *         <p>
 *         2018年1月27日
 *         com.skstravel.common.utils
 */
public class sendMessage {

    public static String getMobileCode(String phoneNum, Integer mobileCode) {
        String result = null;
        try {
            //连接超时及读取超时设置
            System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
            System.setProperty("sun.net.client.defaultReadTimeout", "30000");

            StringBuffer buffer = new StringBuffer();
            String encode = "UTF-8";
            String username = "shankaity";  //用户名
            String password_md5 = "shankai123";  //密码
            password_md5 = MD5Utils.md5(password_md5);
            String mobile = "86" + phoneNum;  //手机号,只发一个号码：13800000001。发多个号码：13800000001,13800000002,...N 。使用半角逗号分隔。
            String apikey = "6656f261eeebc97d1614f0ea3f28d2ac";  //apikey秘钥（请登录 http://m.5c.com.cn 短信平台-->账号管理-->我的信息 中复制apikey）
            String content = "会员验证码： "+mobileCode.toString()+" ,请您在十分钟内填写完成。【400-885-0132】";  //要发送的短信内容，特别注意：签名必须设置，网页验证码应用需要加添加【图形识别码】。

            String contentUrlEncode = URLEncoder.encode(content, encode);  //对短信内容做Urlencode编码操作。注意：如
            buffer.append("http://m.5c.com.cn/api/send/index.php?username="
                    + username + "&password_md5=" + password_md5 + "&mobile=" + mobile + "&apikey=" +
                    apikey + "&content=" + contentUrlEncode + "&encode=" + encode);
            URL url = new URL(buffer.toString());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Connection", "Keep-Alive");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            result = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        if (result.contains("success")) {
            System.out.println("短信发送成功!!");
            return "success";
        } else {
            System.out.println("短信发送失败!!");
            return "error";
        }


    }


}