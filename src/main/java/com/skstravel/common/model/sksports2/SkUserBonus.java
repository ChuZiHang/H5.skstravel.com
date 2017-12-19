package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkUserBonus implements Serializable {
    private Integer bonusId;

    private Byte bonusTypeId;

    private Long bonusSn;

    private Integer userId;

    private Integer usedTime;

    private Integer orderId;

    private Byte emailed;

    private static final long serialVersionUID = 1L;

    public Integer getBonusId() {
        return bonusId;
    }

    public void setBonusId(Integer bonusId) {
        this.bonusId = bonusId;
    }

    public Byte getBonusTypeId() {
        return bonusTypeId;
    }

    public void setBonusTypeId(Byte bonusTypeId) {
        this.bonusTypeId = bonusTypeId;
    }

    public Long getBonusSn() {
        return bonusSn;
    }

    public void setBonusSn(Long bonusSn) {
        this.bonusSn = bonusSn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Byte getEmailed() {
        return emailed;
    }

    public void setEmailed(Byte emailed) {
        this.emailed = emailed;
    }
}