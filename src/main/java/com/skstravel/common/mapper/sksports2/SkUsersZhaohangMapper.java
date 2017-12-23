package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUsersZhaohang;
import com.skstravel.common.model.sksports2.SkUsersZhaohangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUsersZhaohangMapper {
    long countByExample(SkUsersZhaohangExample example);

    int deleteByExample(SkUsersZhaohangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkUsersZhaohang record);

    int insertSelective(SkUsersZhaohang record);

    List<SkUsersZhaohang> selectByExample(SkUsersZhaohangExample example);

    SkUsersZhaohang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkUsersZhaohang record, @Param("example") SkUsersZhaohangExample example);

    int updateByExample(@Param("record") SkUsersZhaohang record, @Param("example") SkUsersZhaohangExample example);

    int updateByPrimaryKeySelective(SkUsersZhaohang record);

    int updateByPrimaryKey(SkUsersZhaohang record);
}