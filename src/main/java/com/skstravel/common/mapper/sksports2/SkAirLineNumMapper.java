package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkAirLineNum;
import com.skstravel.common.model.sksports2.SkAirLineNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkAirLineNumMapper {
    long countByExample(SkAirLineNumExample example);

    int deleteByExample(SkAirLineNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkAirLineNum record);

    int insertSelective(SkAirLineNum record);

    List<SkAirLineNum> selectByExample(SkAirLineNumExample example);

    SkAirLineNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkAirLineNum record, @Param("example") SkAirLineNumExample example);

    int updateByExample(@Param("record") SkAirLineNum record, @Param("example") SkAirLineNumExample example);

    int updateByPrimaryKeySelective(SkAirLineNum record);

    int updateByPrimaryKey(SkAirLineNum record);
}