package com.skstravel.web.controller;

import com.skstravel.common.utils.CookieUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.skstravel.common.mapper.sksports2.SkGoodsMapper;
import com.skstravel.common.mapper.sksports2.SkHotelMapper;
import com.skstravel.common.mapper.sksports2.SkOrderGoodsMapper;
import com.skstravel.common.mapper.sksports2.SkOrderPlaneMapper;
import com.skstravel.common.model.sksports2.SkBearerInfo;
import com.skstravel.common.model.sksports2.SkBearerInfoExample;
import com.skstravel.common.model.sksports2.SkGoods;
import com.skstravel.common.model.sksports2.SkGoodsExample;
import com.skstravel.common.model.sksports2.SkHotel;
import com.skstravel.common.model.sksports2.SkOrderCombo;
import com.skstravel.common.model.sksports2.SkOrderComboExample;
import com.skstravel.common.model.sksports2.SkOrderGoods;
import com.skstravel.common.model.sksports2.SkOrderGoodsExample;
import com.skstravel.common.model.sksports2.SkOrderHotel;
import com.skstravel.common.model.sksports2.SkOrderHotelExample;
import com.skstravel.common.model.sksports2.SkOrderInfo;
import com.skstravel.common.model.sksports2.SkOrderInfoExample;
import com.skstravel.common.model.sksports2.SkOrderPlane;
import com.skstravel.common.model.sksports2.SkOrderPlaneExample;
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
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    @Autowired
    private SkGoodsMapper skGoodsMapper;
    @Autowired
    private  JdbcTemplate jdbcTemplateForSksports2;
    @Autowired
    private SkHotelMapper skHotelMapper;
    @Autowired
    private SkOrderGoodsMapper orderGoodsMapper;
    @Autowired
    private SkOrderPlaneMapper orderPlaneMapper;

    @RequestMapping("/orderinfo/{param}")
    public String orderList(HttpServletRequest request, Model model,@PathVariable String param ) throws Exception {
        
        int pageNo = ParamUtils.getIntParameter(request, "pageNo",1);
        
        SkOrderInfoExample skOrderInfoExample = new SkOrderInfoExample();
        SkOrderInfoExample.Criteria criteria = skOrderInfoExample.createCriteria();
        
        //取用户id
        String memberId = CookieUtils.getCookie(request, "memberId");
        skOrderInfoExample.createCriteria().andUserIdEqualTo(Integer.parseInt(memberId));
        
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
    
    /**
     * 创建订单
     * @param request
     * @param model
     * @return
     * @throws Exception 
     */
    @RequestMapping("/createOrder")
    public void createOrder(HttpServletRequest request, HttpServletResponse response ,Model model) throws Exception {
        String str1= "";
        try {
            String str = getRequestPostStr(request);
            JsonElement parse = new JsonParser().parse(str);
            JsonObject jsonObject = parse.getAsJsonObject();
            int orderId = this.skOrderInfoService.createOrderInfo(request,jsonObject);
            str1 = String.valueOf(orderId);
            response.getWriter().println(orderId);;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param request
     * @param model
     * @param entity
     * @return
     */
    @RequestMapping("/queryOrderInfo")
    public String queryOrderInfo(HttpServletRequest request, Model model) {
        int goodId = ParamUtils.getIntParameter(request, "goodsId",1);
        //查询商品信息
        SkGoods skGoods = this.skGoodsMapper.selectByPrimaryKey(Integer.valueOf(goodId));
        //查询吉祥物信息
        SkGoodsExample skGoodsExample = new SkGoodsExample();
        skGoodsExample.createCriteria().andGoodsTypeEqualTo(Short.valueOf("14"));//吉祥物类型
        List<SkGoods> jxwList = this.skGoodsMapper.selectByExample(skGoodsExample);
        //机票,暂时查询所有的机票
        String sql = "select DISTINCT * from (SELECT DISTINCT * from (select DISTINCT * from sk_air_ticket t,(select r.region_id cid,r.region_name cname from sk_air_ticket t LEFT JOIN sk_region r " 
                    +" ON t.from_city=r.region_id) c where t.from_city=c.cid) zhu,(select r.region_id did,r.region_name dname from sk_air_ticket t LEFT JOIN sk_region r "
                    +" ON t.to_city=r.region_id) d where zhu.to_city=d.did) zh,sk_air_line line where zh.air_line_id=line.id ";
        List<Map<String, Object>> jpList = this.jdbcTemplateForSksports2.queryForList(sql);
        //酒店,暂时查询所有的酒店
        List<SkHotel> jdList = this.skHotelMapper.selectByExample(null);
        
        model.addAttribute("goods", skGoods);
        model.addAttribute("jxwList", jxwList);
        model.addAttribute("jpList", jpList);
        model.addAttribute("jdList", jdList);
        return "order" ;
    }
    
    @RequestMapping("/queryOrderInfoForPay")
    public String queryOrderInfoForPay(HttpServletRequest request, Model model) throws ParseException {
        int orderId = ParamUtils.getIntParameter(request, "orderId",1);
        //查询订单信息
        SkOrderInfo orderInfo = this.skOrderInfoService.selectByPrimaryKey(orderId);
        //查询商品信息
        SkOrderGoodsExample goodsExamle = new SkOrderGoodsExample();
        goodsExamle.createCriteria().andOrderIdEqualTo(orderInfo.getOrderId());
        List<SkOrderGoods> orderGoddsList = this.orderGoodsMapper.selectByExample(goodsExamle);
        SkOrderGoods goods = new SkOrderGoods();
        if(!orderGoddsList.isEmpty()){
            goods = orderGoddsList.get(0);
        }
        //查询机票信息
        SkOrderPlaneExample planeExample = new SkOrderPlaneExample();
        planeExample.createCriteria().andOrderIdEqualTo(orderInfo.getOrderId());
        List<SkOrderPlane> planList = this.orderPlaneMapper.selectByExample(planeExample);
        SkOrderPlane plane = new SkOrderPlane();
        if(!planList.isEmpty()){
            plane = planList.get(0);
        }
        //设置标志位
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMdd");
        if(plane.getFlyDate().getTime() == (sdf.parse("2018-07-08")).getTime()){
            plane.setFlag("8");
        }else{
            plane.setFlag("9");
        }
        
        model.addAttribute("orderInfo", orderInfo);
        model.addAttribute("goods", goods);
        model.addAttribute("plane", plane);
        return "order-pay" ;
    }
    
    
    public static byte[] getRequestPostBytes(HttpServletRequest request)
            throws IOException {
        int contentLength = request.getContentLength();
        if(contentLength<0){
            return null;
        }
        byte buffer[] = new byte[contentLength];
        for (int i = 0; i < contentLength;) {

            int readlen = request.getInputStream().read(buffer, i,
                    contentLength - i);
            if (readlen == -1) {
                break;
            }
            i += readlen;
        }
        return buffer;
    }

    public static String getRequestPostStr(HttpServletRequest request)
            throws IOException {
        byte buffer[] = getRequestPostBytes(request);
        String charEncoding = request.getCharacterEncoding();
        if (charEncoding == null) {
            charEncoding = "UTF-8";
        }
        return new String(buffer, charEncoding);
    }
}
