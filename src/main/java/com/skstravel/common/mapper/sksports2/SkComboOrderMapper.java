package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkComboOrder;
import com.skstravel.common.model.sksports2.SkComboOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkComboOrderMapper {
    long countByExample(SkComboOrderExample example);

    int deleteByExample(SkComboOrderExample example);

    int deleteByPrimaryKey(Integer comboOrderId);

    int insert(SkComboOrder record);

    int insertSelective(SkComboOrder record);

    List<SkComboOrder> selectByExample(SkComboOrderExample example);

    SkComboOrder selectByPrimaryKey(Integer comboOrderId);

    int updateByExampleSelective(@Param("record") SkComboOrder record, @Param("example") SkComboOrderExample example);

    int updateByExample(@Param("record") SkComboOrder record, @Param("example") SkComboOrderExample example);

    int updateByPrimaryKeySelective(SkComboOrder record);

    int updateByPrimaryKey(SkComboOrder record);
}