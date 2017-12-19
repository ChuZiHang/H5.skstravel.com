package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserAddress;
import com.skstravel.common.model.sksports2.SkUserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserAddressMapper {
    long countByExample(SkUserAddressExample example);

    int deleteByExample(SkUserAddressExample example);

    int deleteByPrimaryKey(Integer addressId);

    int insert(SkUserAddress record);

    int insertSelective(SkUserAddress record);

    List<SkUserAddress> selectByExample(SkUserAddressExample example);

    SkUserAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") SkUserAddress record, @Param("example") SkUserAddressExample example);

    int updateByExample(@Param("record") SkUserAddress record, @Param("example") SkUserAddressExample example);

    int updateByPrimaryKeySelective(SkUserAddress record);

    int updateByPrimaryKey(SkUserAddress record);
}