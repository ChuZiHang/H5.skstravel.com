package com.skstravel.common.service.impl;

import com.skstravel.common.mapper.sksports2.SkUsersMapper;
import com.skstravel.common.model.sksports2.SkUsers;
import com.skstravel.common.model.sksports2.SkUsersExample;
import com.skstravel.common.service.SkUsersService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by qw on 2017/12/20.
 */
public class SkUsersServiceImpl implements SkUsersService {

    @Autowired
    private SkUsersMapper skUsersMapper;
    @Override
    public long countByExample(SkUsersExample example) {
        return skUsersMapper.countByExample(example);
    }

    @Override
    public int insert(SkUsers record) {
        return skUsersMapper.insert(record);
    }

    @Override
    public int insertSelective(SkUsers record) {
        return skUsersMapper.insertSelective(record);
    }

    @Override
    public List<SkUsers> selectByExampleWithBLOBs(SkUsersExample example) {
        return skUsersMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<SkUsers> selectByExample(SkUsersExample example) {
        return skUsersMapper.selectByExample(example);
    }

    @Override
    public SkUsers selectByPrimaryKey(Integer userId) {
        return skUsersMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkUsers record) {
        return skUsersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkUsers record) {
        return skUsersMapper.updateByPrimaryKeyWithBLOBs(record);
    }
}
