package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoodsType;
import com.skstravel.common.model.sksports2.SkGoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsTypeMapper {
    long countByExample(SkGoodsTypeExample example);

    int deleteByExample(SkGoodsTypeExample example);

    int deleteByPrimaryKey(Short catId);

    int insert(SkGoodsType record);

    int insertSelective(SkGoodsType record);

    List<SkGoodsType> selectByExample(SkGoodsTypeExample example);

    SkGoodsType selectByPrimaryKey(Short catId);

    int updateByExampleSelective(@Param("record") SkGoodsType record, @Param("example") SkGoodsTypeExample example);

    int updateByExample(@Param("record") SkGoodsType record, @Param("example") SkGoodsTypeExample example);

    int updateByPrimaryKeySelective(SkGoodsType record);

    int updateByPrimaryKey(SkGoodsType record);
}