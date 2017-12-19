package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkNumTeam;
import com.skstravel.common.model.sksports2.SkNumTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkNumTeamMapper {
    long countByExample(SkNumTeamExample example);

    int deleteByExample(SkNumTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkNumTeam record);

    int insertSelective(SkNumTeam record);

    List<SkNumTeam> selectByExample(SkNumTeamExample example);

    SkNumTeam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkNumTeam record, @Param("example") SkNumTeamExample example);

    int updateByExample(@Param("record") SkNumTeam record, @Param("example") SkNumTeamExample example);

    int updateByPrimaryKeySelective(SkNumTeam record);

    int updateByPrimaryKey(SkNumTeam record);
}