package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkContract implements Serializable {
    private Integer contractId;

    private String contractName;

    private Date addtime;

    private String hotelId;

    private String airticketId;

    private Integer userId;

    private String contractFile;

    private String comboId;

    private String goodsId;

    private Boolean contractType;

    private String contractNo;

    private String orderSn;

    private String hotels;

    private String goods;

    private String combos;

    private String airtickets;

    private static final long serialVersionUID = 1L;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getAirticketId() {
        return airticketId;
    }

    public void setAirticketId(String airticketId) {
        this.airticketId = airticketId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContractFile() {
        return contractFile;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }

    public String getComboId() {
        return comboId;
    }

    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getContractType() {
        return contractType;
    }

    public void setContractType(Boolean contractType) {
        this.contractType = contractType;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getHotels() {
        return hotels;
    }

    public void setHotels(String hotels) {
        this.hotels = hotels;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getCombos() {
        return combos;
    }

    public void setCombos(String combos) {
        this.combos = combos;
    }

    public String getAirtickets() {
        return airtickets;
    }

    public void setAirtickets(String airtickets) {
        this.airtickets = airtickets;
    }
}