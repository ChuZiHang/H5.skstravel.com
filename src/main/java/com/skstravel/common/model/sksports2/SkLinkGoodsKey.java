package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkLinkGoodsKey implements Serializable {
    private Integer goodsId;

    private Integer linkGoodsId;

    private Byte adminId;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getLinkGoodsId() {
        return linkGoodsId;
    }

    public void setLinkGoodsId(Integer linkGoodsId) {
        this.linkGoodsId = linkGoodsId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}