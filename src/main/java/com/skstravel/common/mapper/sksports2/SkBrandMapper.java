package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBrand;
import com.skstravel.common.model.sksports2.SkBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBrandMapper {
    long countByExample(SkBrandExample example);

    int deleteByExample(SkBrandExample example);

    int deleteByPrimaryKey(Short brandId);

    int insert(SkBrand record);

    int insertSelective(SkBrand record);

    List<SkBrand> selectByExampleWithBLOBs(SkBrandExample example);

    List<SkBrand> selectByExample(SkBrandExample example);

    SkBrand selectByPrimaryKey(Short brandId);

    int updateByExampleSelective(@Param("record") SkBrand record, @Param("example") SkBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") SkBrand record, @Param("example") SkBrandExample example);

    int updateByExample(@Param("record") SkBrand record, @Param("example") SkBrandExample example);

    int updateByPrimaryKeySelective(SkBrand record);

    int updateByPrimaryKeyWithBLOBs(SkBrand record);

    int updateByPrimaryKey(SkBrand record);
}