package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkContract;
import com.skstravel.common.model.sksports2.SkContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkContractMapper {
    long countByExample(SkContractExample example);

    int deleteByExample(SkContractExample example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(SkContract record);

    int insertSelective(SkContract record);

    List<SkContract> selectByExample(SkContractExample example);

    SkContract selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") SkContract record, @Param("example") SkContractExample example);

    int updateByExample(@Param("record") SkContract record, @Param("example") SkContractExample example);

    int updateByPrimaryKeySelective(SkContract record);

    int updateByPrimaryKey(SkContract record);
}