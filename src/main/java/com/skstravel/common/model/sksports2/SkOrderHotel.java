package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkOrderHotel implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer hotelId;

    private Integer roomId;

    private Integer roomNum;

    private Integer goodsNumber;

    private String roomType;

    private Float goodsPrice;

    private Date hotelStartDate;

    private Date hotelEndDate;

    private Integer people;

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

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
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

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }
}