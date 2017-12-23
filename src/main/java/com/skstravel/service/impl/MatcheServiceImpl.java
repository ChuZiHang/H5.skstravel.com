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
		String sql=" SELECT  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress "
					+" ,sp.big_pitch_img matchImg ,FROM_UNIXTIME(ss.sche_start,'%Y-%m-%d %h:%i:%s')  matchTime, "
					+" sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id ";
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
		String sql2=" SELECT  DISTINCT sg.rank   FROM sk_goods sg, sk_pitch sp ,sk_region   sr " 
					+ " ,sk_schedule ss  , sk_number sn "
					+ " WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+ " AND sn.id=sg.number_id AND sn.pitch_id =sp.id ORDER BY sg.rank ";
     	List<Map<String, Object>> rankList = jdbcTemplateForSksports2.queryForList(sql2);
		return rankList;
	}

	public List<Map<String, Object>> findCityList() {
		String sql1=" SELECT  DISTINCT   sp.id,  sp.pitch_name ,sr.region_name FROM sk_goods sg, sk_pitch sp ,sk_region   sr  "
					+" ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id ";
     	List<Map<String, Object>> cityList = jdbcTemplateForSksports2.queryForList(sql1);
		return cityList;
	}

	public List<Map<String, Object>> findByGameStage(int gameS) {
		String sql=" SELECT  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress "
					+" ,sp.big_pitch_img matchImg ,FROM_UNIXTIME(ss.sche_start,'%Y-%m-%d %h:%i:%s')  matchTime, "
					+" sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=?  ";
    	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameS);
		return list;
	}

	
	public List<Map<String, Object>> findCityByGameStage(int gameStage) {
			//String valueOf = String.valueOf(gameStage);
		
		String sql=" SELECT DISTINCT sr.region_id, sr.region_name FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+"	AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=?  ";
		List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameStage);
		return list;
	}

	@Override
	public String findGameStageByPage(int gameStage) {
		//String valueOf = String.valueOf(gameStage);
		String sql="  SELECT  DISTINCT ss.sche_name FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=? ";
		List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameStage);
		String str=null;
		for (Map<String, Object> map : list) {
			str = (String) map.get("sche_name");
		}
		
		return str;
	}

	/**
	 * 通过赛事和城市确定  要展示的列表
	 */
	public List<Map<String, Object>> findByGameStageAndCity(int gameStage, int city) {
		String sql="SELECT  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress "
					+" ,sp.big_pitch_img matchImg ,FROM_UNIXTIME(ss.sche_start,'%Y-%m-%d %h:%i:%s')  matchTime, "
					+" sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=?  AND sr.region_id=?  " ;
		List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameStage,city);
		return list;
	}

	/**
	 * 通过页面中发送的城市id查找到城市数据
	 */
	public String findCityByPage(int city) {
		String sql="   SELECT  DISTINCT  sr.region_name FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' " 
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND sr.region_id= ? ";
		String str = null;
		List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,city);
		for (Map<String, Object> map : list) {
			str = (String) map.get("region_name");
		}
		
		return str;
	}

	/**
	 * 通过城市和赛事确定级别列表
	 */
	public List<Map<String, Object>> findRankByCityAndgameStage(int gameStage, int city) {
		String sql="   SELECT  DISTINCT sg.rank rank ,sg.goods_id id FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
				+"	WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60'  "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=?  AND sr.region_id= ? GROUP BY sg.rank   ASC ";
		List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameStage,city);
		return list;
	}

	/**
	 * 通过赛事和城市和级别获得展示列表
	 */
	public List<Map<String, Object>> findByGameStageAndCityAndRank(int gameStage1, int city1, int rank1) {
		String sql="  SELECT  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress "
					+" ,sp.big_pitch_img matchImg ,FROM_UNIXTIME(ss.sche_start,'%Y-%m-%d %h:%i:%s')  matchTime, "
					+" sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=? AND sr.region_id=? AND    sg.goods_id= ? " ;
	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameStage1,city1,rank1);
	return list;
	}

	/**
	 * 查询选中的赛事的详情
	 */
	public void findDetailsById(int id) {
		 String sql="SELECT DISTINCT sg.goods_id  , scp.combo_pitch_id ,sp.pitch_name ,scp.combo_pitch_name ,combo_pitch_desc, "
				 	+" sp.big_pitch_img FROM sk_combo_pitch scp , "
				 	+" sk_combo sco ,sk_combo_ticket  sct ,sk_goods  sg,sk_pitch sp ,sk_number sn "
				 	+" WHERE scp.combo_pitch_id =sco.combo_pitchs AND sco.combo_id= "
				 	+" sct.combo_id AND sct.goods_id=sg.goods_id AND sg.game_id='60' AND "  
				 	+" sg.number_id=sn.id AND sn.pitch_id= sp.id  AND sco.is_show='0' AND  sg.goods_id = ?   ";
		
	}
 
	

	
	
	

}
