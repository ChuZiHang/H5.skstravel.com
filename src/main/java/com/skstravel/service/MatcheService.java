package com.skstravel.service;

import java.util.List;
import java.util.Map;

import com.skstravel.pojo.MatcheInfo;

public interface MatcheService {

	List<Map<String, Object>>  findMatchListForIndex();

	List<Map<String, Object>> findGameStage();

	List<Map<String, Object>> findRankList();

	List<Map<String, Object>> findCityList();

	List<Map<String, Object>> findByGameStage(int gameS);

	List<Map<String, Object>> findCityByGameStage(int gameStage);

	String findGameStageByPage(int gameStage);

	List<Map<String, Object>> findByGameStageAndCity(int gameStage, int city);

	String findCityByPage(int city);

	List<Map<String, Object>> findRankByCityAndgameStage(int gameStage, int city);

	List<Map<String, Object>> findByGameStageAndCityAndRank(int gameStage1, int city1, int rank1);

	void findDetailsById(int id);

	

}
