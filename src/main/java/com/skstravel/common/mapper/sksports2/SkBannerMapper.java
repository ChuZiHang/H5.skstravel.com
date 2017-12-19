package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkBanner;
import com.skstravel.common.model.sksports2.SkBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkBannerMapper {
    long countByExample(SkBannerExample example);

    int deleteByExample(SkBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkBanner record);

    int insertSelective(SkBanner record);

    List<SkBanner> selectByExample(SkBannerExample example);

    SkBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkBanner record, @Param("example") SkBannerExample example);

    int updateByExample(@Param("record") SkBanner record, @Param("example") SkBannerExample example);

    int updateByPrimaryKeySelective(SkBanner record);

    int updateByPrimaryKey(SkBanner record);
}