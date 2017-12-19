package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkStats;
import com.skstravel.common.model.sksports2.SkStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkStatsMapper {
    long countByExample(SkStatsExample example);

    int deleteByExample(SkStatsExample example);

    int insert(SkStats record);

    int insertSelective(SkStats record);

    List<SkStats> selectByExample(SkStatsExample example);

    int updateByExampleSelective(@Param("record") SkStats record, @Param("example") SkStatsExample example);

    int updateByExample(@Param("record") SkStats record, @Param("example") SkStatsExample example);
}