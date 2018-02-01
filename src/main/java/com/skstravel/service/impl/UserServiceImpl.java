package com.skstravel.service.impl;

import com.skstravel.common.mapper.sksports2.SkUsersMapper;
import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.skstravel.service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


/**
 * @author jefferyChang
 *         <p>
 *         2017年12月28日
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;

    @Autowired
    private SkUsersMapper skUsersMapper;

    public Integer register(String mobilePhone, String password) {
        SkUsers skUsers = new SkUsers();
        skUsers.setPassword(password);
        skUsers.setMobilePhone(mobilePhone);
        skUsers.setBirthday(new Date());
        skUsers.setLastTime(new Date());
        skUsers.setUserName(mobilePhone);
        SkUsersExample example = new SkUsersExample();
        SkUsersExample.Criteria criteria = example.createCriteria();
        criteria.andMobilePhoneEqualTo(mobilePhone);
        List<SkUsers> list = skUsersMapper.selectByExample(example);
        Integer i = 0;
        if(list==null||list.size()==0){
            skUsers.setEmail(" ");

            skUsers.setQuestion(" ");
            skUsers.setAnswer(" ");
            skUsers.setSex(true);
            skUsers.setUserMoney(new BigDecimal("0.0"));
            skUsers.setFrozenMoney(new BigDecimal("0.0"));
            skUsers.setPayPoints(0);
            skUsers.setRankPoints(0);
            skUsers.setAddressId(0);
            skUsers.setRegTime(0);
            skUsers.setLastLogin(0);
            skUsers.setLastIp(" ");
            skUsers.setVisitCount((short)0);
            skUsers.setUserRank((byte)0);
            skUsers.setIsSpecial((byte)0);
            skUsers.setParentId(0);
            skUsers.setFlag((byte)0);
            skUsers.setIsValidated((byte)0);
            skUsers.setCreditLine(new BigDecimal("0.0"));
            skUsers.setWxOpenId(" ");
            skUsers.setType((byte)0);
            skUsers.setCreditsNum(0);
            skUsers.setUsedCreditsNum(0);
            skUsers.setSource(true);
            skUsers.setLastIp(" ");
            skUsers.setEcSalt(" ");
            skUsers.setSalt(" ");
            skUsers.setAlias(" ");
            skUsers.setMsn(" ");
            skUsers.setQq(" ");
            skUsers.setOfficePhone(" ");
            skUsers.setHomePhone(" ");
            skUsers.setPasswdAnswer(" ");
            skUsers.setPasswdAnswer(" ");
            skUsers.setEmergencyPhone(" ");
            skUsers.setIsThird(" ");
            skUsers.setInUrt(" ");
            skUsers.setAdress(" ");
            skUsers.setCompanyName(" ");
            skUsersMapper.insertSelective(skUsers);
            Integer userId = skUsers.getUserId();
            i=userId;
        }else{
            return i;
        }
        return i;
    }


}
