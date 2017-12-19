package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkMailTemplates;
import com.skstravel.common.model.sksports2.SkMailTemplatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkMailTemplatesMapper {
    long countByExample(SkMailTemplatesExample example);

    int deleteByExample(SkMailTemplatesExample example);

    int deleteByPrimaryKey(Boolean templateId);

    int insert(SkMailTemplates record);

    int insertSelective(SkMailTemplates record);

    List<SkMailTemplates> selectByExampleWithBLOBs(SkMailTemplatesExample example);

    List<SkMailTemplates> selectByExample(SkMailTemplatesExample example);

    SkMailTemplates selectByPrimaryKey(Boolean templateId);

    int updateByExampleSelective(@Param("record") SkMailTemplates record, @Param("example") SkMailTemplatesExample example);

    int updateByExampleWithBLOBs(@Param("record") SkMailTemplates record, @Param("example") SkMailTemplatesExample example);

    int updateByExample(@Param("record") SkMailTemplates record, @Param("example") SkMailTemplatesExample example);

    int updateByPrimaryKeySelective(SkMailTemplates record);

    int updateByPrimaryKeyWithBLOBs(SkMailTemplates record);

    int updateByPrimaryKey(SkMailTemplates record);
}