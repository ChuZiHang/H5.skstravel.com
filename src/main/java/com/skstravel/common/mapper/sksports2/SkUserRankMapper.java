package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserRank;
import com.skstravel.common.model.sksports2.SkUserRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserRankMapper {
    long countByExample(SkUserRankExample example);

    int deleteByExample(SkUserRankExample example);

    int deleteByPrimaryKey(Byte rankId);

    int insert(SkUserRank record);

    int insertSelective(SkUserRank record);

    List<SkUserRank> selectByExample(SkUserRankExample example);

    SkUserRank selectByPrimaryKey(Byte rankId);

    int updateByExampleSelective(@Param("record") SkUserRank record, @Param("example") SkUserRankExample example);

    int updateByExample(@Param("record") SkUserRank record, @Param("example") SkUserRankExample example);

    int updateByPrimaryKeySelective(SkUserRank record);

    int updateByPrimaryKey(SkUserRank record);
}