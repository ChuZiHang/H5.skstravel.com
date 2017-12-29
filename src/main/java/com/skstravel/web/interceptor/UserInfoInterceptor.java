package com.skstravel.web.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.skstravel.common.model.sksports2.SkUsersZhaohang;
import com.skstravel.common.model.sksports2.SkUsersZhaohangExample;
import com.skstravel.common.service.SkUsersService;
import com.skstravel.common.service.SkUsersZhaohangService;
import com.skstravel.common.utils.CookieUtils;
/**
 * 用户个人中心，订单url拦截
 * @author jefferyChang
 *
 * 2017年12月28日
 */
public class UserInfoInterceptor implements HandlerInterceptor {
	
	
	  	@Autowired
	    private SkUsersZhaohangService skUsersZhaohangService;

	    @Autowired
	    private JdbcTemplate jdbcTemplateForSksports2;

	    @Autowired
	    private SkUsersService skUsersService;

	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//if(request.getRequestURI().index){}
		
		System.out.println("访问的路径是:"+request.getRequestURI());
		if(request.getRequestURI().indexOf("/index/index")>0){
			System.out.println("访问的路径是:"+request.getRequestURI());
			return true;
		}
		if(request.getRequestURI().indexOf("/user")>0){
			if(CookieUtils.getCookie(request, "memberId") !=null){
				String value = CookieUtils.getCookie(request, "memberId");
				 SkUsersZhaohangExample skUsersZhaohangExample = new SkUsersZhaohangExample();
		         skUsersZhaohangExample.createCriteria().andOpenIdEqualTo(value);
				 List<SkUsersZhaohang> skUsersZhaohangs = skUsersZhaohangService.selectByExample(skUsersZhaohangExample);
		        
				 SkUsersZhaohang skUsersZhaohang=null;
				 if(skUsersZhaohangs.size()>0){
					 skUsersZhaohang = skUsersZhaohangs.get(0);
				 }
				 
				if(skUsersZhaohang!=null){
					return true;
				}else{
					request.getRequestDispatcher("/modules/login.jsp").forward(request, response);
					return false;
				}
			}else{
				request.getRequestDispatcher("/modules/login.jsp").forward(request, response);
				return false;
			}
		}
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
