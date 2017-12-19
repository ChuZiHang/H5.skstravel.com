package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkCatRecommendKey implements Serializable {
    private Short catId;

    private Boolean recommendType;

    private static final long serialVersionUID = 1L;

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public Boolean getRecommendType() {
        return recommendType;
    }

    public void setRecommendType(Boolean recommendType) {
        this.recommendType = recommendType;
    }
}