package com.skstravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.SkHotelMapper;
import com.skstravel.common.model.sksports2.SkHotel;
import com.skstravel.common.model.sksports2.SkHotelExample;
import com.skstravel.common.model.sksports2.SkOrderHotel;
import com.skstravel.common.service.ISkHotelService;
@Service
public class SkHotelServiceImpl implements ISkHotelService {
    
    @Autowired
    private SkHotelMapper skHotelMapper;

    @Override
    public long countByExample(SkHotelExample example) {
        return skHotelMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkHotel record) {
        // TODO Auto-generated method stub
        return skHotelMapper.insertSelective(record);
    }

    @Override
    public List<SkHotel> selectByExample(SkHotelExample example) {
        // TODO Auto-generated method stub
        return skHotelMapper.selectByExample(example);
    }

    @Override
    public SkHotel selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skHotelMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkHotel record) {
        // TODO Auto-generated method stub
        return skHotelMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(SkHotel record) {
        // TODO Auto-generated method stub
        return skHotelMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkHotel> selectByExampleWithBLOBs(SkHotelExample example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkHotel record) {
        // TODO Auto-generated method stub
        return 0;
    }

	

}
