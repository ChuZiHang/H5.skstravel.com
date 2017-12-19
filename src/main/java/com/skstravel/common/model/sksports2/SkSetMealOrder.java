package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkSetMealOrder implements Serializable {
    private Integer setMealOrderId;

    private String setMealOrderName;

    private String setMealOrderMobile;

    private String setMealOrderEmail;

    private String setMealOrderCard;

    private Integer setMealId;

    private Integer isManage;

    private static final long serialVersionUID = 1L;

    public Integer getSetMealOrderId() {
        return setMealOrderId;
    }

    public void setSetMealOrderId(Integer setMealOrderId) {
        this.setMealOrderId = setMealOrderId;
    }

    public String getSetMealOrderName() {
        return setMealOrderName;
    }

    public void setSetMealOrderName(String setMealOrderName) {
        this.setMealOrderName = setMealOrderName;
    }

    public String getSetMealOrderMobile() {
        return setMealOrderMobile;
    }

    public void setSetMealOrderMobile(String setMealOrderMobile) {
        this.setMealOrderMobile = setMealOrderMobile;
    }

    public String getSetMealOrderEmail() {
        return setMealOrderEmail;
    }

    public void setSetMealOrderEmail(String setMealOrderEmail) {
        this.setMealOrderEmail = setMealOrderEmail;
    }

    public String getSetMealOrderCard() {
        return setMealOrderCard;
    }

    public void setSetMealOrderCard(String setMealOrderCard) {
        this.setMealOrderCard = setMealOrderCard;
    }

    public Integer getSetMealId() {
        return setMealId;
    }

    public void setSetMealId(Integer setMealId) {
        this.setMealId = setMealId;
    }

    public Integer getIsManage() {
        return isManage;
    }

    public void setIsManage(Integer isManage) {
        this.isManage = isManage;
    }
}