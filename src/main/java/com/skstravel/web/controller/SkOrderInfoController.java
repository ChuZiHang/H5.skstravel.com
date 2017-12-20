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
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.plugin.Page;
import com.skstravel.common.plugin.Pager;
import com.skstravel.common.plugin.PagerService;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.common.utils.ParamUtils;
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
        
        int pageNo = ParamUtils.getIntParameter(request, "pageNo",1);
        
        SkOrderInfoExample skOrderInfoExample = new SkOrderInfoExample();
        SkOrderInfoExample.Criteria criteria = skOrderInfoExample.createCriteria();
        

        long total = skOrderInfoService.countByExample(skOrderInfoExample);
        int pageSize = 10;
        Page page = new Page();
        page.setTotal(total);
        page.setLimit(pageSize);
        page.setNo(pageNo);
        skOrderInfoExample.setPage(page);
        Pager pager = PagerService.getPager(pageNo, total, pageSize, 5);
        
        
        List<SkOrderInfo> list = skOrderInfoService.selectByExample(skOrderInfoExample);
        model.addAttribute("orderList", list);
        return param ;
    }
    
    @RequestMapping("/getorderinfo")
    public String getorderinfo(HttpServletRequest request, Model model) {
        
        int orderId = ParamUtils.getIntParameter(request, "orderId",1);
        
        
        SkOrderInfoExample skOrderInfoExample = new SkOrderInfoExample();
        skOrderInfoExample.createCriteria().andOrderIdEqualTo(orderId);
        
        SkOrderInfo orderInfo = skOrderInfoService.selectByPrimaryKey(orderId);
        model.addAttribute("order", orderInfo);
        return "myOrderDetail" ;
    }
}
