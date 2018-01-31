package com.skstravel.web.interceptor;

import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersExample;
import com.skstravel.common.model.sksports2.SkUsersExample.Criteria;
import com.skstravel.common.model.sksports2.SkUsersZhaohang;
import com.skstravel.common.service.SkUsersService;
import com.skstravel.common.tools.CookieUtils2;
import com.skstravel.common.utils.CookieUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户个人中心，订单url拦截
 *
 * @author jefferyChang
 *         <p>
 *         2017年12月28日
 */
public class UserInfoInterceptor implements HandlerInterceptor {


//    @Autowired
//    private SkUsersZhaohangService skUsersZhaohangService;

    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;

    @Autowired
    private SkUsersService skUsersService;


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("访问的路径是:" + request.getRequestURI());
        if (request.getRequestURI().indexOf("/index/index") > 0) {
            System.out.println("访问的路径是:" + request.getRequestURI());
            return true;
        }
        //判断是否为ajax请求，默认不是
        boolean isAjaxRequest = false;
        if (!StringUtils.isBlank(request.getHeader("x-requested-with")) && request.getHeader("x-requested-with").equals("XMLHttpRequest")) {
            isAjaxRequest = true;
        }
        System.out.println(request.getRequestURI().indexOf("/h5/zhaohang/payOrder") + "=========================");
        if (request.getRequestURI().indexOf("/user") == 0 || request.getRequestURI().indexOf("/orderinfo") == 0
                || request.getRequestURI().indexOf("/h5/zhaohang/payOrder") == 0) {
            System.out.println(request.getRequestURI());
            if (CookieUtils.getCookie(request, "memberId") != null) {
                String value = CookieUtils.getCookie(request, "memberId");
//                String value = CookieUtils2.getCookieValue(request, "memberId");
                //判断招行用户条件
//                SkUsersZhaohangExample skUsersZhaohangExample = new SkUsersZhaohangExample();
//                skUsersZhaohangExample.createCriteria().andOpenIdEqualTo(value);
//                List<SkUsersZhaohang> skUsersZhaohangs = skUsersZhaohangService.selectByExample(skUsersZhaohangExample);
                //判断本站用户条件
                SkUsersExample skUsersExample = new SkUsersExample();
                List<SkUsers> list=null;
                SkUsersZhaohang skUsersZhaohang = null;
                SkUsers skUsers = null;
                if(value!=null&&value!=""){
                    Criteria criteria = skUsersExample.createCriteria().andUserIdEqualTo(Integer.valueOf(value));
                     list = skUsersService.selectByExample(skUsersExample);
                    if (list!=null&&list.size() > 0) {
                        skUsers = list.get(0);
                        if (skUsersZhaohang != null || skUsers != null) {
                            return true;
                        } else {
                            if (isAjaxRequest) {
                                response.getWriter().write("REDIRECT");
                            } else {
                                request.getRequestDispatcher("/modules/login.jsp").forward(request, response);
                            }
                            return false;
                        }
                    }
                }else{

                    if (isAjaxRequest) {
                        response.getWriter().write("REDIRECT");
                    } else {
                        request.getRequestDispatcher("/modules/login.jsp").forward(request, response);
                    }
                    return false;

                }




            } else {
                if (isAjaxRequest) {
                    response.getWriter().write("REDIRECT");
                } else {
                    request.getRequestDispatcher("/modules/login.jsp").forward(request, response);
                }
                return false;
            }
        }
        //拦截直接访问订单页面的数据
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }

}
