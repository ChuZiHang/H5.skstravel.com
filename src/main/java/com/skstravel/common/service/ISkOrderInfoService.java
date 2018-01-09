package com.skstravel.common.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.JsonObject;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;

public interface ISkOrderInfoService {
    
    long countByExample(SkOrderInfoExample example);

    int insertSelective(SkOrderInfo record);

    List<SkOrderInfo> selectByExampleWithBLOBs(SkOrderInfoExample example);

    List<SkOrderInfo> selectByExample(SkOrderInfoExample example);

    SkOrderInfo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkOrderInfo record);

    int updateByPrimaryKeyWithBLOBs(SkOrderInfo record);

    int updateByPrimaryKey(SkOrderInfo record);


    /**
     * 创建订单信息
     */
    int createOrderInfo(HttpServletRequest request,JsonObject jsonObject) throws Exception;
   
    /**
     * 支付逻辑,维护相关信息
     */
    public void updateOrderInfo(JsonObject jsonObject);
}
