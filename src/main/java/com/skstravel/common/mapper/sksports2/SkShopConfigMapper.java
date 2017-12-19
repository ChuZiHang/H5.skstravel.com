package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkShopConfig;
import com.skstravel.common.model.sksports2.SkShopConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkShopConfigMapper {
    long countByExample(SkShopConfigExample example);

    int deleteByExample(SkShopConfigExample example);

    int deleteByPrimaryKey(Short id);

    int insert(SkShopConfig record);

    int insertSelective(SkShopConfig record);

    List<SkShopConfig> selectByExampleWithBLOBs(SkShopConfigExample example);

    List<SkShopConfig> selectByExample(SkShopConfigExample example);

    SkShopConfig selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") SkShopConfig record, @Param("example") SkShopConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SkShopConfig record, @Param("example") SkShopConfigExample example);

    int updateByExample(@Param("record") SkShopConfig record, @Param("example") SkShopConfigExample example);

    int updateByPrimaryKeySelective(SkShopConfig record);

    int updateByPrimaryKeyWithBLOBs(SkShopConfig record);

    int updateByPrimaryKey(SkShopConfig record);
}