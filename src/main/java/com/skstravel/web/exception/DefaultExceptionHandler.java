package com.skstravel.web.exception;

import com.skstravel.web.controller.ZhaoHangController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Q_先森 on 2017/12/18.
 */
@ControllerAdvice(basePackages = "com.skstravel.web.controller")
public class DefaultExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultExceptionHandler.class);
    @ExceptionHandler({Exception.class})
    public ModelAndView processUnauthenticatedException(HttpServletRequest request, Exception exception) {
        ModelAndView modelAndView = new ModelAndView();
        String message = "造成问题的原因是：" + exception.toString() + exception.getLocalizedMessage();
        Throwable cause = exception.getCause();
        System.out.println(cause);
        StackTraceElement[] stackTrace = exception.getStackTrace();
        LOGGER.debug("造成问题的原因是：",exception);
        modelAndView.addObject("exception", message);
        //modelAndView.addObject("detail",exception.getCause());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
