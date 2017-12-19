package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkMemberPrice;
import com.skstravel.common.model.sksports2.SkMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkMemberPriceMapper {
    long countByExample(SkMemberPriceExample example);

    int deleteByExample(SkMemberPriceExample example);

    int deleteByPrimaryKey(Integer priceId);

    int insert(SkMemberPrice record);

    int insertSelective(SkMemberPrice record);

    List<SkMemberPrice> selectByExample(SkMemberPriceExample example);

    SkMemberPrice selectByPrimaryKey(Integer priceId);

    int updateByExampleSelective(@Param("record") SkMemberPrice record, @Param("example") SkMemberPriceExample example);

    int updateByExample(@Param("record") SkMemberPrice record, @Param("example") SkMemberPriceExample example);

    int updateByPrimaryKeySelective(SkMemberPrice record);

    int updateByPrimaryKey(SkMemberPrice record);
}