package com.skstravel.common.mapper.sksports2;

import com.skstravel.common.model.sksports2.SkOrderTicket;
import com.skstravel.common.model.sksports2.SkOrderTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderTicketMapper {
    long countByExample(SkOrderTicketExample example);

    int deleteByExample(SkOrderTicketExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(SkOrderTicket record);

    int insertSelective(SkOrderTicket record);

    List<SkOrderTicket> selectByExample(SkOrderTicketExample example);

    SkOrderTicket selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") SkOrderTicket record, @Param("example") SkOrderTicketExample example);

    int updateByExample(@Param("record") SkOrderTicket record, @Param("example") SkOrderTicketExample example);

    int updateByPrimaryKeySelective(SkOrderTicket record);

    int updateByPrimaryKey(SkOrderTicket record);
}