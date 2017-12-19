package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoodsCatExample;
import com.skstravel.common.model.sksports2.SkGoodsCatKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsCatMapper {
    long countByExample(SkGoodsCatExample example);

    int deleteByExample(SkGoodsCatExample example);

    int deleteByPrimaryKey(SkGoodsCatKey key);

    int insert(SkGoodsCatKey record);

    int insertSelective(SkGoodsCatKey record);

    List<SkGoodsCatKey> selectByExample(SkGoodsCatExample example);

    int updateByExampleSelective(@Param("record") SkGoodsCatKey record, @Param("example") SkGoodsCatExample example);

    int updateByExample(@Param("record") SkGoodsCatKey record, @Param("example") SkGoodsCatExample example);
}