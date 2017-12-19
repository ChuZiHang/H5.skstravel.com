package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderInfoMapper {
    long countByExample(SkOrderInfoExample example);

    int deleteByExample(SkOrderInfoExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SkOrderInfo record);

    int insertSelective(SkOrderInfo record);

    List<SkOrderInfo> selectByExampleWithBLOBs(SkOrderInfoExample example);

    List<SkOrderInfo> selectByExample(SkOrderInfoExample example);

    SkOrderInfo selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SkOrderInfo record, @Param("example") SkOrderInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SkOrderInfo record, @Param("example") SkOrderInfoExample example);

    int updateByExample(@Param("record") SkOrderInfo record, @Param("example") SkOrderInfoExample example);

    int updateByPrimaryKeySelective(SkOrderInfo record);

    int updateByPrimaryKeyWithBLOBs(SkOrderInfo record);

    int updateByPrimaryKey(SkOrderInfo record);
}