package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SkCart implements Serializable {
    private Integer recId;

    private Integer userId;

    private String sessionId;

    private Integer goodsId;

    private String goodsSn;

    private Integer productId;

    private String goodsName;

    private BigDecimal marketPrice;

    private BigDecimal goodsPrice;

    private Short goodsNumber;

    private Boolean isReal;

    private String extensionCode;

    private Integer parentId;

    private Boolean recType;

    private Short isGift;

    private Boolean isShipping;

    private Byte canHandsel;

    private String goodsAttrId;

    private String goodsType;

    private Integer fromCity;

    private Integer toCity;

    private String departSubmit;

    private String arriveSubmit;

    private Integer spaceId;

    private Date hotelStartDate;

    private Date hotelEndDate;

    private String starLevel;

    private String roomType;

    private Integer hotelId;

    private Integer roomMoney;

    private Integer roomNum;

    private Integer airId;

    private Byte airLineType;

    private String flyDate;

    private String returnFlyDate;

    private Integer roomId;

    private Integer people;

    private Integer gameId;

    private Integer comboId;

    private String goodsAttr;

    private static final long serialVersionUID = 1L;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Boolean getIsReal() {
        return isReal;
    }

    public void setIsReal(Boolean isReal) {
        this.isReal = isReal;
    }

    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getRecType() {
        return recType;
    }

    public void setRecType(Boolean recType) {
        this.recType = recType;
    }

    public Short getIsGift() {
        return isGift;
    }

    public void setIsGift(Short isGift) {
        this.isGift = isGift;
    }

    public Boolean getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(Boolean isShipping) {
        this.isShipping = isShipping;
    }

    public Byte getCanHandsel() {
        return canHandsel;
    }

    public void setCanHandsel(Byte canHandsel) {
        this.canHandsel = canHandsel;
    }

    public String getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(String goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getFromCity() {
        return fromCity;
    }

    public void setFromCity(Integer fromCity) {
        this.fromCity = fromCity;
    }

    public Integer getToCity() {
        return toCity;
    }

    public void setToCity(Integer toCity) {
        this.toCity = toCity;
    }

    public String getDepartSubmit() {
        return departSubmit;
    }

    public void setDepartSubmit(String departSubmit) {
        this.departSubmit = departSubmit;
    }

    public String getArriveSubmit() {
        return arriveSubmit;
    }

    public void setArriveSubmit(String arriveSubmit) {
        this.arriveSubmit = arriveSubmit;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public Date getHotelStartDate() {
        return hotelStartDate;
    }

    public void setHotelStartDate(Date hotelStartDate) {
        this.hotelStartDate = hotelStartDate;
    }

    public Date getHotelEndDate() {
        return hotelEndDate;
    }

    public void setHotelEndDate(Date hotelEndDate) {
        this.hotelEndDate = hotelEndDate;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomMoney() {
        return roomMoney;
    }

    public void setRoomMoney(Integer roomMoney) {
        this.roomMoney = roomMoney;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getAirId() {
        return airId;
    }

    public void setAirId(Integer airId) {
        this.airId = airId;
    }

    public Byte getAirLineType() {
        return airLineType;
    }

    public void setAirLineType(Byte airLineType) {
        this.airLineType = airLineType;
    }

    public String getFlyDate() {
        return flyDate;
    }

    public void setFlyDate(String flyDate) {
        this.flyDate = flyDate;
    }

    public String getReturnFlyDate() {
        return returnFlyDate;
    }

    public void setReturnFlyDate(String returnFlyDate) {
        this.returnFlyDate = returnFlyDate;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }
}