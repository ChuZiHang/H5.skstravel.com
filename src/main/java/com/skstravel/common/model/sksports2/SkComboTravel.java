package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkComboTravel implements Serializable {
    private Integer comboTravelId;

    private Integer comboTravelTypeId;

    private Integer comboTravelDay;

    private String comboTravelDate;

    private String comboTravelTitle;

    private String comboTravelImg;

    private String comboTravelContent;

    private static final long serialVersionUID = 1L;

    public Integer getComboTravelId() {
        return comboTravelId;
    }

    public void setComboTravelId(Integer comboTravelId) {
        this.comboTravelId = comboTravelId;
    }

    public Integer getComboTravelTypeId() {
        return comboTravelTypeId;
    }

    public void setComboTravelTypeId(Integer comboTravelTypeId) {
        this.comboTravelTypeId = comboTravelTypeId;
    }

    public Integer getComboTravelDay() {
        return comboTravelDay;
    }

    public void setComboTravelDay(Integer comboTravelDay) {
        this.comboTravelDay = comboTravelDay;
    }

    public String getComboTravelDate() {
        return comboTravelDate;
    }

    public void setComboTravelDate(String comboTravelDate) {
        this.comboTravelDate = comboTravelDate;
    }

    public String getComboTravelTitle() {
        return comboTravelTitle;
    }

    public void setComboTravelTitle(String comboTravelTitle) {
        this.comboTravelTitle = comboTravelTitle;
    }

    public String getComboTravelImg() {
        return comboTravelImg;
    }

    public void setComboTravelImg(String comboTravelImg) {
        this.comboTravelImg = comboTravelImg;
    }

    public String getComboTravelContent() {
        return comboTravelContent;
    }

    public void setComboTravelContent(String comboTravelContent) {
        this.comboTravelContent = comboTravelContent;
    }
}