package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkCombo;
import com.skstravel.common.model.sksports2.SkComboExample;
import com.skstravel.common.model.sksports2.SkComboWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkComboMapper {
    long countByExample(SkComboExample example);

    int deleteByExample(SkComboExample example);

    int deleteByPrimaryKey(Integer comboId);

    int insert(SkComboWithBLOBs record);

    int insertSelective(SkComboWithBLOBs record);

    List<SkComboWithBLOBs> selectByExampleWithBLOBs(SkComboExample example);

    List<SkCombo> selectByExample(SkComboExample example);

    SkComboWithBLOBs selectByPrimaryKey(Integer comboId);

    int updateByExampleSelective(@Param("record") SkComboWithBLOBs record, @Param("example") SkComboExample example);

    int updateByExampleWithBLOBs(@Param("record") SkComboWithBLOBs record, @Param("example") SkComboExample example);

    int updateByExample(@Param("record") SkCombo record, @Param("example") SkComboExample example);

    int updateByPrimaryKeySelective(SkComboWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SkComboWithBLOBs record);

    int updateByPrimaryKey(SkCombo record);
}