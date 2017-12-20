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
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    
    
    @Autowired
    private MatcheService matcherService;
    
    @Autowired
    private  JdbcTemplate jdbcTemplateForSksports2; 
    
    
    
    
    
    @RequestMapping("/index/{param}")
    public String index(HttpServletRequest request, Model model,@PathVariable String param ) {
    	//List<MatcheInfo> list=matcherService.findAll();
    	String sql=" select   b.id  matchId , b.batch_sn matchTitle , b.add_time  matchTime,"
    			+ "p.pitch_name  matchAddress  ,g.shop_price matchPrice  , p.pitch_img  matchImg  "
    			+ " FROM sk_batch b ,sk_batch_info i,sk_goods g ,sk_pitch p WHERE "
    			+ "b.id=i.batch_id AND i.goods_id=g.goods_id AND g.pitch_id=p.id";
    	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql);
    	//System.out.println(list);
    	
    	request.setAttribute("matcheList", list);
    	return param ;
    }
}
