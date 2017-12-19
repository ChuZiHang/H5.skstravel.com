package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkCatRecommendExample;
import com.skstravel.common.model.sksports2.SkCatRecommendKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCatRecommendMapper {
    long countByExample(SkCatRecommendExample example);

    int deleteByExample(SkCatRecommendExample example);

    int deleteByPrimaryKey(SkCatRecommendKey key);

    int insert(SkCatRecommendKey record);

    int insertSelective(SkCatRecommendKey record);

    List<SkCatRecommendKey> selectByExample(SkCatRecommendExample example);

    int updateByExampleSelective(@Param("record") SkCatRecommendKey record, @Param("example") SkCatRecommendExample example);

    int updateByExample(@Param("record") SkCatRecommendKey record, @Param("example") SkCatRecommendExample example);
}