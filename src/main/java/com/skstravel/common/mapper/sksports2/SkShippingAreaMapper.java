package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkShippingArea;
import com.skstravel.common.model.sksports2.SkShippingAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkShippingAreaMapper {
    long countByExample(SkShippingAreaExample example);

    int deleteByExample(SkShippingAreaExample example);

    int deleteByPrimaryKey(Short shippingAreaId);

    int insert(SkShippingArea record);

    int insertSelective(SkShippingArea record);

    List<SkShippingArea> selectByExampleWithBLOBs(SkShippingAreaExample example);

    List<SkShippingArea> selectByExample(SkShippingAreaExample example);

    SkShippingArea selectByPrimaryKey(Short shippingAreaId);

    int updateByExampleSelective(@Param("record") SkShippingArea record, @Param("example") SkShippingAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") SkShippingArea record, @Param("example") SkShippingAreaExample example);

    int updateByExample(@Param("record") SkShippingArea record, @Param("example") SkShippingAreaExample example);

    int updateByPrimaryKeySelective(SkShippingArea record);

    int updateByPrimaryKeyWithBLOBs(SkShippingArea record);

    int updateByPrimaryKey(SkShippingArea record);
}