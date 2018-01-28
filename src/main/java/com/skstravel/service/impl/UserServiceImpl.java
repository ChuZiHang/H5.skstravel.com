package com.skstravel.service.impl;

import com.skstravel.common.mapper.sksports2.SkUsersMapper;
import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.skstravel.service.UserService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


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

	@Autowired
	private SkUsersMapper skUsersMapper;




	
	public int register(String mobilePhone, String password) {
		SkUsers skUsers=new SkUsers();
		skUsers.setPassword(password);
		skUsers.setMobilePhone(mobilePhone);
		skUsers.setBirthday(new Date());
		SkUsersExample example=new SkUsersExample();
		SkUsersExample.Criteria criteria = example.createCriteria();
		criteria.andMobilePhoneEqualTo(mobilePhone);
		List<SkUsers> list = skUsersMapper.selectByExample(example);
		int i=0;
		if (list.size()==0||list==null){
			int id = skUsersMapper.insert(skUsers);
			i=skUsers.getUserId();
		}else{
			return  i;
		}
		return i;
    }
	
	

}
