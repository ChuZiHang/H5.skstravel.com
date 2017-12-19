package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkUserAccount;
import com.skstravel.common.model.sksports2.SkUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserAccountMapper {
    long countByExample(SkUserAccountExample example);

    int deleteByExample(SkUserAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkUserAccount record);

    int insertSelective(SkUserAccount record);

    List<SkUserAccount> selectByExample(SkUserAccountExample example);

    SkUserAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkUserAccount record, @Param("example") SkUserAccountExample example);

    int updateByExample(@Param("record") SkUserAccount record, @Param("example") SkUserAccountExample example);

    int updateByPrimaryKeySelective(SkUserAccount record);

    int updateByPrimaryKey(SkUserAccount record);
}