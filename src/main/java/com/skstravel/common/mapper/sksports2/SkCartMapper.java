package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkCart;
import com.skstravel.common.model.sksports2.SkCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCartMapper {
    long countByExample(SkCartExample example);

    int deleteByExample(SkCartExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkCart record);

    int insertSelective(SkCart record);

    List<SkCart> selectByExampleWithBLOBs(SkCartExample example);

    List<SkCart> selectByExample(SkCartExample example);

    SkCart selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkCart record, @Param("example") SkCartExample example);

    int updateByExampleWithBLOBs(@Param("record") SkCart record, @Param("example") SkCartExample example);

    int updateByExample(@Param("record") SkCart record, @Param("example") SkCartExample example);

    int updateByPrimaryKeySelective(SkCart record);

    int updateByPrimaryKeyWithBLOBs(SkCart record);

    int updateByPrimaryKey(SkCart record);
}