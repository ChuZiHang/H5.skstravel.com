package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkCard;
import com.skstravel.common.model.sksports2.SkCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCardMapper {
    long countByExample(SkCardExample example);

    int deleteByExample(SkCardExample example);

    int deleteByPrimaryKey(Byte cardId);

    int insert(SkCard record);

    int insertSelective(SkCard record);

    List<SkCard> selectByExample(SkCardExample example);

    SkCard selectByPrimaryKey(Byte cardId);

    int updateByExampleSelective(@Param("record") SkCard record, @Param("example") SkCardExample example);

    int updateByExample(@Param("record") SkCard record, @Param("example") SkCardExample example);

    int updateByPrimaryKeySelective(SkCard record);

    int updateByPrimaryKey(SkCard record);
}