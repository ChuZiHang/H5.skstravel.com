package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkBonusType implements Serializable {
    private Short typeId;

    private String typeName;

    private BigDecimal typeMoney;

    private Byte sendType;

    private BigDecimal minAmount;

    private BigDecimal maxAmount;

    private Integer sendStartDate;

    private Integer sendEndDate;

    private Integer useStartDate;

    private Integer useEndDate;

    private BigDecimal minGoodsAmount;

    private static final long serialVersionUID = 1L;

    public Short getTypeId() {
        return typeId;
    }

    public void setTypeId(Short typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public BigDecimal getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(BigDecimal typeMoney) {
        this.typeMoney = typeMoney;
    }

    public Byte getSendType() {
        return sendType;
    }

    public void setSendType(Byte sendType) {
        this.sendType = sendType;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getSendStartDate() {
        return sendStartDate;
    }

    public void setSendStartDate(Integer sendStartDate) {
        this.sendStartDate = sendStartDate;
    }

    public Integer getSendEndDate() {
        return sendEndDate;
    }

    public void setSendEndDate(Integer sendEndDate) {
        this.sendEndDate = sendEndDate;
    }

    public Integer getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Integer useStartDate) {
        this.useStartDate = useStartDate;
    }

    public Integer getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(Integer useEndDate) {
        this.useEndDate = useEndDate;
    }

    public BigDecimal getMinGoodsAmount() {
        return minGoodsAmount;
    }

    public void setMinGoodsAmount(BigDecimal minGoodsAmount) {
        this.minGoodsAmount = minGoodsAmount;
    }
}