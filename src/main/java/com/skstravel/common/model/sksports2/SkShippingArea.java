package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkShippingArea implements Serializable {
    private Short shippingAreaId;

    private String shippingAreaName;

    private Byte shippingId;

    private String configure;

    private static final long serialVersionUID = 1L;

    public Short getShippingAreaId() {
        return shippingAreaId;
    }

    public void setShippingAreaId(Short shippingAreaId) {
        this.shippingAreaId = shippingAreaId;
    }

    public String getShippingAreaName() {
        return shippingAreaName;
    }

    public void setShippingAreaName(String shippingAreaName) {
        this.shippingAreaName = shippingAreaName;
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure;
    }
}