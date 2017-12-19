package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkOrderInfoCancelKey implements Serializable {
    private Integer orderId;

    private BigDecimal discount;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}