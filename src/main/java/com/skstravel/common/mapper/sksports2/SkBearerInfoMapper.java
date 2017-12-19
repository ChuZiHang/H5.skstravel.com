package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBearerInfo;
import com.skstravel.common.model.sksports2.SkBearerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBearerInfoMapper {
    long countByExample(SkBearerInfoExample example);

    int deleteByExample(SkBearerInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkBearerInfo record);

    int insertSelective(SkBearerInfo record);

    List<SkBearerInfo> selectByExample(SkBearerInfoExample example);

    SkBearerInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkBearerInfo record, @Param("example") SkBearerInfoExample example);

    int updateByExample(@Param("record") SkBearerInfo record, @Param("example") SkBearerInfoExample example);

    int updateByPrimaryKeySelective(SkBearerInfo record);

    int updateByPrimaryKey(SkBearerInfo record);
}