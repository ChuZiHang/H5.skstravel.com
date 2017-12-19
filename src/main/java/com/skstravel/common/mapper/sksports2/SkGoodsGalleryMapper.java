package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoodsGallery;
import com.skstravel.common.model.sksports2.SkGoodsGalleryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsGalleryMapper {
    long countByExample(SkGoodsGalleryExample example);

    int deleteByExample(SkGoodsGalleryExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(SkGoodsGallery record);

    int insertSelective(SkGoodsGallery record);

    List<SkGoodsGallery> selectByExample(SkGoodsGalleryExample example);

    SkGoodsGallery selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") SkGoodsGallery record, @Param("example") SkGoodsGalleryExample example);

    int updateByExample(@Param("record") SkGoodsGallery record, @Param("example") SkGoodsGalleryExample example);

    int updateByPrimaryKeySelective(SkGoodsGallery record);

    int updateByPrimaryKey(SkGoodsGallery record);
}