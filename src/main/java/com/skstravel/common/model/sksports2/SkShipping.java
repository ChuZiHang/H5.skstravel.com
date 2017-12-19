package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkShipping implements Serializable {
    private Byte shippingId;

    private String shippingCode;

    private String shippingName;

    private String shippingDesc;

    private String insure;

    private Boolean supportCod;

    private Boolean enabled;

    private String printBg;

    private Boolean printModel;

    private Byte shippingOrder;

    private static final long serialVersionUID = 1L;

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingDesc() {
        return shippingDesc;
    }

    public void setShippingDesc(String shippingDesc) {
        this.shippingDesc = shippingDesc;
    }

    public String getInsure() {
        return insure;
    }

    public void setInsure(String insure) {
        this.insure = insure;
    }

    public Boolean getSupportCod() {
        return supportCod;
    }

    public void setSupportCod(Boolean supportCod) {
        this.supportCod = supportCod;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPrintBg() {
        return printBg;
    }

    public void setPrintBg(String printBg) {
        this.printBg = printBg;
    }

    public Boolean getPrintModel() {
        return printModel;
    }

    public void setPrintModel(Boolean printModel) {
        this.printModel = printModel;
    }

    public Byte getShippingOrder() {
        return shippingOrder;
    }

    public void setShippingOrder(Byte shippingOrder) {
        this.shippingOrder = shippingOrder;
    }
}