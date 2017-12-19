package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkSetMealOrder;
import com.skstravel.common.model.sksports2.SkSetMealOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkSetMealOrderMapper {
    long countByExample(SkSetMealOrderExample example);

    int deleteByExample(SkSetMealOrderExample example);

    int deleteByPrimaryKey(Integer setMealOrderId);

    int insert(SkSetMealOrder record);

    int insertSelective(SkSetMealOrder record);

    List<SkSetMealOrder> selectByExample(SkSetMealOrderExample example);

    SkSetMealOrder selectByPrimaryKey(Integer setMealOrderId);

    int updateByExampleSelective(@Param("record") SkSetMealOrder record, @Param("example") SkSetMealOrderExample example);

    int updateByExample(@Param("record") SkSetMealOrder record, @Param("example") SkSetMealOrderExample example);

    int updateByPrimaryKeySelective(SkSetMealOrder record);

    int updateByPrimaryKey(SkSetMealOrder record);
}