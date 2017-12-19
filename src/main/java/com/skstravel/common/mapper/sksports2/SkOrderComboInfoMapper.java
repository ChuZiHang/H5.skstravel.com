package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderComboInfo;
import com.skstravel.common.model.sksports2.SkOrderComboInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderComboInfoMapper {
    long countByExample(SkOrderComboInfoExample example);

    int deleteByExample(SkOrderComboInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkOrderComboInfo record);

    int insertSelective(SkOrderComboInfo record);

    List<SkOrderComboInfo> selectByExample(SkOrderComboInfoExample example);

    SkOrderComboInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkOrderComboInfo record, @Param("example") SkOrderComboInfoExample example);

    int updateByExample(@Param("record") SkOrderComboInfo record, @Param("example") SkOrderComboInfoExample example);

    int updateByPrimaryKeySelective(SkOrderComboInfo record);

    int updateByPrimaryKey(SkOrderComboInfo record);
}