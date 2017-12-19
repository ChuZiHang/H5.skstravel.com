package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkGroupGoodsKey implements Serializable {
    private Integer parentId;

    private Integer goodsId;

    private Byte adminId;

    private static final long serialVersionUID = 1L;

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}