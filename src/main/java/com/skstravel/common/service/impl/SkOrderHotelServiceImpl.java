package com.skstravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.SkOrderHotelMapper;
import com.skstravel.common.model.sksports2.SkOrderHotel;
import com.skstravel.common.model.sksports2.SkOrderHotelExample;
import com.skstravel.common.service.ISkOrderHotelService;
@Service
public class SkOrderHotelServiceImpl implements ISkOrderHotelService {
    
    @Autowired
    private SkOrderHotelMapper skOrderHotelMapper;

    @Override
    public long countByExample(SkOrderHotelExample example) {
        return skOrderHotelMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkOrderHotel record) {
        // TODO Auto-generated method stub
        return skOrderHotelMapper.insertSelective(record);
    }

    @Override
    public List<SkOrderHotel> selectByExample(SkOrderHotelExample example) {
        // TODO Auto-generated method stub
        return skOrderHotelMapper.selectByExample(example);
    }

    @Override
    public SkOrderHotel selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skOrderHotelMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkOrderHotel record) {
        // TODO Auto-generated method stub
        return skOrderHotelMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(SkOrderHotel record) {
        // TODO Auto-generated method stub
        return skOrderHotelMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkOrderHotel> selectByExampleWithBLOBs(SkOrderHotelExample example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkOrderHotel record) {
        // TODO Auto-generated method stub
        return 0;
    }

	

}
