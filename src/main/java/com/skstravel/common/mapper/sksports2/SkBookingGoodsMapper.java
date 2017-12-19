package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBookingGoods;
import com.skstravel.common.model.sksports2.SkBookingGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBookingGoodsMapper {
    long countByExample(SkBookingGoodsExample example);

    int deleteByExample(SkBookingGoodsExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkBookingGoods record);

    int insertSelective(SkBookingGoods record);

    List<SkBookingGoods> selectByExample(SkBookingGoodsExample example);

    SkBookingGoods selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkBookingGoods record, @Param("example") SkBookingGoodsExample example);

    int updateByExample(@Param("record") SkBookingGoods record, @Param("example") SkBookingGoodsExample example);

    int updateByPrimaryKeySelective(SkBookingGoods record);

    int updateByPrimaryKey(SkBookingGoods record);
}