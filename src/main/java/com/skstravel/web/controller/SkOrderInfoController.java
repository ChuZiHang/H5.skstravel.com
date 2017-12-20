package com.skstravel.web.controller;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Q_先森 on 2017/12/18.
 */
@Controller
public class SkOrderInfoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SkOrderInfoController.class);

    @Autowired
    private ISkOrderInfoService skOrderInfoService;
    

    @RequestMapping("/orderinfo/{param}")
    public String orderList(HttpServletRequest request, Model model,@PathVariable String param ) {
        List<SkOrderInfo> list = skOrderInfoService.selectByExample(null);
        request.setAttribute("orderList", list);
        return param ;
    }
}
