package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkGoodsArticleKey implements Serializable {
    private Integer goodsId;

    private Integer articleId;

    private Byte adminId;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }
}