package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkAirSpaceInfo;
import com.skstravel.common.model.sksports2.SkAirSpaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkAirSpaceInfoMapper {
    long countByExample(SkAirSpaceInfoExample example);

    int deleteByExample(SkAirSpaceInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkAirSpaceInfo record);

    int insertSelective(SkAirSpaceInfo record);

    List<SkAirSpaceInfo> selectByExample(SkAirSpaceInfoExample example);

    SkAirSpaceInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkAirSpaceInfo record, @Param("example") SkAirSpaceInfoExample example);

    int updateByExample(@Param("record") SkAirSpaceInfo record, @Param("example") SkAirSpaceInfoExample example);

    int updateByPrimaryKeySelective(SkAirSpaceInfo record);

    int updateByPrimaryKey(SkAirSpaceInfo record);
}