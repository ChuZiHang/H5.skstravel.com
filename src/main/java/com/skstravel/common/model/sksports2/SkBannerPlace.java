package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkBannerPlace implements Serializable {
    private Integer id;

    private String placeName;

    private String placeCode;

    private Boolean placeStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public Boolean getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(Boolean placeStatus) {
        this.placeStatus = placeStatus;
    }
}