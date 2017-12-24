package com.skstravel.service.impl;

import java.util.ArrayList;
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
		String sql="  SELECT  sp.id  pitchId,  sg.goods_id matchId ,sg.goods_name matchTitle ,sg.shop_price matchPrice ,sp.pitch_name  matchAddress "
					+" ,sp.big_pitch_img matchImg ,FROM_UNIXTIME(ss.sche_start,'%Y-%m-%d %h:%i:%s')  matchTime, "
					+" sg.ticket_business matchTxt FROM sk_goods sg, sk_pitch sp ,sk_region   sr  ,sk_schedule ss  , sk_number sn "
					+" WHERE  sp.region_id =sr.region_id AND ss.id= sg.sche_id  AND  sg.game_id='60' "
					+" AND sn.id=sg.number_id AND sn.pitch_id =sp.id AND ss.id=? AND sr.region_id=? AND    sg.goods_id= ? " ;
	List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,gameStage1,city1,rank1);
	return list;
	}

	/**
	 * 查询选中的赛事的详情  卢日尼基体育场/斯巴达克体育场/圣彼得堡体育场  可以用
	 * 
	 * 
	 * SELECT DISTINCT scp.combo_pitch_name,scp.combo_pitch_desc FROM sk_combo sc ,sk_combo_pitch  scp ,sk_goods sg, sk_combo_ticket sct
		WHERE sg.goods_id =sct.goods_id AND sct.combo_id =sc.combo_id AND sc.combo_pitchs =scp.combo_pitch_id  AND sg.game_id='60';
			
	 *
	 *
	 *
	 */
	public List<Map<String, Object>>  findDetailsById(int id,int pitchId) {
		//String pitchId1="89";
			String sql=" SELECT  sp.pitch_name  pitchName, sp.big_pitch_img   pitchImg ,scp.combo_pitch_name  comboPitchName   ,"
					+ "scp.combo_pitch_desc   comboPitchDesc FROM  sk_pitch sp  ,sk_combo_pitch scp ,sk_comboPitch_pitch scpi "
						+" WHERE scpi.combo_pitch_id=scp.combo_pitch_id    AND scpi.pitch_id=sp.id and  sp.id=? ";
		 List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,pitchId);
		return list;
	}

	/**
	 * 查询goods_id数据获得id值
	 */
	public List<Map<String, Object>> findTravleByGoodsId(int id) {
		String sql="SELECT sg.goods_id id,sc.combo_travels FROM sk_goods sg, sk_combo sc ,sk_combo_ticket sct  WHERE "
					+" sc.combo_id=sct.combo_id AND sct.goods_id=sg.goods_id AND sg.game_id='60'  AND sg.goods_id=?  ";
		id=895;
		String  id2="";
		List<Map<String, Object>> list = jdbcTemplateForSksports2.queryForList(sql,id);
		for (Map<String, Object> map : list) {
			id2 = (String) map.get("combo_travels");
		}
		
		String[] travelIds = id2.split("\\|");
		List TravelList=new ArrayList<>();
		for (String travelId : travelIds) {
			String sql1="SELECT  sct.combo_travel_title  title ,sct.combo_travel_content content "
					+ ", sct.combo_travel_img  img FROM sk_combo_travel sct WHERE   sct.combo_travel_id=? ";
			List<Map<String, Object>> travel = jdbcTemplateForSksports2.queryForList(sql1,travelId);
			TravelList.add(travel);
		}
		return TravelList;
	}
 
	

	
	
	

}
