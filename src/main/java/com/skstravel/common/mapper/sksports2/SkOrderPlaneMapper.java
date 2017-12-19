package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderPlane;
import com.skstravel.common.model.sksports2.SkOrderPlaneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderPlaneMapper {
    long countByExample(SkOrderPlaneExample example);

    int deleteByExample(SkOrderPlaneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkOrderPlane record);

    int insertSelective(SkOrderPlane record);

    List<SkOrderPlane> selectByExample(SkOrderPlaneExample example);

    SkOrderPlane selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkOrderPlane record, @Param("example") SkOrderPlaneExample example);

    int updateByExample(@Param("record") SkOrderPlane record, @Param("example") SkOrderPlaneExample example);

    int updateByPrimaryKeySelective(SkOrderPlane record);

    int updateByPrimaryKey(SkOrderPlane record);
}