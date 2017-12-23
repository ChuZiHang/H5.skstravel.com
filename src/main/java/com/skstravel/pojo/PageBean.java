package com.skstravel.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PageBean implements Serializable {
	//放置赛事列表
	private	List<Map<String, Object>> list=new ArrayList<>() ;
	
	//放置级别列表
	private List<Map<String, Object>> rankList=new ArrayList<>()  ;
	//放置城市列表
	private List<Map<String, Object>> cityList =new ArrayList<>();
	//放置查询到的赛事列表
	private   List<Map<String, Object>>  gameStageList=new ArrayList<>();
	
	//显示的图片页面地址 
	private String imgUrl;
	
	//公共字段
	private  String str;
	
	
	
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	//用于封装从页面返回的赛事字段
	private String gameStage;
	//用于封装从页面返回的城市字段
	private String city;
	//用于封装从页面返回的级别
	private String rank;
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	public List<Map<String, Object>> getRankList() {
		return rankList;
	}
	public void setRankList(List<Map<String, Object>> rankList) {
		this.rankList = rankList;
	}
	public List<Map<String, Object>> getCityList() {
		return cityList;
	}
	public void setCityList(List<Map<String, Object>> cityList) {
		this.cityList = cityList;
	}
	public List<Map<String, Object>> getGameStageList() {
		return gameStageList;
	}
	public void setGameStageList(List<Map<String, Object>> gameStageList) {
		this.gameStageList = gameStageList;
	}
	public String getGameStage() {
		return gameStage;
	}
	public void setGameStage(String gameStage) {
		this.gameStage = gameStage;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	
	
	
	
	
	
	
}
