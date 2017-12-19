package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkComboPitch;
import com.skstravel.common.model.sksports2.SkComboPitchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkComboPitchMapper {
    long countByExample(SkComboPitchExample example);

    int deleteByExample(SkComboPitchExample example);

    int deleteByPrimaryKey(Integer comboPitchId);

    int insert(SkComboPitch record);

    int insertSelective(SkComboPitch record);

    List<SkComboPitch> selectByExampleWithBLOBs(SkComboPitchExample example);

    List<SkComboPitch> selectByExample(SkComboPitchExample example);

    SkComboPitch selectByPrimaryKey(Integer comboPitchId);

    int updateByExampleSelective(@Param("record") SkComboPitch record, @Param("example") SkComboPitchExample example);

    int updateByExampleWithBLOBs(@Param("record") SkComboPitch record, @Param("example") SkComboPitchExample example);

    int updateByExample(@Param("record") SkComboPitch record, @Param("example") SkComboPitchExample example);

    int updateByPrimaryKeySelective(SkComboPitch record);

    int updateByPrimaryKeyWithBLOBs(SkComboPitch record);

    int updateByPrimaryKey(SkComboPitch record);
}