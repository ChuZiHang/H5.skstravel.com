package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkMemberPrice implements Serializable {
    private Integer priceId;

    private Integer goodsId;

    private Byte userRank;

    private BigDecimal userPrice;

    private static final long serialVersionUID = 1L;

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getUserRank() {
        return userRank;
    }

    public void setUserRank(Byte userRank) {
        this.userRank = userRank;
    }

    public BigDecimal getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(BigDecimal userPrice) {
        this.userPrice = userPrice;
    }
}