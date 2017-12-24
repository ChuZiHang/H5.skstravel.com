package com.skstravel.web.controller;

import com.skstravel.common.api.Constants;
import com.skstravel.common.model.sksports2.*;
import com.skstravel.common.service.ISkBearerInfoService;
import com.skstravel.common.service.ISkUserAddressService;
import com.skstravel.common.utils.CookieUtils;
import com.skstravel.common.utils.ParamUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qw on 2017/12/22.
 */
@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private ISkBearerInfoService skBearerInfoService;

    @Autowired
    private JdbcTemplate jdbcTemplateForSksports2;

    @Autowired
    private ISkUserAddressService skUserAddressService;


    /**
     * 跳转用户中心
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/center")
    public String userCenter(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
//        String memberId = CookieUtils.getCookie(request, "memberId");
        String memberId = "4129";
        CookieUtils.setCookie("memberId", memberId+"", -1, response, Constants.domain);
        String sql = "SELECT user_name userName FROM sk_users WHERE user_id = ? ";
        List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        String userName = (String)maps.get(0).get("userName");
        model.addAttribute("userName",userName);
        return "center";
    }

    /**
     * 用户信息修改
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/updateUser")
    public void updateUser(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");

        String userName = ParamUtils.getParameter(request,"userName");
        int sex = ParamUtils.getIntParameter(request,"sex");
        String birthday = ParamUtils.getParameter(request,"birthday");
        String email = ParamUtils.getParameter(request,"email");
        String companyName = ParamUtils.getParameter(request,"companyName");
        String mobilePhone = ParamUtils.getParameter(request,"mobilePhone");
        String officePhone = ParamUtils.getParameter(request,"officePhone");
        String emergencyPhone = ParamUtils.getParameter(request,"emergencyPhone");

        String sql = "UPDATE sk_users u SET u.`user_name`=?,u.`sex`=?,u.`birthday`=?,u.`email`=?,u.`company_name`=?,u.`mobile_phone`=?,u.`office_phone`=?,u.`emergency_phone`=? WHERE u.`user_id` = ? ";
        int i = jdbcTemplateForSksports2.update(sql, new Object[]{userName, sex, birthday, email, companyName, mobilePhone, officePhone, emergencyPhone, memberId});

        Map<String,Object> map = new HashMap<>();
        map.put("code",1);
        response.getWriter().print(map);
    }

    /**
     * 个人详情
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/todetail")
    public String todetail(HttpServletRequest request,Model model) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");

        String sql = "SELECT user_name userName,sex,birthday,email,company_name companyName,mobile_phone mobilePhone,office_phone officePhone,emergency_phone emergencyPhone,adress FROM sk_users WHERE user_id =？";
        int i = jdbcTemplateForSksports2.update(sql, new Object[]{ memberId});
        List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        model.addAttribute("beanList",maps);

        return "personalData";
    }

    /**
     * 添加护照信息
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/addbeare")
    public void addbeare(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");

        String cnCustomerName = ParamUtils.getParameter(request, "cnCustomerName");
        String genderAppellation = ParamUtils.getParameter(request, "genderAppellation");
        String passportNumber = ParamUtils.getParameter(request, "passportNumber");
        String dateBirth = ParamUtils.getParameter(request, "dateBirth");
        String issueDate = ParamUtils.getParameter(request, "issueDate");
        String expireDate = ParamUtils.getParameter(request, "expireDate");
        String cnCountry = ParamUtils.getParameter(request, "cnCountry");
        String cnNameStreet = ParamUtils.getParameter(request, "cnNameStreet");
        String postCode = ParamUtils.getParameter(request, "postCode");
        String telephone = ParamUtils.getParameter(request, "telephone");
        String mobile = ParamUtils.getParameter(request, "mobile");
        String mail = ParamUtils.getParameter(request, "mail");

        int id = ParamUtils.getIntParameter(request,"id");

        SkBearerInfo skBearerInfo = new SkBearerInfo();
        skBearerInfo.setCnCustomerName(cnCustomerName);
        skBearerInfo.setGenderAppellation(genderAppellation);
        skBearerInfo.setPassportNumber(passportNumber);
        skBearerInfo.setDateBirth(dateBirth);
        skBearerInfo.setIssueDate(issueDate);
        skBearerInfo.setExpireDate(expireDate);
        skBearerInfo.setCnCity(cnCountry);
        skBearerInfo.setCnNameStreet(cnNameStreet);
        skBearerInfo.setPostCode(postCode);
        skBearerInfo.setTelephone(telephone);
        skBearerInfo.setMobile(mobile);
        skBearerInfo.setMail(mail);
        skBearerInfo.setSubmit((int)new Date().getTime());
        skBearerInfo.setSubmit(1);

        if(id > 0){
            skBearerInfo.setId(id);
            skBearerInfoService.updateByPrimaryKeySelective(skBearerInfo);
        }else{
            skBearerInfo.setUserId(Integer.parseInt(memberId));
            skBearerInfoService.insertSelective(skBearerInfo);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("code",1);
        response.getWriter().print(map);
    }

    /**
     * 列表
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/beare")
    public String beareList(HttpServletRequest request, Model model) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");

        SkBearerInfoExample skBearerInfoExample = new SkBearerInfoExample();
        skBearerInfoExample.createCriteria().andUserIdEqualTo(Integer.parseInt(memberId));
        List<SkBearerInfo> skBearerInfos = skBearerInfoService.selectByExample(skBearerInfoExample);
        if(skBearerInfos != null && skBearerInfos.size() > 0){
            model.addAttribute("beanList",skBearerInfos);
            return "bearer";
        } else {
            return "addBearer";
        }
    }

    /**
     * 跳转添加
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toaddbearer")
    public String toaddbearer(HttpServletRequest request, Model model) throws Exception {
        return "addBearer";
    }

    /**
     * 跳转修改
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/tomodify")
    public String tomodify(HttpServletRequest request, Model model) throws Exception {
        int id = ParamUtils.getIntParameter(request,"id");
        SkBearerInfo skBearerInfo = skBearerInfoService.selectByPrimaryKey(id);
        model.addAttribute("bean",skBearerInfo);
        return "addBearer";
    }

    /**
     * 联系地址管理
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/addresslist")
    public String addresslist(HttpServletRequest request, Model model) throws Exception {
        String memberId = CookieUtils.getCookie(request, "memberId");
        SkUserAddressExample skUserAddressExample = new SkUserAddressExample();
        skUserAddressExample.createCriteria().andUserIdEqualTo(Integer.parseInt(memberId));
        List<SkUserAddress> skUserAddresses = skUserAddressService.selectByExample(skUserAddressExample);

        String sql = "SELECT user_name userName FROM sk_users WHERE user_id = ? ";
        List<Map<String, Object>> maps = jdbcTemplateForSksports2.queryForList(sql, new Object[]{memberId});
        String userName = (String)maps.get(0).get("userName");

        model.addAttribute("beanList",skUserAddresses);
        model.addAttribute("userName",userName);
        return "address";
    }

    /**
     * 删除地址
     */
    @RequestMapping("/delAddress")
    public void delAddress(HttpServletRequest request,HttpServletResponse response) throws IOException {
        int addressId = ParamUtils.getIntParameter(request,"id");

        int i = skUserAddressService.deleteByPrimaryKey(addressId);

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);

        response.getWriter().print(map);
    }

    /**
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/toModifyAddress")
    public String toModifyAddress(HttpServletRequest request,Model model){

        int addressId = ParamUtils.getIntParameter(request,"id");

        SkUserAddress skUserAddress = skUserAddressService.selectByPrimaryKey(addressId);

        model.addAttribute("bean",skUserAddress);
        return "addLinkMan";
    }

    /**
     * 更新添加
     */
    @RequestMapping("/updateAddress")
    public void updateAddress(HttpServletRequest request,HttpServletResponse response) throws IOException {
        int addressId = ParamUtils.getIntParameter(request,"id");
        String email = ParamUtils.getParameter(request,"email");
        String cardType = ParamUtils.getParameter(request,"cardType");
        String cardNum = ParamUtils.getParameter(request,"cardNum");
        String mobile = ParamUtils.getParameter(request,"mobile");
        String consignee = ParamUtils.getParameter(request,"consignee");

        int type = 0;
        switch (cardType){
            case "身份证":
                type = 0;
                break;
            case "护照" :
                type = 1;
                break;
            case "驾驶证":
                type = 2;
                break;
        }

        SkUserAddress skUserAddress = new SkUserAddress();

        skUserAddress.setEmail(email);
        skUserAddress.setCardNum(cardNum);
        skUserAddress.setMobile(mobile);
        skUserAddress.setCardType(type);
        skUserAddress.setConsignee(consignee);

        if(addressId > 0){
            skUserAddress.setAddressId(addressId);
            skUserAddressService.updateByPrimaryKey(skUserAddress);
        }else{
            skUserAddressService.insertSelective(skUserAddress);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("code",0);

        response.getWriter().print(map);
    }
}
