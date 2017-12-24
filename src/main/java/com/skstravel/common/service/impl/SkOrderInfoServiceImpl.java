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
import com.mysql.jdbc.StringUtils;
import com.skstravel.common.mapper.sksports2.MatcheMapper;
import com.skstravel.common.mapper.sksports2.SkOrderGoodsMapper;
import com.skstravel.common.mapper.sksports2.SkOrderInfoMapper;
import com.skstravel.common.mapper.sksports2.SkOrderPlaneMapper;
import com.skstravel.common.model.sksports2.SkOrderGoods;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.model.sksports2.SkOrderPlane;
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
    @Autowired
    private SkOrderGoodsMapper orderGoodsMapper;
    @Autowired
    private SkOrderPlaneMapper orderPlaneMapper;

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
    public int createOrderInfo(HttpServletRequest request,JsonObject jsonObject) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");
        if(org.apache.commons.lang3.StringUtils.isBlank(memberId)){
            memberId = "1";
        }
        String sql = "SELECT * FROM sk_users WHERE user_id = ? ";
        List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        String userName=null;
        String email=null;
        String phone=null;
        if(!maps.isEmpty()){
            userName = (String)maps.get(0).get("user_name");
            email = (String)maps.get(0).get("email");
            phone = (String)maps.get(0).get("mobile_phone");
        }
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
        String price = jsonObject.get("shopPrice").toString();
        price = price.substring(1, price.length()-1);
        orderInfo.setGoodsAmount(new BigDecimal(price));
//        orderInfo.setAddTime(new Integer((int)System.currentTimeMillis()));
        //默认值
        orderInfo.setAgencyId(Short.parseShort("1"));
        orderInfo.setInvType("1");
        orderInfo.setTax(new BigDecimal(17));
        orderInfo.setDiscount(new BigDecimal(17));
        orderInfo.setAddressId(1L);
        int orderId = this.insertSelective(orderInfo);
        //维护订单商品信息
        SkOrderGoods orderGoods = new SkOrderGoods();
        orderGoods.setOrderId(orderId);
        String goodsId = jsonObject.get("goodsId").toString();
        goodsId = goodsId.substring(1, goodsId.length()-1);
        orderGoods.setGoodsId(Integer.parseInt(goodsId));
        String goodsName = jsonObject.get("goodsName").toString();
        goodsName = goodsName.substring(1, goodsName.length()-1);
        orderGoods.setGoodsName(goodsName);
        String goodsSn = jsonObject.get("goodsSn").toString();
        goodsSn = goodsSn.substring(1, goodsSn.length()-1);
        orderGoods.setGoodsSn(goodsSn);
        String shopPrice = jsonObject.get("shopPrice").toString();
        shopPrice = shopPrice.substring(1, shopPrice.length()-1);
        orderGoods.setGoodsPrice(new BigDecimal(shopPrice));
        String sumNum = jsonObject.get("sumNum").toString();
        sumNum = sumNum.substring(1, sumNum.length()-1);
        orderGoods.setGoodsNumber(Short.parseShort(sumNum));
        //默认值
        orderGoods.setProductId(new Integer(1));
        orderGoods.setMarketPrice(new BigDecimal(22));
        orderGoods.setSendNumber(Short.parseShort("1"));
        orderGoods.setIsReal(false);
        orderGoods.setExtensionCode("");
        orderGoods.setParentId(new Integer(1));
        orderGoods.setIsGift(Short.parseShort("1"));
        orderGoods.setGoodsAttrId("");
        orderGoods.setGoodsAttr("");
        orderGoodsMapper.insert(orderGoods);
        //维护机票信息
        SkOrderPlane orderPlane = new SkOrderPlane();
        orderPlane.setOrderId(orderId);
        String fromCity = jsonObject.get("fromCity").toString();
        fromCity = fromCity.substring(1, fromCity.length()-1);
        if("".equals(fromCity)){
            fromCity = "1";
        }
        orderPlane.setFromCity(Integer.parseInt(fromCity));
        String toCity = jsonObject.get("toCity").toString();
        toCity = toCity.substring(1, toCity.length()-1);
        if("".equals(toCity)){
            toCity = "1";
        }
        orderPlane.setToCity(Integer.parseInt(toCity));
        String flyTime = jsonObject.get("flyTime").toString();
        flyTime = flyTime.substring(1, flyTime.length()-1);
        if("".equals(flyTime)){
            orderPlane.setFlyDate(new Date());
        }else{
            orderPlane.setFlyDate(new Date(flyTime));
        }
        String returnFlyTime = jsonObject.get("returnFlyTime").toString();
        returnFlyTime = returnFlyTime.substring(1, returnFlyTime.length()-1);
        orderPlane.setReturnFlyDate(new Date());
        String jipiaonum = jsonObject.get("jipiaonum").toString();
        jipiaonum = jipiaonum.substring(1, jipiaonum.length()-1);
        orderPlane.setGoodsNumber(Integer.parseInt(jipiaonum));
        String airId = jsonObject.get("airId").toString();
        airId = airId.substring(1, airId.length()-1);
        orderPlane.setAirId(Integer.parseInt(airId));
        //默认值
        orderPlane.setSpaceId(new Integer(1));
        orderPlane.setGoodsPrice(BigDecimal.ZERO);
        this.orderPlaneMapper.insert(orderPlane);
        return orderId;
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMdd");
        String str = sdf.format(new Date());
        Random random = new Random();  
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        String orderCode = str + String.valueOf(rannum);
    }
	

}
