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

import com.alibaba.fastjson.JSON;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Q_先森 on 2017/12/18.
 */
@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    private MatcheService matcherService;
    /**
     * 查询前台页面数据(index.jsp)
     * 查询subjectList.jsp页面数据
     * @param request
     * @param model
     * @param param
     * @return
     */
    @RequestMapping("/index/{param}")
    public String index(HttpServletRequest request, Model model,@PathVariable String param ) {
    	List<Map<String, Object>>   list=matcherService.findMatchListForIndex();
    	if(param!="index"){
    	List<Map<String, Object>> gameStage   =matcherService.findGameStage();
    	List<Map<String, Object>> rankList   =matcherService.findRankList();
    	List<Map<String, Object>> cityList   =matcherService.findCityList();
    	request.setAttribute("gameStage", gameStage);
     	request.setAttribute("rankList", rankList);
     	request.setAttribute("cityList", cityList);
     	}
    	request.setAttribute("matcheList", list);
     	
    	return param ;
    }
    
    
    /**
     * 列表数据查询检索
     * @param request
     * @param gameStage
     * @param response
     * @throws IOException
     */
    @RequestMapping("/selectByGameStage")
    public void  selectByGameStage(HttpServletRequest request,String  gameStage,HttpServletResponse response) throws IOException {
    	int gameS = Integer.parseInt(gameStage);
    	System.out.println(gameStage);
    	List<Map<String, Object>> list=null;
    	if(gameS ==0){
    		list = matcherService.findMatchListForIndex();
    	}else{
    		list=matcherService.findByGameStage(gameS);
    	}
    	String str = JSON.toJSONString(list);
    	response.setContentType("text/json;charset=utf-8");
    	response.getWriter().write(str);
    	
    }
    
    
   
    
    
    
}
