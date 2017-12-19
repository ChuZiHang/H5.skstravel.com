package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkComboTravel;
import com.skstravel.common.model.sksports2.SkComboTravelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkComboTravelMapper {
    long countByExample(SkComboTravelExample example);

    int deleteByExample(SkComboTravelExample example);

    int deleteByPrimaryKey(Integer comboTravelId);

    int insert(SkComboTravel record);

    int insertSelective(SkComboTravel record);

    List<SkComboTravel> selectByExampleWithBLOBs(SkComboTravelExample example);

    List<SkComboTravel> selectByExample(SkComboTravelExample example);

    SkComboTravel selectByPrimaryKey(Integer comboTravelId);

    int updateByExampleSelective(@Param("record") SkComboTravel record, @Param("example") SkComboTravelExample example);

    int updateByExampleWithBLOBs(@Param("record") SkComboTravel record, @Param("example") SkComboTravelExample example);

    int updateByExample(@Param("record") SkComboTravel record, @Param("example") SkComboTravelExample example);

    int updateByPrimaryKeySelective(SkComboTravel record);

    int updateByPrimaryKeyWithBLOBs(SkComboTravel record);

    int updateByPrimaryKey(SkComboTravel record);
}