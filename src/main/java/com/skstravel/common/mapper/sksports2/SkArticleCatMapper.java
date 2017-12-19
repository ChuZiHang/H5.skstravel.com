package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkArticleCat;
import com.skstravel.common.model.sksports2.SkArticleCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkArticleCatMapper {
    long countByExample(SkArticleCatExample example);

    int deleteByExample(SkArticleCatExample example);

    int deleteByPrimaryKey(Short catId);

    int insert(SkArticleCat record);

    int insertSelective(SkArticleCat record);

    List<SkArticleCat> selectByExample(SkArticleCatExample example);

    SkArticleCat selectByPrimaryKey(Short catId);

    int updateByExampleSelective(@Param("record") SkArticleCat record, @Param("example") SkArticleCatExample example);

    int updateByExample(@Param("record") SkArticleCat record, @Param("example") SkArticleCatExample example);

    int updateByPrimaryKeySelective(SkArticleCat record);

    int updateByPrimaryKey(SkArticleCat record);
}