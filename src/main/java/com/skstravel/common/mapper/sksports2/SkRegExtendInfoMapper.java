package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkRegExtendInfo;
import com.skstravel.common.model.sksports2.SkRegExtendInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkRegExtendInfoMapper {
    long countByExample(SkRegExtendInfoExample example);

    int deleteByExample(SkRegExtendInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkRegExtendInfo record);

    int insertSelective(SkRegExtendInfo record);

    List<SkRegExtendInfo> selectByExampleWithBLOBs(SkRegExtendInfoExample example);

    List<SkRegExtendInfo> selectByExample(SkRegExtendInfoExample example);

    SkRegExtendInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkRegExtendInfo record, @Param("example") SkRegExtendInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SkRegExtendInfo record, @Param("example") SkRegExtendInfoExample example);

    int updateByExample(@Param("record") SkRegExtendInfo record, @Param("example") SkRegExtendInfoExample example);

    int updateByPrimaryKeySelective(SkRegExtendInfo record);

    int updateByPrimaryKeyWithBLOBs(SkRegExtendInfo record);

    int updateByPrimaryKey(SkRegExtendInfo record);
}