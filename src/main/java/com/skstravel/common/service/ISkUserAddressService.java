package com.skstravel.common.service;

import java.util.List;

import com.skstravel.common.model.sksports2.SkUserAddress;
import com.skstravel.common.model.sksports2.SkUserAddressExample;

public interface ISkUserAddressService {

    int deleteByPrimaryKey(Integer addressId);
    
    long countByExample(SkUserAddressExample example);

    int insertSelective(SkUserAddress record);

    List<SkUserAddress> selectByExampleWithBLOBs(SkUserAddressExample example);

    List<SkUserAddress> selectByExample(SkUserAddressExample example);

    SkUserAddress selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkUserAddress record);

    int updateByPrimaryKeyWithBLOBs(SkUserAddress record);

    int updateByPrimaryKey(SkUserAddress record);

}
