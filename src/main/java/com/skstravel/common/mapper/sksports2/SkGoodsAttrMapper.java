package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoodsAttr;
import com.skstravel.common.model.sksports2.SkGoodsAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsAttrMapper {
    long countByExample(SkGoodsAttrExample example);

    int deleteByExample(SkGoodsAttrExample example);

    int deleteByPrimaryKey(Integer goodsAttrId);

    int insert(SkGoodsAttr record);

    int insertSelective(SkGoodsAttr record);

    List<SkGoodsAttr> selectByExampleWithBLOBs(SkGoodsAttrExample example);

    List<SkGoodsAttr> selectByExample(SkGoodsAttrExample example);

    SkGoodsAttr selectByPrimaryKey(Integer goodsAttrId);

    int updateByExampleSelective(@Param("record") SkGoodsAttr record, @Param("example") SkGoodsAttrExample example);

    int updateByExampleWithBLOBs(@Param("record") SkGoodsAttr record, @Param("example") SkGoodsAttrExample example);

    int updateByExample(@Param("record") SkGoodsAttr record, @Param("example") SkGoodsAttrExample example);

    int updateByPrimaryKeySelective(SkGoodsAttr record);

    int updateByPrimaryKeyWithBLOBs(SkGoodsAttr record);

    int updateByPrimaryKey(SkGoodsAttr record);
}