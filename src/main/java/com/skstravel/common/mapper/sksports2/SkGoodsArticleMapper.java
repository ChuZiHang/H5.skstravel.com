package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoodsArticleExample;
import com.skstravel.common.model.sksports2.SkGoodsArticleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsArticleMapper {
    long countByExample(SkGoodsArticleExample example);

    int deleteByExample(SkGoodsArticleExample example);

    int deleteByPrimaryKey(SkGoodsArticleKey key);

    int insert(SkGoodsArticleKey record);

    int insertSelective(SkGoodsArticleKey record);

    List<SkGoodsArticleKey> selectByExample(SkGoodsArticleExample example);

    int updateByExampleSelective(@Param("record") SkGoodsArticleKey record, @Param("example") SkGoodsArticleExample example);

    int updateByExample(@Param("record") SkGoodsArticleKey record, @Param("example") SkGoodsArticleExample example);
}