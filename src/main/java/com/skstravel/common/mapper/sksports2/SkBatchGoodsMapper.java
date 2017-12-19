package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBatchGoods;
import com.skstravel.common.model.sksports2.SkBatchGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBatchGoodsMapper {
    long countByExample(SkBatchGoodsExample example);

    int deleteByExample(SkBatchGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkBatchGoods record);

    int insertSelective(SkBatchGoods record);

    List<SkBatchGoods> selectByExample(SkBatchGoodsExample example);

    SkBatchGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkBatchGoods record, @Param("example") SkBatchGoodsExample example);

    int updateByExample(@Param("record") SkBatchGoods record, @Param("example") SkBatchGoodsExample example);

    int updateByPrimaryKeySelective(SkBatchGoods record);

    int updateByPrimaryKey(SkBatchGoods record);
}