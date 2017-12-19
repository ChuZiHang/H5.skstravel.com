package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkCategory;
import com.skstravel.common.model.sksports2.SkCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCategoryMapper {
    long countByExample(SkCategoryExample example);

    int deleteByExample(SkCategoryExample example);

    int deleteByPrimaryKey(Short catId);

    int insert(SkCategory record);

    int insertSelective(SkCategory record);

    List<SkCategory> selectByExample(SkCategoryExample example);

    SkCategory selectByPrimaryKey(Short catId);

    int updateByExampleSelective(@Param("record") SkCategory record, @Param("example") SkCategoryExample example);

    int updateByExample(@Param("record") SkCategory record, @Param("example") SkCategoryExample example);

    int updateByPrimaryKeySelective(SkCategory record);

    int updateByPrimaryKey(SkCategory record);
}