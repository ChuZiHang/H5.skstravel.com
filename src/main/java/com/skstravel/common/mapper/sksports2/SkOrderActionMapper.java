package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderAction;
import com.skstravel.common.model.sksports2.SkOrderActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderActionMapper {
    long countByExample(SkOrderActionExample example);

    int deleteByExample(SkOrderActionExample example);

    int deleteByPrimaryKey(Integer actionId);

    int insert(SkOrderAction record);

    int insertSelective(SkOrderAction record);

    List<SkOrderAction> selectByExample(SkOrderActionExample example);

    SkOrderAction selectByPrimaryKey(Integer actionId);

    int updateByExampleSelective(@Param("record") SkOrderAction record, @Param("example") SkOrderActionExample example);

    int updateByExample(@Param("record") SkOrderAction record, @Param("example") SkOrderActionExample example);

    int updateByPrimaryKeySelective(SkOrderAction record);

    int updateByPrimaryKey(SkOrderAction record);
}