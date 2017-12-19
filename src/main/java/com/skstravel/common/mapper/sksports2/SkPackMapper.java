package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkPack;
import com.skstravel.common.model.sksports2.SkPackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkPackMapper {
    long countByExample(SkPackExample example);

    int deleteByExample(SkPackExample example);

    int deleteByPrimaryKey(Byte packId);

    int insert(SkPack record);

    int insertSelective(SkPack record);

    List<SkPack> selectByExample(SkPackExample example);

    SkPack selectByPrimaryKey(Byte packId);

    int updateByExampleSelective(@Param("record") SkPack record, @Param("example") SkPackExample example);

    int updateByExample(@Param("record") SkPack record, @Param("example") SkPackExample example);

    int updateByPrimaryKeySelective(SkPack record);

    int updateByPrimaryKey(SkPack record);
}