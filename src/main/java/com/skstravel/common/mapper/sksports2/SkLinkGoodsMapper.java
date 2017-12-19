package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkLinkGoods;
import com.skstravel.common.model.sksports2.SkLinkGoodsExample;
import com.skstravel.common.model.sksports2.SkLinkGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkLinkGoodsMapper {
    long countByExample(SkLinkGoodsExample example);

    int deleteByExample(SkLinkGoodsExample example);

    int deleteByPrimaryKey(SkLinkGoodsKey key);

    int insert(SkLinkGoods record);

    int insertSelective(SkLinkGoods record);

    List<SkLinkGoods> selectByExample(SkLinkGoodsExample example);

    SkLinkGoods selectByPrimaryKey(SkLinkGoodsKey key);

    int updateByExampleSelective(@Param("record") SkLinkGoods record, @Param("example") SkLinkGoodsExample example);

    int updateByExample(@Param("record") SkLinkGoods record, @Param("example") SkLinkGoodsExample example);

    int updateByPrimaryKeySelective(SkLinkGoods record);

    int updateByPrimaryKey(SkLinkGoods record);
}