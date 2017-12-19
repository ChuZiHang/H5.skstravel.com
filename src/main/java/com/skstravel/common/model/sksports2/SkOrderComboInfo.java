package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkOrderComboInfo implements Serializable {
    private Integer id;

    private Integer orderId;

    private Integer comboId;

    private Integer orderComboNumber;

    private BigDecimal orderComboPrice;

    private Long orderComboMoney;

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

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public Integer getOrderComboNumber() {
        return orderComboNumber;
    }

    public void setOrderComboNumber(Integer orderComboNumber) {
        this.orderComboNumber = orderComboNumber;
    }

    public BigDecimal getOrderComboPrice() {
        return orderComboPrice;
    }

    public void setOrderComboPrice(BigDecimal orderComboPrice) {
        this.orderComboPrice = orderComboPrice;
    }

    public Long getOrderComboMoney() {
        return orderComboMoney;
    }

    public void setOrderComboMoney(Long orderComboMoney) {
        this.orderComboMoney = orderComboMoney;
    }
}