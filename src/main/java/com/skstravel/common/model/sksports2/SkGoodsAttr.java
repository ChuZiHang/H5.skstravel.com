package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkGoodsAttr implements Serializable {
    private Integer goodsAttrId;

    private Integer goodsId;

    private Short attrId;

    private BigDecimal attrPrice;

    private Integer attrSequence;

    private String attrValue;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(Integer goodsAttrId) {
        this.goodsAttrId = goodsAttrId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public BigDecimal getAttrPrice() {
        return attrPrice;
    }

    public void setAttrPrice(BigDecimal attrPrice) {
        this.attrPrice = attrPrice;
    }

    public Integer getAttrSequence() {
        return attrSequence;
    }

    public void setAttrSequence(Integer attrSequence) {
        this.attrSequence = attrSequence;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}