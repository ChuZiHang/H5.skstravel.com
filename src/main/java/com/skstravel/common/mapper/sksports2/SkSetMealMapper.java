package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkSetMeal;
import com.skstravel.common.model.sksports2.SkSetMealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkSetMealMapper {
    long countByExample(SkSetMealExample example);

    int deleteByExample(SkSetMealExample example);

    int deleteByPrimaryKey(Integer setMealId);

    int insert(SkSetMeal record);

    int insertSelective(SkSetMeal record);

    List<SkSetMeal> selectByExample(SkSetMealExample example);

    SkSetMeal selectByPrimaryKey(Integer setMealId);

    int updateByExampleSelective(@Param("record") SkSetMeal record, @Param("example") SkSetMealExample example);

    int updateByExample(@Param("record") SkSetMeal record, @Param("example") SkSetMealExample example);

    int updateByPrimaryKeySelective(SkSetMeal record);

    int updateByPrimaryKey(SkSetMeal record);
}