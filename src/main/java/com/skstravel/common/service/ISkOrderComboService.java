package com.skstravel.common.service;

import java.util.List;


import com.skstravel.common.model.sksports2.SkOrderCombo;
import com.skstravel.common.model.sksports2.SkOrderComboExample;
import com.skstravel.common.model.sksports2.SkOrderInfo;

public interface ISkOrderComboService {
    
    long countByExample(SkOrderComboExample example);

    int insertSelective(SkOrderCombo record);

    List<SkOrderCombo> selectByExampleWithBLOBs(SkOrderComboExample example);

    List<SkOrderCombo> selectByExample(SkOrderComboExample example);

    SkOrderCombo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkOrderCombo record);

    int updateByPrimaryKeyWithBLOBs(SkOrderCombo record);

    int updateByPrimaryKey(SkOrderCombo record);

}
