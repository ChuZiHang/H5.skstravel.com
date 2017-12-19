package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderCombo;
import com.skstravel.common.model.sksports2.SkOrderComboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderComboMapper {
    long countByExample(SkOrderComboExample example);

    int deleteByExample(SkOrderComboExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkOrderCombo record);

    int insertSelective(SkOrderCombo record);

    List<SkOrderCombo> selectByExample(SkOrderComboExample example);

    SkOrderCombo selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkOrderCombo record, @Param("example") SkOrderComboExample example);

    int updateByExample(@Param("record") SkOrderCombo record, @Param("example") SkOrderComboExample example);

    int updateByPrimaryKeySelective(SkOrderCombo record);

    int updateByPrimaryKey(SkOrderCombo record);
}