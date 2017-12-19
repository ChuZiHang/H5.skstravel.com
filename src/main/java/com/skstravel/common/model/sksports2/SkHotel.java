package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkHotel implements Serializable {
    private Integer id;

    private String hotelName;

    private String hotelImg;

    private Integer regionId;

    private String starLevel;

    private String hotelText;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelImg() {
        return hotelImg;
    }

    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getHotelText() {
        return hotelText;
    }

    public void setHotelText(String hotelText) {
        this.hotelText = hotelText;
    }
}