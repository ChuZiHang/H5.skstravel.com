package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderInfoCancel;
import com.skstravel.common.model.sksports2.SkOrderInfoCancelExample;
import com.skstravel.common.model.sksports2.SkOrderInfoCancelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderInfoCancelMapper {
    long countByExample(SkOrderInfoCancelExample example);

    int deleteByExample(SkOrderInfoCancelExample example);

    int deleteByPrimaryKey(SkOrderInfoCancelKey key);

    int insert(SkOrderInfoCancel record);

    int insertSelective(SkOrderInfoCancel record);

    List<SkOrderInfoCancel> selectByExampleWithBLOBs(SkOrderInfoCancelExample example);

    List<SkOrderInfoCancel> selectByExample(SkOrderInfoCancelExample example);

    SkOrderInfoCancel selectByPrimaryKey(SkOrderInfoCancelKey key);

    int updateByExampleSelective(@Param("record") SkOrderInfoCancel record, @Param("example") SkOrderInfoCancelExample example);

    int updateByExampleWithBLOBs(@Param("record") SkOrderInfoCancel record, @Param("example") SkOrderInfoCancelExample example);

    int updateByExample(@Param("record") SkOrderInfoCancel record, @Param("example") SkOrderInfoCancelExample example);

    int updateByPrimaryKeySelective(SkOrderInfoCancel record);

    int updateByPrimaryKeyWithBLOBs(SkOrderInfoCancel record);

    int updateByPrimaryKey(SkOrderInfoCancel record);
}