package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkNav;
import com.skstravel.common.model.sksports2.SkNavExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkNavMapper {
    long countByExample(SkNavExample example);

    int deleteByExample(SkNavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkNav record);

    int insertSelective(SkNav record);

    List<SkNav> selectByExample(SkNavExample example);

    SkNav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkNav record, @Param("example") SkNavExample example);

    int updateByExample(@Param("record") SkNav record, @Param("example") SkNavExample example);

    int updateByPrimaryKeySelective(SkNav record);

    int updateByPrimaryKey(SkNav record);
}