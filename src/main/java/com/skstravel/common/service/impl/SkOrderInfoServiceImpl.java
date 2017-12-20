package com.skstravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.MatcheMapper;
import com.skstravel.common.mapper.sksports2.SkOrderInfoMapper;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;
@Service
public class SkOrderInfoServiceImpl implements ISkOrderInfoService {
    
    @Autowired
    private SkOrderInfoMapper skOrderInfoMapper;

    @Override
    public long countByExample(SkOrderInfoExample example) {
        return skOrderInfoMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<SkOrderInfo> selectByExampleWithBLOBs(SkOrderInfoExample example) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<SkOrderInfo> selectByExample(SkOrderInfoExample example) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.selectByExample(example);
    }

    @Override
    public SkOrderInfo selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(SkOrderInfo record) {
        // TODO Auto-generated method stub
        return skOrderInfoMapper.updateByPrimaryKey(record);
    }

	

}
