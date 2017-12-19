package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserBonus;
import com.skstravel.common.model.sksports2.SkUserBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserBonusMapper {
    long countByExample(SkUserBonusExample example);

    int deleteByExample(SkUserBonusExample example);

    int deleteByPrimaryKey(Integer bonusId);

    int insert(SkUserBonus record);

    int insertSelective(SkUserBonus record);

    List<SkUserBonus> selectByExample(SkUserBonusExample example);

    SkUserBonus selectByPrimaryKey(Integer bonusId);

    int updateByExampleSelective(@Param("record") SkUserBonus record, @Param("example") SkUserBonusExample example);

    int updateByExample(@Param("record") SkUserBonus record, @Param("example") SkUserBonusExample example);

    int updateByPrimaryKeySelective(SkUserBonus record);

    int updateByPrimaryKey(SkUserBonus record);
}