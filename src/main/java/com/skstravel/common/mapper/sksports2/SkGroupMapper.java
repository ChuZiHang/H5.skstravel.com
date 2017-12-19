package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGroup;
import com.skstravel.common.model.sksports2.SkGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGroupMapper {
    long countByExample(SkGroupExample example);

    int deleteByExample(SkGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkGroup record);

    int insertSelective(SkGroup record);

    List<SkGroup> selectByExampleWithBLOBs(SkGroupExample example);

    List<SkGroup> selectByExample(SkGroupExample example);

    SkGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkGroup record, @Param("example") SkGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") SkGroup record, @Param("example") SkGroupExample example);

    int updateByExample(@Param("record") SkGroup record, @Param("example") SkGroupExample example);

    int updateByPrimaryKeySelective(SkGroup record);

    int updateByPrimaryKeyWithBLOBs(SkGroup record);

    int updateByPrimaryKey(SkGroup record);
}