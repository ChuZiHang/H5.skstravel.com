package com.skstravel.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.SkOrderComboMapper;
import com.skstravel.common.model.sksports2.SkOrderCombo;
import com.skstravel.common.model.sksports2.SkOrderComboExample;
import com.skstravel.common.service.ISkOrderComboService;
@Service
public class SkOrderComboServiceImpl implements ISkOrderComboService {
    
    @Autowired
    private SkOrderComboMapper skOrderComboMapper;

    @Override
    public long countByExample(SkOrderComboExample example) {
        return skOrderComboMapper.countByExample(example);
    }

    @Override
    public int insertSelective(SkOrderCombo record) {
        // TODO Auto-generated method stub
        return skOrderComboMapper.insertSelective(record);
    }

    @Override
    public List<SkOrderCombo> selectByExample(SkOrderComboExample example) {
        // TODO Auto-generated method stub
        return skOrderComboMapper.selectByExample(example);
    }

    @Override
    public SkOrderCombo selectByPrimaryKey(Integer orderId) {
        // TODO Auto-generated method stub
        return skOrderComboMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(SkOrderCombo record) {
        // TODO Auto-generated method stub
        return skOrderComboMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(SkOrderCombo record) {
        // TODO Auto-generated method stub
        return skOrderComboMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkOrderCombo> selectByExampleWithBLOBs(SkOrderComboExample example) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SkOrderCombo record) {
        // TODO Auto-generated method stub
        return 0;
    }

	

}
