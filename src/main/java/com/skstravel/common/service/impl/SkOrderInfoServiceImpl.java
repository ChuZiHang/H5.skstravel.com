package com.skstravel.common.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import com.skstravel.web.controller.ZhaoHangController;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.skstravel.common.mapper.sksports2.SkOrderGoodsMapper;
import com.skstravel.common.mapper.sksports2.SkOrderInfoMapper;
import com.skstravel.common.mapper.sksports2.SkOrderPlaneMapper;
import com.skstravel.common.model.sksports2.SkOrderGoods;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.model.sksports2.SkOrderPlane;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.common.utils.CookieUtils;

import org.springframework.transaction.annotation.Transactional;

@Service("iSkOrderInfoService")
public class SkOrderInfoServiceImpl implements ISkOrderInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkOrderInfoServiceImpl.class);

    @Autowired
    private SkOrderInfoMapper skOrderInfoMapper;
    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;
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
    @Transactional(value = "transactionManagerSksports2", rollbackFor = Exception.class)
    public int createOrderInfo(HttpServletRequest request, JsonObject jsonObject) throws Exception {
        LOGGER.debug("开始下单=============================================================");
        String memberId = CookieUtils.getCookie(request, "memberId");
        if (org.apache.commons.lang3.StringUtils.isBlank(memberId)) {
            memberId = "1";
        }
        String sql = "SELECT * FROM sk_users WHERE user_id = ? ";
        List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        String userName = null;
        String email = null;
        String phone = null;
        if (!maps.isEmpty()) {
            userName = (String) maps.get(0).get("user_name");
            email = (String) maps.get(0).get("email");
            phone = (String) maps.get(0).get("mobile_phone");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
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
        price = price.substring(1, price.length() - 1);
        orderInfo.setGoodsAmount(new BigDecimal(price));
        String total = jsonObject.get("orderTatalPrice").toString();
        total = total.substring(1, total.length() - 1);
        orderInfo.setGoodsAmount(new BigDecimal(total));
        orderInfo.setAddTime(new Integer((int)System.currentTimeMillis()));
        //默认值
        orderInfo.setAgencyId(Short.parseShort("1"));
        orderInfo.setInvType("1");
        orderInfo.setTax(new BigDecimal(0.00));
        orderInfo.setDiscount(new BigDecimal(17));
        orderInfo.setAddressId(1L);
        orderInfo.setAddTime((int) System.currentTimeMillis() / 1000);
        String goodsName = jsonObject.get("goodsName").toString();
        goodsName = goodsName.substring(1, goodsName.length() - 1);
        orderInfo.setThirdInfo("来源：招商银行<br>商品：" + goodsName + "<br>");
        this.insertSelective(orderInfo);
        int orderId = orderInfo.getOrderId();
        LOGGER.debug("开始下单orderId============================================================="+orderId);
        //维护订单商品信息
        SkOrderGoods orderGoods = new SkOrderGoods();
        orderGoods.setOrderId(orderId);
        String goodsId = jsonObject.get("goodsId").toString();
        goodsId = goodsId.substring(1, goodsId.length() - 1);
        orderGoods.setGoodsId(Integer.parseInt(goodsId));
        orderGoods.setGoodsName(goodsName);
        String goodsSn = jsonObject.get("goodsSn").toString();
        goodsSn = goodsSn.substring(1, goodsSn.length() - 1);
        orderGoods.setGoodsSn(goodsSn);
        String shopPrice = jsonObject.get("shopPrice").toString();
        shopPrice = shopPrice.substring(1, shopPrice.length() - 1);
        orderGoods.setGoodsPrice(new BigDecimal(shopPrice));
        String sumNum = jsonObject.get("sumNum").toString();
        sumNum = sumNum.substring(1, sumNum.length() - 1);
        orderGoods.setGoodsNumber(Short.parseShort(sumNum));
        //纪念品数量
        String jinianpinum = jsonObject.get("jinianpinum").toString();
        jinianpinum = jinianpinum.substring(1, jinianpinum.length() - 1);
        orderGoods.setProductId(Integer.parseInt(jinianpinum));//  当纪念品数量
        //默认值
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
        String hcxz = jsonObject.get("hcxz").toString();
        if ("2018-07-08".equals(hcxz)) {
            orderPlane.setFromCity(52);
            orderPlane.setToCity(3507);
            orderPlane.setFlyDate(sdf.parse("2018-07-08"));
            orderPlane.setReturnFlyDate(sdf.parse("2018-07-16"));
        } else {
            orderPlane.setFromCity(52);
            orderPlane.setToCity(3507);
            orderPlane.setFlyDate(sdf.parse("2018-07-09"));
            orderPlane.setReturnFlyDate(sdf.parse("2018-07-17"));
        }
        String jipiaonum = jsonObject.get("jipiaonum").toString();
        jipiaonum = jipiaonum.substring(1, jipiaonum.length() - 1);
        orderPlane.setGoodsNumber(Integer.parseInt(jipiaonum));

        String jipiaoqian = jsonObject.get("jipiaoqian").toString();
        jipiaoqian = jipiaoqian.substring(1, jipiaoqian.length() - 1);
        //默认值
        orderPlane.setSpaceId(new Integer(1));
        if (StringUtils.isNotBlank(jipiaoqian)) {
            orderPlane.setGoodsPrice(new BigDecimal(jipiaoqian));
        } else {
            orderPlane.setGoodsPrice(new BigDecimal(0));
        }
        orderPlane.setAirId(new Integer(1));
        this.orderPlaneMapper.insert(orderPlane);

        LOGGER.debug("下单结束orderId============================================================="+orderId);
        return orderId;
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String str = sdf.format(new Date());
        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        String orderCode = str + String.valueOf(rannum);
    }

    public void updateOrderInfo(JsonObject jsonObject) {
        //保存地址
        String payType = jsonObject.get("payType").toString();
        String invoice = jsonObject.get("invoice").toString();
        invoice = invoice.substring(1, invoice.length() - 1);
        String invoiceType = jsonObject.get("invoiceType").toString();
        invoiceType = invoiceType.substring(1, invoiceType.length() - 1);
        String unit = jsonObject.get("unit").toString();
        unit = unit.substring(1, unit.length() - 1);
        String fee = jsonObject.get("fee").toString();
        fee = fee.substring(1, fee.length() - 1);
        if(StringUtils.isBlank(fee)){
            fee="0";   
        }

        String linkMan = jsonObject.get("linkMan").toString();
        linkMan = linkMan.substring(1, linkMan.length() - 1);
        String email = jsonObject.get("email").toString();
        email = email.substring(1, email.length() - 1);
        String phone = jsonObject.get("phone").toString();
        phone = phone.substring(1, phone.length() - 1);
        String type = jsonObject.get("type").toString();
        type = type.substring(1, type.length() - 1);
        String typeCode = jsonObject.get("typeCode").toString();
        typeCode = typeCode.substring(1, typeCode.length() - 1);

        String entityId = jsonObject.get("entityId").toString();
        entityId = entityId.substring(1, entityId.length() - 1);
        SkOrderInfo orderInfo = this.selectByPrimaryKey(Integer.parseInt(entityId));
        //维护订单信息
        //TODO
        orderInfo.setInvoiceNo(invoice);
        orderInfo.setInvType(invoiceType);
        orderInfo.setInvPayee(unit);
        orderInfo.setPayFee(new BigDecimal(fee));
        //练习人信息
        orderInfo.setConsignee(linkMan);
        orderInfo.setEmail(email);
        orderInfo.setMobile(phone);
        orderInfo.setCardType(Integer.parseInt(type));
        orderInfo.setCardNum(typeCode);

        this.updateByPrimaryKeySelective(orderInfo);
    }
}
