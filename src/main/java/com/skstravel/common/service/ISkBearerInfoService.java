package com.skstravel.common.service;

import java.util.List;

import com.skstravel.common.model.sksports2.SkBearerInfo;
import com.skstravel.common.model.sksports2.SkBearerInfoExample;

public interface ISkBearerInfoService {
    
    long countByExample(SkBearerInfoExample example);

    int insertSelective(SkBearerInfo record);

    int deleteByPrimaryKey(Integer orderId);

    List<SkBearerInfo> selectByExampleWithBLOBs(SkBearerInfoExample example);

    List<SkBearerInfo> selectByExample(SkBearerInfoExample example);

    SkBearerInfo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkBearerInfo record);

    int updateByPrimaryKeyWithBLOBs(SkBearerInfo record);

    int updateByPrimaryKey(SkBearerInfo record);

}
