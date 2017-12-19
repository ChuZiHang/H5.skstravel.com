package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderGoodsCancel;
import com.skstravel.common.model.sksports2.SkOrderGoodsCancelExample;
import com.skstravel.common.model.sksports2.SkOrderGoodsCancelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderGoodsCancelMapper {
    long countByExample(SkOrderGoodsCancelExample example);

    int deleteByExample(SkOrderGoodsCancelExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkOrderGoodsCancelWithBLOBs record);

    int insertSelective(SkOrderGoodsCancelWithBLOBs record);

    List<SkOrderGoodsCancelWithBLOBs> selectByExampleWithBLOBs(SkOrderGoodsCancelExample example);

    List<SkOrderGoodsCancel> selectByExample(SkOrderGoodsCancelExample example);

    SkOrderGoodsCancelWithBLOBs selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkOrderGoodsCancelWithBLOBs record, @Param("example") SkOrderGoodsCancelExample example);

    int updateByExampleWithBLOBs(@Param("record") SkOrderGoodsCancelWithBLOBs record, @Param("example") SkOrderGoodsCancelExample example);

    int updateByExample(@Param("record") SkOrderGoodsCancel record, @Param("example") SkOrderGoodsCancelExample example);

    int updateByPrimaryKeySelective(SkOrderGoodsCancelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SkOrderGoodsCancelWithBLOBs record);

    int updateByPrimaryKey(SkOrderGoodsCancel record);
}