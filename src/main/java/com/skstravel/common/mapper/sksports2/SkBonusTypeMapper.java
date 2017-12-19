package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBonusType;
import com.skstravel.common.model.sksports2.SkBonusTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBonusTypeMapper {
    long countByExample(SkBonusTypeExample example);

    int deleteByExample(SkBonusTypeExample example);

    int deleteByPrimaryKey(Short typeId);

    int insert(SkBonusType record);

    int insertSelective(SkBonusType record);

    List<SkBonusType> selectByExample(SkBonusTypeExample example);

    SkBonusType selectByPrimaryKey(Short typeId);

    int updateByExampleSelective(@Param("record") SkBonusType record, @Param("example") SkBonusTypeExample example);

    int updateByExample(@Param("record") SkBonusType record, @Param("example") SkBonusTypeExample example);

    int updateByPrimaryKeySelective(SkBonusType record);

    int updateByPrimaryKey(SkBonusType record);
}