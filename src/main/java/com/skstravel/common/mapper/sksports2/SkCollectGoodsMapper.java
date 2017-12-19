package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkCollectGoods;
import com.skstravel.common.model.sksports2.SkCollectGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCollectGoodsMapper {
    long countByExample(SkCollectGoodsExample example);

    int deleteByExample(SkCollectGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkCollectGoods record);

    int insertSelective(SkCollectGoods record);

    List<SkCollectGoods> selectByExample(SkCollectGoodsExample example);

    SkCollectGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkCollectGoods record, @Param("example") SkCollectGoodsExample example);

    int updateByExample(@Param("record") SkCollectGoods record, @Param("example") SkCollectGoodsExample example);

    int updateByPrimaryKeySelective(SkCollectGoods record);

    int updateByPrimaryKey(SkCollectGoods record);
}