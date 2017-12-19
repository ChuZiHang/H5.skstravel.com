package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkGoodsCatKey implements Serializable {
    private Integer goodsId;

    private Short catId;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }
}