package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoods;
import com.skstravel.common.model.sksports2.SkGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsMapper {
    long countByExample(SkGoodsExample example);

    int deleteByExample(SkGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(SkGoods record);

    int insertSelective(SkGoods record);

    List<SkGoods> selectByExampleWithBLOBs(SkGoodsExample example);

    List<SkGoods> selectByExample(SkGoodsExample example);

    SkGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") SkGoods record, @Param("example") SkGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SkGoods record, @Param("example") SkGoodsExample example);

    int updateByExample(@Param("record") SkGoods record, @Param("example") SkGoodsExample example);

    int updateByPrimaryKeySelective(SkGoods record);

    int updateByPrimaryKeyWithBLOBs(SkGoods record);

    int updateByPrimaryKey(SkGoods record);
}