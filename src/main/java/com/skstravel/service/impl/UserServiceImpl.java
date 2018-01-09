package com.skstravel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.skstravel.service.UserService;


/**
 * 
 * @author jefferyChang
 *
 * 2017年12月28日
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplateForSksports2;
	
	
	
	public void register(String mobilePhone, String password) {
		String sql="insert into sk_users(user_name,password,mobile_phone) values(?,?,?)";
		jdbcTemplateForSksports2.update("insert into sk_users(user_name,password,mobile_phone)  values('"  
		           + mobilePhone + "', '"  
		           + password + "', '"  
		           + mobilePhone+ "')");  
		
	}
	
	

}
