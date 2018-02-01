package com.skstravel.web.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionReslover  implements HandlerExceptionResolver {
    Logger logger = LoggerFactory.getLogger(GlobalExceptionReslover.class);
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        //写入日志文件
        logger.error("系统发生异常",ex);
       // ex.printStackTrace();
        System.out.println(ex);
        //展示错误页面
      //  ModelAndView modelAndView=new ModelAndView();
        //modelAndView.addObject("globalExceptionMessage","系统发生异常，请稍后重试");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("ex", ex);
        ex.printStackTrace();//打印异常信息
        return  new ModelAndView("error",model);
    }
}
