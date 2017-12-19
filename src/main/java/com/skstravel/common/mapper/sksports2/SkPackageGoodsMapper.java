package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkPackageGoods;
import com.skstravel.common.model.sksports2.SkPackageGoodsExample;
import com.skstravel.common.model.sksports2.SkPackageGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkPackageGoodsMapper {
    long countByExample(SkPackageGoodsExample example);

    int deleteByExample(SkPackageGoodsExample example);

    int deleteByPrimaryKey(SkPackageGoodsKey key);

    int insert(SkPackageGoods record);

    int insertSelective(SkPackageGoods record);

    List<SkPackageGoods> selectByExample(SkPackageGoodsExample example);

    SkPackageGoods selectByPrimaryKey(SkPackageGoodsKey key);

    int updateByExampleSelective(@Param("record") SkPackageGoods record, @Param("example") SkPackageGoodsExample example);

    int updateByExample(@Param("record") SkPackageGoods record, @Param("example") SkPackageGoodsExample example);

    int updateByPrimaryKeySelective(SkPackageGoods record);

    int updateByPrimaryKey(SkPackageGoods record);
}