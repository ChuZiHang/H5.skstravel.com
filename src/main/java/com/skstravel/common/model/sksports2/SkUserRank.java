package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkUserRank implements Serializable {
    private Byte rankId;

    private String rankName;

    private Integer minPoints;

    private Integer maxPoints;

    private Byte discount;

    private Boolean showPrice;

    private Boolean specialRank;

    private static final long serialVersionUID = 1L;

    public Byte getRankId() {
        return rankId;
    }

    public void setRankId(Byte rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public Integer getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(Integer minPoints) {
        this.minPoints = minPoints;
    }

    public Integer getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Byte getDiscount() {
        return discount;
    }

    public void setDiscount(Byte discount) {
        this.discount = discount;
    }

    public Boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Boolean showPrice) {
        this.showPrice = showPrice;
    }

    public Boolean getSpecialRank() {
        return specialRank;
    }

    public void setSpecialRank(Boolean specialRank) {
        this.specialRank = specialRank;
    }
}