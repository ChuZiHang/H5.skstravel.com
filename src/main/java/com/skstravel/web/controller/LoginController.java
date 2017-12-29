package com.skstravel.web.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skstravel.common.api.Constants;
import com.skstravel.common.service.ISkBearerInfoService;
import com.skstravel.common.service.ISkUserAddressService;
import com.skstravel.common.utils.CookieUtils;
import com.skstravel.common.utils.MD5Utils;
import com.skstravel.common.utils.sendsms;
import com.skstravel.service.UserService;


/**
 * 
 * @author jefferyChang
 *
 * 2017年12月28日
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
    private ISkBearerInfoService skBearerInfoService;

    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;

    @Autowired
    private ISkUserAddressService skUserAddressService;
    
    @Autowired
    private UserService userService;

    
    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
       String phone = request.getParameter("mobilePhone");
       String password =MD5Utils.md5(request.getParameter("password"));   
       
       
    	//String memberId = "4129";
       // CookieUtils.setCookie("memberId", memberId+"", -1, response, Constants.domain);
        String sql = "SELECT user_name userName FROM sk_users WHERE mobile_phone = ? and password =?  ";
       // List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,phone,password);
        String userName=null;
        if(list.size()>0){
         userName=(String) list.get(0).get("userName");
        }
       
       request.setAttribute("userName", userName);
        return "center";
    }
    
    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
       
    	
        return "center";
    }

    /***
     * 用户信息注册
     * @param request
     * @param response
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/register")
    public String register(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
       String mobilePhone = request.getParameter("mobilePhone");
       String password =MD5Utils.md5(request.getParameter("password")) ;
       String validateCode = request.getParameter("checkValidateCode");
       String mobileValidateCode = request.getParameter("mobileValidateCode");
       String flag="center";
       if(StringUtils.isNoneBlank(validateCode)&&StringUtils.isNotBlank(mobileValidateCode)){
    	   Integer MobileCode1 = (Integer) request.getSession().getAttribute("MobileCode");
    	  String MobileCode = String.valueOf(MobileCode1);
    	   String msg = (String) request.getSession().getAttribute("msg");
    	   if(MobileCode.equalsIgnoreCase(mobileValidateCode)  &&  msg.equalsIgnoreCase(validateCode)){
    		   request.getSession().invalidate();
    		   try {
				userService.register(mobilePhone,password);
				request.setAttribute("userName", mobilePhone);
				 
			} catch (Exception e) {
				flag="error";
				e.printStackTrace();
				
			}
    	   }
       }
       
       return flag;
       
    }
    
    
    /**
     * 跳转到登录页面
     * @param request
     * @param response
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/registerUI")
    public String registerUI(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
    	return "register";
    }
    
    
    @RequestMapping("/getMobileCode")
    public void  getMobileCode(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
    	//1.获取手机号码
    	String mobilePhone=request.getParameter("mobilePhone");
    	int mobileCode=(int)((Math.random()*9+1)*10000);
    	System.out.println(mobileCode);
    	request.getSession().setAttribute("MobileCode", mobileCode);
    	//2.调用发送短信功能
    	String flag="1";
    	try {
			sendsms.getMobileCode(mobilePhone, mobileCode);
		} catch (Exception e) {
			flag="0";
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	response.getWriter().write(flag);
    }
    
    @RequestMapping("/validateCode")
    public void  validateCode(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
    	int height = 30;
		int width = 60;
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		
		
		//2 创建一个图片
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		//3 获得画板
		Graphics g = image.getGraphics();
		//4 填充一个矩形
		// * 设置颜色
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		
		g.setColor(Color.WHITE);
		g.fillRect(1, 1, width-2, height-2);
		// * 设置字体
		g.setFont(new Font("宋体", Font.BOLD|Font.ITALIC, 25));
		
		//正确验证码
		String msg="";
		//5 写随机字
		for(int i = 0 ; i < 4 ; i ++){
			// 设置颜色--随机数
			g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
			
			// 获得随机字
			int index = random.nextInt(data.length());
			String str = data.substring(index, index + 1);
			//拼接正确的字符
			msg+=str;
			// 写入
			g.drawString(str, width/6 * (i + 1), 20);
			
		}
		//共享正确验证码，session
		request.getSession().setAttribute("msg", msg);
		
		//6 干扰线
		for(int i = 0 ; i < 3 ; i ++){
			// 设置颜色--随机数
			g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
			// 随机绘制先
			g.drawLine(random.nextInt(width), random.nextInt(height), random.nextInt(width),random.nextInt(height));
			// 随机点
			g.drawOval(random.nextInt(width), random.nextInt(height), 2, 2);
		}
		
		
		//end 将图片响应给浏览器
		ImageIO.write(image, "jpg", response.getOutputStream());
    }
    
    

    
    
    
			
	
	
	

}
