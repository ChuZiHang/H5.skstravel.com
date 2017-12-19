package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBatch;
import com.skstravel.common.model.sksports2.SkBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBatchMapper {
    long countByExample(SkBatchExample example);

    int deleteByExample(SkBatchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkBatch record);

    int insertSelective(SkBatch record);

    List<SkBatch> selectByExample(SkBatchExample example);

    SkBatch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkBatch record, @Param("example") SkBatchExample example);

    int updateByExample(@Param("record") SkBatch record, @Param("example") SkBatchExample example);

    int updateByPrimaryKeySelective(SkBatch record);

    int updateByPrimaryKey(SkBatch record);
}