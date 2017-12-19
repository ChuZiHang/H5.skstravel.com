package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkComboTravelType;
import com.skstravel.common.model.sksports2.SkComboTravelTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkComboTravelTypeMapper {
    long countByExample(SkComboTravelTypeExample example);

    int deleteByExample(SkComboTravelTypeExample example);

    int deleteByPrimaryKey(Integer comboTravelTypeId);

    int insert(SkComboTravelType record);

    int insertSelective(SkComboTravelType record);

    List<SkComboTravelType> selectByExample(SkComboTravelTypeExample example);

    SkComboTravelType selectByPrimaryKey(Integer comboTravelTypeId);

    int updateByExampleSelective(@Param("record") SkComboTravelType record, @Param("example") SkComboTravelTypeExample example);

    int updateByExample(@Param("record") SkComboTravelType record, @Param("example") SkComboTravelTypeExample example);

    int updateByPrimaryKeySelective(SkComboTravelType record);

    int updateByPrimaryKey(SkComboTravelType record);
}