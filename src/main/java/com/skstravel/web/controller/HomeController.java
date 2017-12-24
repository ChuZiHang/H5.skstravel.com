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
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSON;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.pojo.PageBean;
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
    	PageBean  page =new PageBean();
    	if(param!="index"){
    	List<Map<String, Object>> gameStage   =matcherService.findGameStage();
    	List<Map<String, Object>> rankList   =matcherService.findRankList();
    	List<Map<String, Object>> cityList   =matcherService.findCityList();
    	page.setGameStageList(gameStage);
    	page.setRankList(null);
    	page.setCityList(null);
     	}
    	page.setList(list);
    	request.setAttribute("pageBean", page);
    	return param ;
    }
    
    
    /**
     * 列表数据查询检索
     * @param request
     * @param gameStage
     * @param response
     * @throws IOException
     */
    @RequestMapping("/selectByGameStage/{param}")
    public String  selectByGameStage(HttpServletRequest request,@PathVariable 
    		String param,HttpServletResponse response,@RequestParam(defaultValue="0")int  gameStage) throws IOException {
    	//int gameS = Integer.parseInt(param);
    	//System.out.println(gameS);
    	//存放查询到的list数据
    	List<Map<String, Object>> list=null;
    	List<Map<String, Object>> gameStageList=null;
    	List<Map<String, Object>> rankList   =null;
    	List<Map<String, Object>> cityList   =null;
    	PageBean  page =new PageBean();
    	if(gameStage == 0){
    		list = matcherService.findMatchListForIndex();
    		page.setList(list);
    		page.setCityList(null);
    		page.setRankList(null);
    		page.setGameStage("所有赛段");
    		
    	}else{
    		//赛事列表
    		list=matcherService.findByGameStage(gameStage);
    		//从页面返回的数据名称
    		//String name =matcherService.findGameStageByPage(gameStage);
    		//城市列表
    		cityList=matcherService.findCityByGameStage(gameStage);
    		//赛事列表
    		gameStageList   =matcherService.findGameStage();
    		page.setList(list);
    		page.setGameStageList(gameStageList);
    		//列表中的选中值
    		page.setGameStage(String.valueOf(gameStage));
    		//城市列表
    		page.setCityList(cityList);
    		//级别列表
    		page.setRankList(null);
    	}
    	request.setAttribute("pageBean", page);
    	
		return param;
    	
    }
    
    
    
    
    @RequestMapping("/selectByGameStageAndCity/{param}")
    public String  selectByGameStageAndCity(HttpServletRequest request,@PathVariable 
    		String param,HttpServletResponse response,Integer 
    		gameStage1,@RequestParam(defaultValue="0")int city) throws IOException {
    	//存放查询到的list数据
    	List<Map<String, Object>> list=null;
    	List<Map<String, Object>> gameStageList=null;
    	List<Map<String, Object>> rankList   =null;
    	List<Map<String, Object>> cityList   =null;
    	PageBean  page =new PageBean();
    	if(gameStage1 == 0){
    		list = matcherService.findMatchListForIndex();
    		page.setList(list);
    		page.setCityList(null);
    		page.setRankList(null);
    		page.setGameStage("所有赛段");
    		
    	}else{
    		//通过赛事和城市确定----》赛事列表
    		list=matcherService.findByGameStageAndCity(gameStage1,city);
    		//从页面返回的数据名称
    		//String gameStageName =matcherService.findGameStageByPage(gameStage);
    		//从页面返回的
    		String cityName =matcherService.findCityByPage(city);
    		
    		//城市列表
    		cityList=matcherService.findCityByGameStage(gameStage1);
    		//通过城市+赛事确定 级别---->级别列表
    		rankList=matcherService.findRankByCityAndgameStage(gameStage1,city);
    		//赛事列表
    		gameStageList   =matcherService.findGameStage();
    		
    		//赛事主页列表封装
    		page.setList(list);
    		//封装赛事列表
    		page.setGameStageList(gameStageList);
    		//封装城市列表
    		page.setCityList(cityList);
    		//封装级别列表
    		page.setRankList(rankList);
    		//列表中的选中值
    		page.setGameStage(String.valueOf(gameStage1));
    		//城市列表
    		page.setCity(String.valueOf(city));
    	}
    	request.setAttribute("pageBean", page);
		return param;
    }
    
    @RequestMapping("/selectByGameStageAndCityAndRank/{param}")
    public String  selectByGameStageAndCityAndRank(HttpServletRequest request,@PathVariable 
    		String param,HttpServletResponse response,@RequestParam(defaultValue="0")int 
    		gameStage1,@RequestParam(defaultValue="0")int city1,@RequestParam(defaultValue="0")int rank1) throws IOException {
    	//存放查询到的list数据
    	List<Map<String, Object>> list=null;
    	List<Map<String, Object>> gameStageList=null;
    	List<Map<String, Object>> rankList   =null;
    	List<Map<String, Object>> cityList   =null;
    	
    	PageBean  page =new PageBean();
    	if(gameStage1 == 0 ||city1==0 ){
    		list = matcherService.findMatchListForIndex();
    		page.setList(list);
    		page.setCityList(null);
    		page.setRankList(null);
    		page.setGameStage("所有赛段");
    		
    	}else{
    		//通过赛事和城市确定----》赛事列表
    		list=matcherService.findByGameStageAndCityAndRank(gameStage1,city1,rank1);
    		//从页面返回的数据名称
    		//String gameStageName =matcherService.findGameStageByPage(gameStage);
    		//从页面返回的
    		//String cityName =matcherService.findCityByPage(city1);
    		
    		//城市列表
    		cityList=matcherService.findCityByGameStage(gameStage1);
    		//通过城市+赛事确定 级别---->级别列表
    		rankList=matcherService.findRankByCityAndgameStage(gameStage1,city1);
    		//赛事列表
    		gameStageList   =matcherService.findGameStage();
    		
    		//赛事主页列表封装
    		page.setList(list);
    		//封装赛事列表
    		page.setGameStageList(gameStageList);
    		//封装城市列表
    		page.setCityList(cityList);
    		//封装级别列表
    		page.setRankList(rankList);
    		//列表中的选中值
    		page.setGameStage(String.valueOf(gameStage1));
    		//城市列表
    		page.setCity(String.valueOf(city1));
    		page.setRank(String.valueOf(rank1));
    	}
    	request.setAttribute("pageBean", page);
		return param;
    }
    
    @RequestMapping("findDetailsById/{param}")
    public  String  findDetailsById(HttpServletRequest request,@PathVariable 
    		String param,@RequestParam(defaultValue="0")int id, @RequestParam(defaultValue="0")int pitchId) {
		
    	List<Map<String, Object>>  list=matcherService.findDetailsById(id,pitchId);
    	PageBean pageBean =new PageBean();
    	pageBean.setStr(String.valueOf(id));
    	
    	List travelList =matcherService.findTravleByGoodsId(id);
    	pageBean.setTravelList(travelList);
    	
    	Map<String, Object> l1=null;
    	if(list!=null&&list.size()>0){
    	l1 = list.get(0);
    	}
    	request.setAttribute("pageBean", pageBean);
    	request.setAttribute("str", l1);
    	return param;
	}
   
    
    
    
}
