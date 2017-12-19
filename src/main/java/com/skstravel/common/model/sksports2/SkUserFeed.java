package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkUserFeed implements Serializable {
    private Integer feedId;

    private Integer userId;

    private Integer valueId;

    private Integer goodsId;

    private Boolean feedType;

    private Boolean isFeed;

    private static final long serialVersionUID = 1L;

    public Integer getFeedId() {
        return feedId;
    }

    public void setFeedId(Integer feedId) {
        this.feedId = feedId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getFeedType() {
        return feedType;
    }

    public void setFeedType(Boolean feedType) {
        this.feedType = feedType;
    }

    public Boolean getIsFeed() {
        return isFeed;
    }

    public void setIsFeed(Boolean isFeed) {
        this.isFeed = isFeed;
    }
}