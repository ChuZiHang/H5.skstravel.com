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

	

}
