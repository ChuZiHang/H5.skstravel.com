package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkGame;
import com.skstravel.common.model.sksports2.SkGameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGameMapper {
    long countByExample(SkGameExample example);

    int deleteByExample(SkGameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkGame record);

    int insertSelective(SkGame record);

    List<SkGame> selectByExampleWithBLOBs(SkGameExample example);

    List<SkGame> selectByExample(SkGameExample example);

    SkGame selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkGame record, @Param("example") SkGameExample example);

    int updateByExampleWithBLOBs(@Param("record") SkGame record, @Param("example") SkGameExample example);

    int updateByExample(@Param("record") SkGame record, @Param("example") SkGameExample example);

    int updateByPrimaryKeySelective(SkGame record);

    int updateByPrimaryKeyWithBLOBs(SkGame record);

    int updateByPrimaryKey(SkGame record);
}