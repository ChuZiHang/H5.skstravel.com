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
    
    @Autowired
    private  JdbcTemplate jdbcTemplateForSksports2; 
    
  
    
    
    
    @RequestMapping("/index/{param}")
    public String index(HttpServletRequest request, Model model,@PathVariable String param ) {
    	//List<MatcheInfo> list=matcherService.findAll();
    	String sql=" select   b.id  matchId , g.goods_name matchTitle , FROM_UNIXTIME(g.add_time,'%Y-%m-%d %h:%i:%s')  matchTime,"
    			+ "p.pitch_name  matchAddress  ,g.shop_price matchPrice  , p.pitch_img  matchImg  "
    			+ " FROM sk_batch b ,sk_batch_info i,sk_goods g ,sk_pitch p WHERE "
    			+ "b.id=i.batch_id AND i.goods_id=g.goods_id AND g.pitch_id=p.id  AND g.goods_sn LIKE 'FWC%'";
    	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql);
    	//System.out.println(list);
    	//所有城市列表展示
    	if(param!="index"){
    		String sql1="SELECT   p.id,  p.pitch_name ,r.region_name FROM sk_pitch p,sk_region "
        			+ " r WHERE p.region_id=r.region_id  AND   p.pitch_sequence>79";
        	List<Map<String, Object>> cityList = jdbcTemplateForSksports2.queryForList(sql1);
        	//System.out.println(cityList);
        	//所有等级
        	String sql2="SELECT DISTINCT g.rank  FROM sk_goods g WHERE g.goods_sn LIKE 'FWC%' ORDER BY  g.rank ";
        	List<Map<String, Object>> rankList = jdbcTemplateForSksports2.queryForList(sql2);
        	//System.out.println(rankList);
        	//展示 赛程   SELECT * FROM sk_game ga,sk_schedule sc  WHERE  ga.id=sc.game_id AND ga.id='60';
        	String sql3="SELECT sc.id  scheduleId ,sc.sche_name  scheName FROM sk_game ga,sk_schedule sc  WHERE  ga.id=sc.game_id AND ga.id='60';";
        	List<Map<String, Object>> gameStage = jdbcTemplateForSksports2.queryForList(sql3);
        	request.setAttribute("gameStage", gameStage);
        	request.setAttribute("rankList", rankList);
        	request.setAttribute("cityList", cityList);
    	}
    	request.setAttribute("matcheList", list);
    	return param ;
    }
    
    
    //列表数据查询检索
    @RequestMapping("/selectByGameStage")
    public void  selectByGameStage(HttpServletRequest request,String  gameStage,HttpServletResponse response) throws IOException {
    	int gameS = Integer.parseInt(gameStage);
    	//System.out.println(gameS);
    	String sql=" SELECT sg.goods_name matchTitle,sg.goods_id matchId ,sg.add_time  "
    			+ "matchTime FROM sk_goods sg ,sk_schedule ss  WHERE ss.id= sg.sche_id AND ss.id=? ";
    	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameS);
    	//request.setAttribute("matcheList", list);
    	 String str = JSON.toJSONString(list);
    	System.out.println(str);
    	response.setContentType("text/json;charset=utf-8");
    	response.getWriter().write(str);
    }
    
    
   
    
    
    
}
