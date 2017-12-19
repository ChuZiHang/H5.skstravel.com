package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkUserCoupon implements Serializable {
    private Integer userCouponId;

    private Long couponClusterId;

    private Byte typeId;

    private Integer userId;

    private Long couponId;

    private Byte status;

    private Date endTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserCouponId() {
        return userCouponId;
    }

    public void setUserCouponId(Integer userCouponId) {
        this.userCouponId = userCouponId;
    }

    public Long getCouponClusterId() {
        return couponClusterId;
    }

    public void setCouponClusterId(Long couponClusterId) {
        this.couponClusterId = couponClusterId;
    }

    public Byte getTypeId() {
        return typeId;
    }

    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}