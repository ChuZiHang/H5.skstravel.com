package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkArticle;
import com.skstravel.common.model.sksports2.SkArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkArticleMapper {
    long countByExample(SkArticleExample example);

    int deleteByExample(SkArticleExample example);

    int deleteByPrimaryKey(Integer articleId);

    int insert(SkArticle record);

    int insertSelective(SkArticle record);

    List<SkArticle> selectByExampleWithBLOBs(SkArticleExample example);

    List<SkArticle> selectByExample(SkArticleExample example);

    SkArticle selectByPrimaryKey(Integer articleId);

    int updateByExampleSelective(@Param("record") SkArticle record, @Param("example") SkArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") SkArticle record, @Param("example") SkArticleExample example);

    int updateByExample(@Param("record") SkArticle record, @Param("example") SkArticleExample example);

    int updateByPrimaryKeySelective(SkArticle record);

    int updateByPrimaryKeyWithBLOBs(SkArticle record);

    int updateByPrimaryKey(SkArticle record);
}