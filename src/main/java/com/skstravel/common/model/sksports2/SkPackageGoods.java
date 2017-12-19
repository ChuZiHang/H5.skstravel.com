package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkPackageGoods extends SkPackageGoodsKey implements Serializable {
    private Short goodsNumber;

    private static final long serialVersionUID = 1L;

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}