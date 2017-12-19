package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderActionCancel;
import com.skstravel.common.model.sksports2.SkOrderActionCancelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderActionCancelMapper {
    long countByExample(SkOrderActionCancelExample example);

    int deleteByExample(SkOrderActionCancelExample example);

    int deleteByPrimaryKey(Integer actionId);

    int insert(SkOrderActionCancel record);

    int insertSelective(SkOrderActionCancel record);

    List<SkOrderActionCancel> selectByExampleWithBLOBs(SkOrderActionCancelExample example);

    List<SkOrderActionCancel> selectByExample(SkOrderActionCancelExample example);

    SkOrderActionCancel selectByPrimaryKey(Integer actionId);

    int updateByExampleSelective(@Param("record") SkOrderActionCancel record, @Param("example") SkOrderActionCancelExample example);

    int updateByExampleWithBLOBs(@Param("record") SkOrderActionCancel record, @Param("example") SkOrderActionCancelExample example);

    int updateByExample(@Param("record") SkOrderActionCancel record, @Param("example") SkOrderActionCancelExample example);

    int updateByPrimaryKeySelective(SkOrderActionCancel record);

    int updateByPrimaryKeyWithBLOBs(SkOrderActionCancel record);

    int updateByPrimaryKey(SkOrderActionCancel record);
}