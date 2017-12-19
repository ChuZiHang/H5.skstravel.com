package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkKeywords;
import com.skstravel.common.model.sksports2.SkKeywordsExample;
import com.skstravel.common.model.sksports2.SkKeywordsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkKeywordsMapper {
    long countByExample(SkKeywordsExample example);

    int deleteByExample(SkKeywordsExample example);

    int deleteByPrimaryKey(SkKeywordsKey key);

    int insert(SkKeywords record);

    int insertSelective(SkKeywords record);

    List<SkKeywords> selectByExample(SkKeywordsExample example);

    SkKeywords selectByPrimaryKey(SkKeywordsKey key);

    int updateByExampleSelective(@Param("record") SkKeywords record, @Param("example") SkKeywordsExample example);

    int updateByExample(@Param("record") SkKeywords record, @Param("example") SkKeywordsExample example);

    int updateByPrimaryKeySelective(SkKeywords record);

    int updateByPrimaryKey(SkKeywords record);
}