package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBill;
import com.skstravel.common.model.sksports2.SkBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBillMapper {
    long countByExample(SkBillExample example);

    int deleteByExample(SkBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(SkBill record);

    int insertSelective(SkBill record);

    List<SkBill> selectByExample(SkBillExample example);

    SkBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") SkBill record, @Param("example") SkBillExample example);

    int updateByExample(@Param("record") SkBill record, @Param("example") SkBillExample example);

    int updateByPrimaryKeySelective(SkBill record);

    int updateByPrimaryKey(SkBill record);
}