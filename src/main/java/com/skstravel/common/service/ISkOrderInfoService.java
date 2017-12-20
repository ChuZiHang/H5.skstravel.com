package com.skstravel.common.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.pojo.MatcheInfo;

public interface ISkOrderInfoService {
    
    long countByExample(SkOrderInfoExample example);

    int insertSelective(SkOrderInfo record);

    List<SkOrderInfo> selectByExampleWithBLOBs(SkOrderInfoExample example);

    List<SkOrderInfo> selectByExample(SkOrderInfoExample example);

    SkOrderInfo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkOrderInfo record);

    int updateByPrimaryKeyWithBLOBs(SkOrderInfo record);

    int updateByPrimaryKey(SkOrderInfo record);

}