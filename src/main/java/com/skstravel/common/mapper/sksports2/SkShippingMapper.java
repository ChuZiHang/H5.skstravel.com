package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkShipping;
import com.skstravel.common.model.sksports2.SkShippingExample;
import com.skstravel.common.model.sksports2.SkShippingWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkShippingMapper {
    long countByExample(SkShippingExample example);

    int deleteByExample(SkShippingExample example);

    int deleteByPrimaryKey(Byte shippingId);

    int insert(SkShippingWithBLOBs record);

    int insertSelective(SkShippingWithBLOBs record);

    List<SkShippingWithBLOBs> selectByExampleWithBLOBs(SkShippingExample example);

    List<SkShipping> selectByExample(SkShippingExample example);

    SkShippingWithBLOBs selectByPrimaryKey(Byte shippingId);

    int updateByExampleSelective(@Param("record") SkShippingWithBLOBs record, @Param("example") SkShippingExample example);

    int updateByExampleWithBLOBs(@Param("record") SkShippingWithBLOBs record, @Param("example") SkShippingExample example);

    int updateByExample(@Param("record") SkShipping record, @Param("example") SkShippingExample example);

    int updateByPrimaryKeySelective(SkShippingWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SkShippingWithBLOBs record);

    int updateByPrimaryKey(SkShipping record);
}