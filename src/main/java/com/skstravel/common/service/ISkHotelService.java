package com.skstravel.common.service;

import java.util.List;

import com.skstravel.common.model.sksports2.SkHotel;
import com.skstravel.common.model.sksports2.SkHotelExample;

public interface ISkHotelService {
    
    long countByExample(SkHotelExample example);

    int insertSelective(SkHotel record);

    List<SkHotel> selectByExampleWithBLOBs(SkHotelExample example);

    List<SkHotel> selectByExample(SkHotelExample example);

    SkHotel selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkHotel record);

    int updateByPrimaryKeyWithBLOBs(SkHotel record);

    int updateByPrimaryKey(SkHotel record);

}
