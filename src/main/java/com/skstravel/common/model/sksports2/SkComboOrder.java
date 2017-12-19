package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkComboOrder implements Serializable {
    private Integer comboOrderId;

    private String comboOrderName;

    private String comboOrderMobile;

    private String comboOrderEmail;

    private String comboOrderCard;

    private Integer comboId;

    private Integer isManage;

    private static final long serialVersionUID = 1L;

    public Integer getComboOrderId() {
        return comboOrderId;
    }

    public void setComboOrderId(Integer comboOrderId) {
        this.comboOrderId = comboOrderId;
    }

    public String getComboOrderName() {
        return comboOrderName;
    }

    public void setComboOrderName(String comboOrderName) {
        this.comboOrderName = comboOrderName;
    }

    public String getComboOrderMobile() {
        return comboOrderMobile;
    }

    public void setComboOrderMobile(String comboOrderMobile) {
        this.comboOrderMobile = comboOrderMobile;
    }

    public String getComboOrderEmail() {
        return comboOrderEmail;
    }

    public void setComboOrderEmail(String comboOrderEmail) {
        this.comboOrderEmail = comboOrderEmail;
    }

    public String getComboOrderCard() {
        return comboOrderCard;
    }

    public void setComboOrderCard(String comboOrderCard) {
        this.comboOrderCard = comboOrderCard;
    }

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public Integer getIsManage() {
        return isManage;
    }

    public void setIsManage(Integer isManage) {
        this.isManage = isManage;
    }
}