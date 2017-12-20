package com.skstravel.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by Q_先森 on 2017/12/20.
 */
public class CookieUtils {

    public static String getCookie(HttpServletRequest request, String name) throws Exception {
        String value = "";
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0) {
            for(int i = 0; i < cookies.length; i++) {
                if(cookies[i].getName().equals(name.trim())) {
                    value = cookies[i].getValue();
                }
            }
        }
        return value;
    }

    public static void setCookie(String cookieName, String cookieValue, int maxAge, HttpServletResponse response, String domain) {
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setDomain(domain);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

}
