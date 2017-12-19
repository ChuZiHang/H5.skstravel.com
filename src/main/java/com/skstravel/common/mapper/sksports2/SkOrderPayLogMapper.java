package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderPayLog;
import com.skstravel.common.model.sksports2.SkOrderPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderPayLogMapper {
    long countByExample(SkOrderPayLogExample example);

    int deleteByExample(SkOrderPayLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkOrderPayLog record);

    int insertSelective(SkOrderPayLog record);

    List<SkOrderPayLog> selectByExample(SkOrderPayLogExample example);

    SkOrderPayLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkOrderPayLog record, @Param("example") SkOrderPayLogExample example);

    int updateByExample(@Param("record") SkOrderPayLog record, @Param("example") SkOrderPayLogExample example);

    int updateByPrimaryKeySelective(SkOrderPayLog record);

    int updateByPrimaryKey(SkOrderPayLog record);
}