package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkPackageGoodsKey implements Serializable {
    private Integer packageId;

    private Integer goodsId;

    private Byte adminId;

    private Integer productId;

    private static final long serialVersionUID = 1L;

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}