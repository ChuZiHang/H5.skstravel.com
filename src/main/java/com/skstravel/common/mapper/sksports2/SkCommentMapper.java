package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkComment;
import com.skstravel.common.model.sksports2.SkCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkCommentMapper {
    long countByExample(SkCommentExample example);

    int deleteByExample(SkCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(SkComment record);

    int insertSelective(SkComment record);

    List<SkComment> selectByExampleWithBLOBs(SkCommentExample example);

    List<SkComment> selectByExample(SkCommentExample example);

    SkComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") SkComment record, @Param("example") SkCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") SkComment record, @Param("example") SkCommentExample example);

    int updateByExample(@Param("record") SkComment record, @Param("example") SkCommentExample example);

    int updateByPrimaryKeySelective(SkComment record);

    int updateByPrimaryKeyWithBLOBs(SkComment record);

    int updateByPrimaryKey(SkComment record);
}