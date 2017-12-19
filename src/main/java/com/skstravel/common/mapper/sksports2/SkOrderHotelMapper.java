package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderHotel;
import com.skstravel.common.model.sksports2.SkOrderHotelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderHotelMapper {
    long countByExample(SkOrderHotelExample example);

    int deleteByExample(SkOrderHotelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkOrderHotel record);

    int insertSelective(SkOrderHotel record);

    List<SkOrderHotel> selectByExample(SkOrderHotelExample example);

    SkOrderHotel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkOrderHotel record, @Param("example") SkOrderHotelExample example);

    int updateByExample(@Param("record") SkOrderHotel record, @Param("example") SkOrderHotelExample example);

    int updateByPrimaryKeySelective(SkOrderHotel record);

    int updateByPrimaryKey(SkOrderHotel record);
}