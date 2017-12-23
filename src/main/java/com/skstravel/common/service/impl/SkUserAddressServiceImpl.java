package com.skstravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.SkUserAddressMapper;
import com.skstravel.common.model.sksports2.SkUserAddress;
import com.skstravel.common.model.sksports2.SkUserAddressExample;
import com.skstravel.common.service.ISkUserAddressService;
@Service
public class SkUserAddressServiceImpl implements ISkUserAddressService {
    
    @Autowired
    private SkUserAddressMapper skAddressMapper;

    @Override
    public int deleteByPrimaryKey(Integer addressId) {
        return skAddressMapper.deleteByPrimaryKey(addressId);
    }

    @Override
    public long countByExample(SkUserAddressExample example) {
        return skAddressMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkUserAddress record) {
        // TODO Auto-generated method stub
        return skAddressMapper.insertSelective(record);
    }

    @Override
    public List<SkUserAddress> selectByExample(SkUserAddressExample example) {
        // TODO Auto-generated method stub
        return skAddressMapper.selectByExample(example);
    }

    @Override
    public SkUserAddress selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skAddressMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkUserAddress record) {
        // TODO Auto-generated method stub
        return skAddressMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(SkUserAddress record) {
        // TODO Auto-generated method stub
        return skAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkUserAddress> selectByExampleWithBLOBs(SkUserAddressExample example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkUserAddress record) {
        // TODO Auto-generated method stub
        return 0;
    }

	

}
