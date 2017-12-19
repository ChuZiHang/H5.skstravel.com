package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkShippingWithBLOBs extends SkShipping implements Serializable {
    private String shippingPrint;

    private String configLable;

    private static final long serialVersionUID = 1L;

    public String getShippingPrint() {
        return shippingPrint;
    }

    public void setShippingPrint(String shippingPrint) {
        this.shippingPrint = shippingPrint;
    }

    public String getConfigLable() {
        return configLable;
    }

    public void setConfigLable(String configLable) {
        this.configLable = configLable;
    }
}