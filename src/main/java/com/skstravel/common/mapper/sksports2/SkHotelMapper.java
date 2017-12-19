package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkHotel;
import com.skstravel.common.model.sksports2.SkHotelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkHotelMapper {
    long countByExample(SkHotelExample example);

    int deleteByExample(SkHotelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkHotel record);

    int insertSelective(SkHotel record);

    List<SkHotel> selectByExampleWithBLOBs(SkHotelExample example);

    List<SkHotel> selectByExample(SkHotelExample example);

    SkHotel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkHotel record, @Param("example") SkHotelExample example);

    int updateByExampleWithBLOBs(@Param("record") SkHotel record, @Param("example") SkHotelExample example);

    int updateByExample(@Param("record") SkHotel record, @Param("example") SkHotelExample example);

    int updateByPrimaryKeySelective(SkHotel record);

    int updateByPrimaryKeyWithBLOBs(SkHotel record);

    int updateByPrimaryKey(SkHotel record);
}