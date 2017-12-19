package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGroupGoods;
import com.skstravel.common.model.sksports2.SkGroupGoodsExample;
import com.skstravel.common.model.sksports2.SkGroupGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGroupGoodsMapper {
    long countByExample(SkGroupGoodsExample example);

    int deleteByExample(SkGroupGoodsExample example);

    int deleteByPrimaryKey(SkGroupGoodsKey key);

    int insert(SkGroupGoods record);

    int insertSelective(SkGroupGoods record);

    List<SkGroupGoods> selectByExample(SkGroupGoodsExample example);

    SkGroupGoods selectByPrimaryKey(SkGroupGoodsKey key);

    int updateByExampleSelective(@Param("record") SkGroupGoods record, @Param("example") SkGroupGoodsExample example);

    int updateByExample(@Param("record") SkGroupGoods record, @Param("example") SkGroupGoodsExample example);

    int updateByPrimaryKeySelective(SkGroupGoods record);

    int updateByPrimaryKey(SkGroupGoods record);
}