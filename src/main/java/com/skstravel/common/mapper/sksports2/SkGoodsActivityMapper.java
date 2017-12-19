package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGoodsActivity;
import com.skstravel.common.model.sksports2.SkGoodsActivityExample;
import com.skstravel.common.model.sksports2.SkGoodsActivityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsActivityMapper {
    long countByExample(SkGoodsActivityExample example);

    int deleteByExample(SkGoodsActivityExample example);

    int deleteByPrimaryKey(Integer actId);

    int insert(SkGoodsActivityWithBLOBs record);

    int insertSelective(SkGoodsActivityWithBLOBs record);

    List<SkGoodsActivityWithBLOBs> selectByExampleWithBLOBs(SkGoodsActivityExample example);

    List<SkGoodsActivity> selectByExample(SkGoodsActivityExample example);

    SkGoodsActivityWithBLOBs selectByPrimaryKey(Integer actId);

    int updateByExampleSelective(@Param("record") SkGoodsActivityWithBLOBs record, @Param("example") SkGoodsActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") SkGoodsActivityWithBLOBs record, @Param("example") SkGoodsActivityExample example);

    int updateByExample(@Param("record") SkGoodsActivity record, @Param("example") SkGoodsActivityExample example);

    int updateByPrimaryKeySelective(SkGoodsActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SkGoodsActivityWithBLOBs record);

    int updateByPrimaryKey(SkGoodsActivity record);
}