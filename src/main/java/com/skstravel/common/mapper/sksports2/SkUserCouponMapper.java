package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserCoupon;
import com.skstravel.common.model.sksports2.SkUserCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserCouponMapper {
    long countByExample(SkUserCouponExample example);

    int deleteByExample(SkUserCouponExample example);

    int deleteByPrimaryKey(Integer userCouponId);

    int insert(SkUserCoupon record);

    int insertSelective(SkUserCoupon record);

    List<SkUserCoupon> selectByExample(SkUserCouponExample example);

    SkUserCoupon selectByPrimaryKey(Integer userCouponId);

    int updateByExampleSelective(@Param("record") SkUserCoupon record, @Param("example") SkUserCouponExample example);

    int updateByExample(@Param("record") SkUserCoupon record, @Param("example") SkUserCouponExample example);

    int updateByPrimaryKeySelective(SkUserCoupon record);

    int updateByPrimaryKey(SkUserCoupon record);
}