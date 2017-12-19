package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkColorManage;
import com.skstravel.common.model.sksports2.SkColorManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkColorManageMapper {
    long countByExample(SkColorManageExample example);

    int deleteByExample(SkColorManageExample example);

    int deleteByPrimaryKey(Integer colorId);

    int insert(SkColorManage record);

    int insertSelective(SkColorManage record);

    List<SkColorManage> selectByExample(SkColorManageExample example);

    SkColorManage selectByPrimaryKey(Integer colorId);

    int updateByExampleSelective(@Param("record") SkColorManage record, @Param("example") SkColorManageExample example);

    int updateByExample(@Param("record") SkColorManage record, @Param("example") SkColorManageExample example);

    int updateByPrimaryKeySelective(SkColorManage record);

    int updateByPrimaryKey(SkColorManage record);
}