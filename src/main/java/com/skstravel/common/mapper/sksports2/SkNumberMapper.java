package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkNumber;
import com.skstravel.common.model.sksports2.SkNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkNumberMapper {
    long countByExample(SkNumberExample example);

    int deleteByExample(SkNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkNumber record);

    int insertSelective(SkNumber record);

    List<SkNumber> selectByExampleWithBLOBs(SkNumberExample example);

    List<SkNumber> selectByExample(SkNumberExample example);

    SkNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkNumber record, @Param("example") SkNumberExample example);

    int updateByExampleWithBLOBs(@Param("record") SkNumber record, @Param("example") SkNumberExample example);

    int updateByExample(@Param("record") SkNumber record, @Param("example") SkNumberExample example);

    int updateByPrimaryKeySelective(SkNumber record);

    int updateByPrimaryKeyWithBLOBs(SkNumber record);

    int updateByPrimaryKey(SkNumber record);
}