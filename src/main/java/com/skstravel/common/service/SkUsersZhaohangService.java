package com.skstravel.common.service;

import com.skstravel.common.model.sksports2.SkUsersZhaohang;
import com.skstravel.common.model.sksports2.SkUsersZhaohangExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by qw on 2017/12/23.
 */
public interface SkUsersZhaohangService {

    int insertSelective(SkUsersZhaohang record);

    List<SkUsersZhaohang> selectByExample(SkUsersZhaohangExample example);

    SkUsersZhaohang selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SkUsersZhaohang record);

    int updateByPrimaryKey(SkUsersZhaohang record);
}
