package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkOrderGoodsCancelWithBLOBs extends SkOrderGoodsCancel implements Serializable {
    private String goodsAttr;

    private String isDel;

    private static final long serialVersionUID = 1L;

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }
}