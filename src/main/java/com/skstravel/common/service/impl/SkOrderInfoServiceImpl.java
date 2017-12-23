package com.skstravel.common.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.skstravel.common.mapper.sksports2.MatcheMapper;
import com.skstravel.common.mapper.sksports2.SkOrderInfoMapper;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.common.utils.CookieUtils;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;
@Service
public class SkOrderInfoServiceImpl implements ISkOrderInfoService {
    
    @Autowired
    private SkOrderInfoMapper skOrderInfoMapper;
    @Autowired
    private  JdbcTemplate jdbcTemplateForSksports2;

    @Override
    public long countByExample(SkOrderInfoExample example) {
        return skOrderInfoMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<SkOrderInfo> selectByExampleWithBLOBs(SkOrderInfoExample example) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<SkOrderInfo> selectByExample(SkOrderInfoExample example) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.selectByExample(example);
    }

    @Override
    public SkOrderInfo selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public void createOrderInfo(HttpServletRequest request,JsonObject jsonObject) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");
        String sql = "SELECT * FROM sk_users WHERE user_id = ? ";
        List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        String userName = (String)maps.get(0).get("user_name");
        String email = (String)maps.get(0).get("email");
        String phone = (String)maps.get(0).get("mobile_phone");
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMdd");
        String str = sdf.format(new Date());
        Random random = new Random();  
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        String orderCode = str + String.valueOf(rannum);
        //创建订单信息
        SkOrderInfo orderInfo = new SkOrderInfo();
        orderInfo.setOrderSn(orderCode);
        orderInfo.setUserId(Integer.parseInt(memberId));
        orderInfo.setOrderStatus(true);
        orderInfo.setPayStatus(false);
        orderInfo.setConsignee(userName);
        orderInfo.setEmail(email);
        orderInfo.setMobile(phone);
        orderInfo.setGoodsAmount(new BigDecimal(jsonObject.get("shopPrice")+""));
        orderInfo.setAddTime((int)System.currentTimeMillis());
        int insertSelective = this.insertSelective(orderInfo);
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMdd");
        String str = sdf.format(new Date());
        Random random = new Random();  
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        String orderCode = str + String.valueOf(rannum);
    }
	

}
