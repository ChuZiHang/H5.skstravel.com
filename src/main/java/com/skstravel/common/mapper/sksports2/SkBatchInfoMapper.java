package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBatchInfo;
import com.skstravel.common.model.sksports2.SkBatchInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBatchInfoMapper {
    long countByExample(SkBatchInfoExample example);

    int deleteByExample(SkBatchInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkBatchInfo record);

    int insertSelective(SkBatchInfo record);

    List<SkBatchInfo> selectByExample(SkBatchInfoExample example);

    SkBatchInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkBatchInfo record, @Param("example") SkBatchInfoExample example);

    int updateByExample(@Param("record") SkBatchInfo record, @Param("example") SkBatchInfoExample example);

    int updateByPrimaryKeySelective(SkBatchInfo record);

    int updateByPrimaryKey(SkBatchInfo record);
}