package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUsersMapper {
    long countByExample(SkUsersExample example);

    int deleteByExample(SkUsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SkUsers record);

    int insertSelective(SkUsers record);

    List<SkUsers> selectByExampleWithBLOBs(SkUsersExample example);

    List<SkUsers> selectByExample(SkUsersExample example);

    SkUsers selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SkUsers record, @Param("example") SkUsersExample example);

    int updateByExampleWithBLOBs(@Param("record") SkUsers record, @Param("example") SkUsersExample example);

    int updateByExample(@Param("record") SkUsers record, @Param("example") SkUsersExample example);

    int updateByPrimaryKeySelective(SkUsers record);

    int updateByPrimaryKeyWithBLOBs(SkUsers record);

    int updateByPrimaryKey(SkUsers record);
}