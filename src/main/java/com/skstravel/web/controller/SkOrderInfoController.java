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

import com.skstravel.common.model.sksports2.SkBearerInfo;
import com.skstravel.common.model.sksports2.SkBearerInfoExample;
import com.skstravel.common.model.sksports2.SkHotel;
import com.skstravel.common.model.sksports2.SkOrderCombo;
import com.skstravel.common.model.sksports2.SkOrderComboExample;
import com.skstravel.common.model.sksports2.SkOrderHotel;
import com.skstravel.common.model.sksports2.SkOrderHotelExample;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.model.sksports2.SkUserAddress;
import com.skstravel.common.model.sksports2.SkUserAddressExample;
import com.skstravel.common.plugin.Page;
import com.skstravel.common.plugin.Pager;
import com.skstravel.common.plugin.PagerService;
import com.skstravel.common.service.ISkBearerInfoService;
import com.skstravel.common.service.ISkHotelService;
import com.skstravel.common.service.ISkOrderComboService;
import com.skstravel.common.service.ISkOrderHotelService;
import com.skstravel.common.service.ISkOrderInfoService;
import com.skstravel.common.service.ISkUserAddressService;
import com.skstravel.common.utils.ParamUtils;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;

import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
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
    @Autowired
    private ISkOrderComboService skOrderComboService;
    @Autowired
    private ISkOrderHotelService skOrderHotelService;
    @Autowired
    private ISkHotelService skHotelService;
    @Autowired
    private ISkUserAddressService skUserAddressService; 
    @Autowired
    private ISkBearerInfoService skBearerInfoService;

    @RequestMapping("/orderinfo/{param}")
    public String orderList(HttpServletRequest request, Model model,@PathVariable String param ) {
        
        int pageNo = ParamUtils.getIntParameter(request, "pageNo",1);
        
        SkOrderInfoExample skOrderInfoExample = new SkOrderInfoExample();
        SkOrderInfoExample.Criteria criteria = skOrderInfoExample.createCriteria();
        
        //取用户id
//        String userId = null;
//        Cookie[] cookies = request.getCookies();
//        for(Cookie cookie : cookies){
//            if(cookie.getName().equals("memberId")){
//                userId = cookie.getValue();
//            }
//         }
//        skOrderInfoExample.createCriteria().andUserIdEqualTo(Integer.parseInt(userId));
        
        
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
        //查票务信息
        SkOrderComboExample skOrderComboExample = new SkOrderComboExample();
        skOrderComboExample.createCriteria().andOrderIdEqualTo(orderInfo.getOrderId());
        List<SkOrderCombo> coList = this.skOrderComboService.selectByExample(skOrderComboExample);
        SkOrderCombo skOrderCombo = new SkOrderCombo();
        if(!coList.isEmpty()){
            skOrderCombo = coList.get(0);
        }
        //查酒店
        SkOrderHotelExample skOrderHotelExample = new SkOrderHotelExample();
        skOrderHotelExample.createCriteria().andOrderIdEqualTo(orderInfo.getOrderId());
        SkOrderHotel orderHotel = new SkOrderHotel();
        List<SkOrderHotel> SkOrderHotelList = this.skOrderHotelService.selectByExample(skOrderHotelExample);
        if(!SkOrderHotelList.isEmpty()){
            orderHotel = SkOrderHotelList.get(0);
        }
        SkHotel hotel = this.skHotelService.selectByPrimaryKey(orderHotel.getHotelId());
        //查地址
        SkUserAddressExample addressExample = new SkUserAddressExample();
        addressExample.createCriteria().andUserIdEqualTo(orderInfo.getUserId());
        SkUserAddress userAddress = new SkUserAddress();
        List<SkUserAddress> SkUserAddressList = this.skUserAddressService.selectByExample(addressExample);
        if(!SkUserAddressList.isEmpty()){
            userAddress = SkUserAddressList.get(0);
        }
        //查询护照信息
        SkBearerInfoExample skBearerInfoExample = new SkBearerInfoExample();
        skBearerInfoExample.createCriteria().andOrderIdEqualTo(orderInfo.getOrderId());
        List<SkBearerInfo> skBearerInfos = this.skBearerInfoService.selectByExample(skBearerInfoExample);
        SkBearerInfo skBearerInfo = new SkBearerInfo();
        if(!skBearerInfos.isEmpty()){
            skBearerInfo = skBearerInfos.get(0);
        }
        
        model.addAttribute("order", orderInfo);
        model.addAttribute("orderCombo", skOrderCombo);
        model.addAttribute("hotel", hotel);
        model.addAttribute("userAddress", userAddress);
        model.addAttribute("skBearerInfo", skBearerInfo);
        return "myOrderDetail" ;
    }
    
    @RequestMapping("/cancelOrder")
    public String cancelOrder(HttpServletRequest request, Model model) {
        
        int orderId = ParamUtils.getIntParameter(request, "orderId",1);
        
        SkOrderInfo orderInfo = skOrderInfoService.selectByPrimaryKey(orderId);
        orderInfo.setOrderStatus(false);
        this.skOrderInfoService.updateByPrimaryKey(orderInfo);
        
        
int pageNo = ParamUtils.getIntParameter(request, "pageNo",1);
        
        SkOrderInfoExample skOrderInfoExample = new SkOrderInfoExample();
        SkOrderInfoExample.Criteria criteria = skOrderInfoExample.createCriteria();
        
        //取用户id
//        String userId = null;
//        Cookie[] cookies = request.getCookies();
//        for(Cookie cookie : cookies){
//            if(cookie.getName().equals("memberId")){
//                userId = cookie.getValue();
//            }
//         }
//        skOrderInfoExample.createCriteria().andUserIdEqualTo(Integer.parseInt(userId));
        
        
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
        
        return "myorder" ;
    }
}
