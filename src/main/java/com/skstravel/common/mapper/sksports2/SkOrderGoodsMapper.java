package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderGoods;
import com.skstravel.common.model.sksports2.SkOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderGoodsMapper {
    long countByExample(SkOrderGoodsExample example);

    int deleteByExample(SkOrderGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkOrderGoods record);

    int insertSelective(SkOrderGoods record);

    List<SkOrderGoods> selectByExampleWithBLOBs(SkOrderGoodsExample example);

    List<SkOrderGoods> selectByExample(SkOrderGoodsExample example);

    SkOrderGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkOrderGoods record, @Param("example") SkOrderGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SkOrderGoods record, @Param("example") SkOrderGoodsExample example);

    int updateByExample(@Param("record") SkOrderGoods record, @Param("example") SkOrderGoodsExample example);

    int updateByPrimaryKeySelective(SkOrderGoods record);

    int updateByPrimaryKeyWithBLOBs(SkOrderGoods record);

    int updateByPrimaryKey(SkOrderGoods record);
}