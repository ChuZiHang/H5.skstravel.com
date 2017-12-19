package com.skstravel.pojo;

import java.io.Serializable;
/**
 * 
 * @author jefferyChang
 *
 * 2017年12月19日
 */
public class MatcheInfo implements Serializable {
	
	//赛事id
	private int matchId;
	//赛事标题
	private String matchTitle;
	//赛事事件
	private String matchTime;
	//赛事地址
	private String matchAddress;
	//赛事价格
	private double matchPrice;
	//赛事介绍
	private  String  matchTxt;
	//图片信息
	private String  matchImg;
	
	
	
	public String getMatchImg() {
		return matchImg;
	}
	public void setMatchImg(String matchImg) {
		this.matchImg = matchImg;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getMatchTitle() {
		return matchTitle;
	}
	public void setMatchTitle(String matchTitle) {
		this.matchTitle = matchTitle;
	}
	public String getMatchTime() {
		return matchTime;
	}
	public void setMatchTime(String matchTime) {
		this.matchTime = matchTime;
	}
	public String getMatchAddress() {
		return matchAddress;
	}
	public void setMatchAddress(String matchAddress) {
		this.matchAddress = matchAddress;
	}
	public double getMatchPrice() {
		return matchPrice;
	}
	public void setMatchPrice(double matchPrice) {
		this.matchPrice = matchPrice;
	}
	public String getMatchTxt() {
		return matchTxt;
	}
	public void setMatchTxt(String matchTxt) {
		this.matchTxt = matchTxt;
	}
	
	
	
	
	
	
	

}
