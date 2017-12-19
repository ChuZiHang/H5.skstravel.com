package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkPayLog;
import com.skstravel.common.model.sksports2.SkPayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkPayLogMapper {
    long countByExample(SkPayLogExample example);

    int deleteByExample(SkPayLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(SkPayLog record);

    int insertSelective(SkPayLog record);

    List<SkPayLog> selectByExample(SkPayLogExample example);

    SkPayLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") SkPayLog record, @Param("example") SkPayLogExample example);

    int updateByExample(@Param("record") SkPayLog record, @Param("example") SkPayLogExample example);

    int updateByPrimaryKeySelective(SkPayLog record);

    int updateByPrimaryKey(SkPayLog record);
}