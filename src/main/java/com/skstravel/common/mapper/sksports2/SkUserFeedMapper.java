package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserFeed;
import com.skstravel.common.model.sksports2.SkUserFeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserFeedMapper {
    long countByExample(SkUserFeedExample example);

    int deleteByExample(SkUserFeedExample example);

    int deleteByPrimaryKey(Integer feedId);

    int insert(SkUserFeed record);

    int insertSelective(SkUserFeed record);

    List<SkUserFeed> selectByExample(SkUserFeedExample example);

    SkUserFeed selectByPrimaryKey(Integer feedId);

    int updateByExampleSelective(@Param("record") SkUserFeed record, @Param("example") SkUserFeedExample example);

    int updateByExample(@Param("record") SkUserFeed record, @Param("example") SkUserFeedExample example);

    int updateByPrimaryKeySelective(SkUserFeed record);

    int updateByPrimaryKey(SkUserFeed record);
}