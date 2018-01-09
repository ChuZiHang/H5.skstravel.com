package com.skstravel.common.service;

import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersExample;
import java.util.List;

/**
 * Created by qw on 2017/12/20.
 */
public interface SkUsersService {
    long countByExample(SkUsersExample example);

    int insert(SkUsers record);

    int insertSelective(SkUsers record);

    List<SkUsers> selectByExampleWithBLOBs(SkUsersExample example);

    List<SkUsers> selectByExample(SkUsersExample example);

    SkUsers selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SkUsers record);

    int updateByPrimaryKeyWithBLOBs(SkUsers record);
}
