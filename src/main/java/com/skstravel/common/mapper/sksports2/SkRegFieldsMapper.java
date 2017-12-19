package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkRegFields;
import com.skstravel.common.model.sksports2.SkRegFieldsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkRegFieldsMapper {
    long countByExample(SkRegFieldsExample example);

    int deleteByExample(SkRegFieldsExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(SkRegFields record);

    int insertSelective(SkRegFields record);

    List<SkRegFields> selectByExample(SkRegFieldsExample example);

    SkRegFields selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") SkRegFields record, @Param("example") SkRegFieldsExample example);

    int updateByExample(@Param("record") SkRegFields record, @Param("example") SkRegFieldsExample example);

    int updateByPrimaryKeySelective(SkRegFields record);

    int updateByPrimaryKey(SkRegFields record);
}