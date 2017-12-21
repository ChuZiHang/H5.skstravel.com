package com.skstravel.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.skstravel.common.mapper.sksports2.MatcheMapper;
import com.skstravel.pojo.MatcheInfo;
import com.skstravel.service.MatcheService;
@Service
public class MatcheServiceImpl implements MatcheService {

	 @Autowired
	 private  JdbcTemplate jdbcTemplateForSksports2; 

	public List<Map<String, Object>> findMatchListForIndex() {
		
		String sql="SELECT  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress ,sp.big_pitch_img "
				+ "matchImg ,FROM_UNIXTIME(sg.add_time,'%Y-%m-%d %h:%i:%s')  matchTime,"
				+ "sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  "
				+ "WHERE  sp.region_id =sr.region_id AND sp.id=sg.pitch_id AND  sg.game_id='60'";
		/*String sql1=" select   b.id  matchId , g.goods_name matchTitle , FROM_UNIXTIME(g.add_time,'%Y-%m-%d %h:%i:%s')  matchTime,"
	 			+ "p.pitch_name  matchAddress  ,g.shop_price matchPrice  , p.pitch_img  matchImg  "
	 			+ " FROM sk_batch b ,sk_batch_info i,sk_goods g ,sk_pitch p WHERE "
	 			+ "b.id=i.batch_id AND i.goods_id=g.goods_id AND g.pitch_id=p.id  AND g.goods_sn LIKE 'FWC%'";*/
	 	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql);
		return list;
	}

	public List<Map<String, Object>> findGameStage() {
		String sql3="SELECT sc.id  scheduleId ,sc.sche_name  scheName FROM "
				+ "sk_game ga,sk_schedule sc  WHERE  ga.id=sc.game_id AND ga.id='60'  order by sc.id asc  ";
     	List<Map<String, Object>> gameStage = jdbcTemplateForSksports2.queryForList(sql3);
		return gameStage;
	}

	public List<Map<String, Object>> findRankList() {
		String sql2="SELECT DISTINCT g.rank  FROM sk_goods g WHERE g.goods_sn LIKE 'FWC%' ORDER BY  g.rank ";
     	List<Map<String, Object>> rankList = jdbcTemplateForSksports2.queryForList(sql2);
		return rankList;
	}

	public List<Map<String, Object>> findCityList() {
		String sql1="SELECT   p.id,  p.pitch_name ,r.region_name FROM sk_pitch p,sk_region "
     			+ " r WHERE p.region_id=r.region_id  AND   p.pitch_sequence>79";
     	List<Map<String, Object>> cityList = jdbcTemplateForSksports2.queryForList(sql1);
		return cityList;
	}

	public List<Map<String, Object>> findByGameStage(int gameS) {
		String sql="SELECT  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress"
				+ " ,sp.big_pitch_img matchImg ,FROM_UNIXTIME(sg.add_time,'%Y-%m-%d %h:%i:%s')  matchTime,"
				+ "sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss "
				+ "WHERE  sp.region_id =sr.region_id AND sp.id=sg.pitch_id AND ss.id= sg.sche_id AND ss.id= ? AND  sg.game_id='60' ";
    	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameS);
		return list;
	}
 
	

	
	
	

}
