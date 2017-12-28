package com.skstravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.SkBearerInfoMapper;
import com.skstravel.common.model.sksports2.SkBearerInfo;
import com.skstravel.common.model.sksports2.SkBearerInfoExample;
import com.skstravel.common.model.sksports2.SkHotel;
import com.skstravel.common.service.ISkBearerInfoService;
@Service
public class SkBearerInfoServiceImpl implements ISkBearerInfoService {
    
    @Autowired
    private SkBearerInfoMapper skBearerInfoMapper;

    @Override
    public long countByExample(SkBearerInfoExample example) {
        return skBearerInfoMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkBearerInfo record) {
        // TODO Auto-generated method stub
        return skBearerInfoMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return skBearerInfoMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public List<SkBearerInfo> selectByExample(SkBearerInfoExample example) {
        // TODO Auto-generated method stub
        return skBearerInfoMapper.selectByExample(example);
    }

    @Override
    public SkBearerInfo selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skBearerInfoMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkBearerInfo record) {
        // TODO Auto-generated method stub
        return skBearerInfoMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(SkBearerInfo record) {
        // TODO Auto-generated method stub
        return skBearerInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkBearerInfo> selectByExampleWithBLOBs(SkBearerInfoExample example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkBearerInfo record) {
        // TODO Auto-generated method stub
        return 0;
    }

	

}
