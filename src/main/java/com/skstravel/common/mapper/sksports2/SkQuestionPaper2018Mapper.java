package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkQuestionPaper2018;
import com.skstravel.common.model.sksports2.SkQuestionPaper2018Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkQuestionPaper2018Mapper {
    long countByExample(SkQuestionPaper2018Example example);

    int deleteByExample(SkQuestionPaper2018Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkQuestionPaper2018 record);

    int insertSelective(SkQuestionPaper2018 record);

    List<SkQuestionPaper2018> selectByExample(SkQuestionPaper2018Example example);

    SkQuestionPaper2018 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkQuestionPaper2018 record, @Param("example") SkQuestionPaper2018Example example);

    int updateByExample(@Param("record") SkQuestionPaper2018 record, @Param("example") SkQuestionPaper2018Example example);

    int updateByPrimaryKeySelective(SkQuestionPaper2018 record);

    int updateByPrimaryKey(SkQuestionPaper2018 record);
}