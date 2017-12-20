package com.skstravel.web.controller;

import com.skstravel.common.utils.CookieUtils;
import com.skstravel.common.utils.ParamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Q_先森 on 2017/12/20.
 */
@Controller
@RequestMapping("/h5/zhaohang")
public class ZhaoHangController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ZhaoHangController.class);

    @RequestMapping("/index")
    public void suningLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String openId = ParamUtils.getParameter(request, "open_id");
        LOGGER.debug("openId================================" + openId);
        if ("".equals(openId)) {// 未授权
            StringBuilder urlbBuilder = new StringBuilder();
            LOGGER.debug("============招行获取授权====================");
            response.sendRedirect(urlbBuilder.toString());
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
}
