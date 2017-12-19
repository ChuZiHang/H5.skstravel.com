package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkSkuNumTrace;
import com.skstravel.common.model.sksports2.SkSkuNumTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkSkuNumTraceMapper {
    long countByExample(SkSkuNumTraceExample example);

    int deleteByExample(SkSkuNumTraceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkSkuNumTrace record);

    int insertSelective(SkSkuNumTrace record);

    List<SkSkuNumTrace> selectByExample(SkSkuNumTraceExample example);

    SkSkuNumTrace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkSkuNumTrace record, @Param("example") SkSkuNumTraceExample example);

    int updateByExample(@Param("record") SkSkuNumTrace record, @Param("example") SkSkuNumTraceExample example);

    int updateByPrimaryKeySelective(SkSkuNumTrace record);

    int updateByPrimaryKey(SkSkuNumTrace record);
}