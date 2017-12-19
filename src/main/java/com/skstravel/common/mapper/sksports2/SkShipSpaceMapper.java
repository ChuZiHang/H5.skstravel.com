package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkShipSpace;
import com.skstravel.common.model.sksports2.SkShipSpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkShipSpaceMapper {
    long countByExample(SkShipSpaceExample example);

    int deleteByExample(SkShipSpaceExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(SkShipSpace record);

    int insertSelective(SkShipSpace record);

    List<SkShipSpace> selectByExample(SkShipSpaceExample example);

    SkShipSpace selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") SkShipSpace record, @Param("example") SkShipSpaceExample example);

    int updateByExample(@Param("record") SkShipSpace record, @Param("example") SkShipSpaceExample example);

    int updateByPrimaryKeySelective(SkShipSpace record);

    int updateByPrimaryKey(SkShipSpace record);
}