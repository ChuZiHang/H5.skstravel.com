package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkSportcat;
import com.skstravel.common.model.sksports2.SkSportcatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkSportcatMapper {
    long countByExample(SkSportcatExample example);

    int deleteByExample(SkSportcatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkSportcat record);

    int insertSelective(SkSportcat record);

    List<SkSportcat> selectByExample(SkSportcatExample example);

    SkSportcat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkSportcat record, @Param("example") SkSportcatExample example);

    int updateByExample(@Param("record") SkSportcat record, @Param("example") SkSportcatExample example);

    int updateByPrimaryKeySelective(SkSportcat record);

    int updateByPrimaryKey(SkSportcat record);
}