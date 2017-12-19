package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkSkuNum;
import com.skstravel.common.model.sksports2.SkSkuNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkSkuNumMapper {
    long countByExample(SkSkuNumExample example);

    int deleteByExample(SkSkuNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkSkuNum record);

    int insertSelective(SkSkuNum record);

    List<SkSkuNum> selectByExample(SkSkuNumExample example);

    SkSkuNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkSkuNum record, @Param("example") SkSkuNumExample example);

    int updateByExample(@Param("record") SkSkuNum record, @Param("example") SkSkuNumExample example);

    int updateByPrimaryKeySelective(SkSkuNum record);

    int updateByPrimaryKey(SkSkuNum record);
}