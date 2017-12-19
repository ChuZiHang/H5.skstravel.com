package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserCreditsLog;
import com.skstravel.common.model.sksports2.SkUserCreditsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserCreditsLogMapper {
    long countByExample(SkUserCreditsLogExample example);

    int deleteByExample(SkUserCreditsLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkUserCreditsLog record);

    int insertSelective(SkUserCreditsLog record);

    List<SkUserCreditsLog> selectByExample(SkUserCreditsLogExample example);

    SkUserCreditsLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkUserCreditsLog record, @Param("example") SkUserCreditsLogExample example);

    int updateByExample(@Param("record") SkUserCreditsLog record, @Param("example") SkUserCreditsLogExample example);

    int updateByPrimaryKeySelective(SkUserCreditsLog record);

    int updateByPrimaryKey(SkUserCreditsLog record);
}