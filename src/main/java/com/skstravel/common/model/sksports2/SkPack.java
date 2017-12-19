package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkPack implements Serializable {
    private Byte packId;

    private String packName;

    private String packImg;

    private BigDecimal packFee;

    private Short freeMoney;

    private String packDesc;

    private static final long serialVersionUID = 1L;

    public Byte getPackId() {
        return packId;
    }

    public void setPackId(Byte packId) {
        this.packId = packId;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }

    public String getPackImg() {
        return packImg;
    }

    public void setPackImg(String packImg) {
        this.packImg = packImg;
    }

    public BigDecimal getPackFee() {
        return packFee;
    }

    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    public Short getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(Short freeMoney) {
        this.freeMoney = freeMoney;
    }

    public String getPackDesc() {
        return packDesc;
    }

    public void setPackDesc(String packDesc) {
        this.packDesc = packDesc;
    }
}