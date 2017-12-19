package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBannerPlace;
import com.skstravel.common.model.sksports2.SkBannerPlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBannerPlaceMapper {
    long countByExample(SkBannerPlaceExample example);

    int deleteByExample(SkBannerPlaceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkBannerPlace record);

    int insertSelective(SkBannerPlace record);

    List<SkBannerPlace> selectByExample(SkBannerPlaceExample example);

    SkBannerPlace selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkBannerPlace record, @Param("example") SkBannerPlaceExample example);

    int updateByExample(@Param("record") SkBannerPlace record, @Param("example") SkBannerPlaceExample example);

    int updateByPrimaryKeySelective(SkBannerPlace record);

    int updateByPrimaryKey(SkBannerPlace record);
}