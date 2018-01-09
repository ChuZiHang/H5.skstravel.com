package com.skstravel.common.service;

import java.util.List;

import com.skstravel.common.model.sksports2.SkOrderHotel;
import com.skstravel.common.model.sksports2.SkOrderHotelExample;

public interface ISkOrderHotelService {
    
    long countByExample(SkOrderHotelExample example);

    int insertSelective(SkOrderHotel record);

    List<SkOrderHotel> selectByExampleWithBLOBs(SkOrderHotelExample example);

    List<SkOrderHotel> selectByExample(SkOrderHotelExample example);

    SkOrderHotel selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkOrderHotel record);

    int updateByPrimaryKeyWithBLOBs(SkOrderHotel record);

    int updateByPrimaryKey(SkOrderHotel record);

}
