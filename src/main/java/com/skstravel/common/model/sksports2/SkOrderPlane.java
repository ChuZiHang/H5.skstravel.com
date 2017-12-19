package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SkOrderPlane implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer fromCity;

    private Integer toCity;

    private Date flyDate;

    private Date returnFlyDate;

    private Integer airId;

    private Integer spaceId;

    private Integer goodsNumber;

    private BigDecimal goodsPrice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Date getFlyDate() {
        return flyDate;
    }

    public void setFlyDate(Date flyDate) {
        this.flyDate = flyDate;
    }

    public Date getReturnFlyDate() {
        return returnFlyDate;
    }

    public void setReturnFlyDate(Date returnFlyDate) {
        this.returnFlyDate = returnFlyDate;
    }

    public Integer getAirId() {
        return airId;
    }

    public void setAirId(Integer airId) {
        this.airId = airId;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}