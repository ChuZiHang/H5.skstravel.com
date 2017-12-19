package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkComboTicket;
import com.skstravel.common.model.sksports2.SkComboTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkComboTicketMapper {
    long countByExample(SkComboTicketExample example);

    int deleteByExample(SkComboTicketExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkComboTicket record);

    int insertSelective(SkComboTicket record);

    List<SkComboTicket> selectByExample(SkComboTicketExample example);

    SkComboTicket selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkComboTicket record, @Param("example") SkComboTicketExample example);

    int updateByExample(@Param("record") SkComboTicket record, @Param("example") SkComboTicketExample example);

    int updateByPrimaryKeySelective(SkComboTicket record);

    int updateByPrimaryKey(SkComboTicket record);
}