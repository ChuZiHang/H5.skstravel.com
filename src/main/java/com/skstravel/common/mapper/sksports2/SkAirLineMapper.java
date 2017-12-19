package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkAirLine;
import com.skstravel.common.model.sksports2.SkAirLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkAirLineMapper {
    long countByExample(SkAirLineExample example);

    int deleteByExample(SkAirLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkAirLine record);

    int insertSelective(SkAirLine record);

    List<SkAirLine> selectByExample(SkAirLineExample example);

    SkAirLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkAirLine record, @Param("example") SkAirLineExample example);

    int updateByExample(@Param("record") SkAirLine record, @Param("example") SkAirLineExample example);

    int updateByPrimaryKeySelective(SkAirLine record);

    int updateByPrimaryKey(SkAirLine record);
}