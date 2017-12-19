package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkGroupGoods extends SkGroupGoodsKey implements Serializable {
    private BigDecimal goodsPrice;

    private static final long serialVersionUID = 1L;

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}