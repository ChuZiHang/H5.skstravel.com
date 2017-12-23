package com.skstravel.common.service.impl;

import com.skstravel.common.mapper.sksports2.SkUsersZhaohangMapper;
import com.skstravel.common.model.sksports2.SkUsersZhaohang;
import com.skstravel.common.model.sksports2.SkUsersZhaohangExample;
import com.skstravel.common.service.SkUsersZhaohangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qw on 2017/12/23.
 */
@Service("skUsersZhaohangService")
public class SkUsersZhaohangServiceImpl implements SkUsersZhaohangService {

    @Autowired
    private SkUsersZhaohangMapper skUsersZhaohangMapper;
    @Override
    public int insertSelective(SkUsersZhaohang record) {
        return skUsersZhaohangMapper.insertSelective(record);
    }

    @Override
    public List<SkUsersZhaohang> selectByExample(SkUsersZhaohangExample example) {
        return skUsersZhaohangMapper.selectByExample(example);
    }

    @Override
    public SkUsersZhaohang selectByPrimaryKey(Integer id) {
        return skUsersZhaohangMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SkUsersZhaohang record) {
        return skUsersZhaohangMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkUsersZhaohang record) {
        return skUsersZhaohangMapper.updateByPrimaryKey(record);
    }
}
