package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkAirLineNum implements Serializable {
    private Integer id;

    private Integer airLineId;

    private Byte type;

    private Date date;

    private Short num;

    private Short lockedNum;

    private Short saleNum;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAirLineId() {
        return airLineId;
    }

    public void setAirLineId(Integer airLineId) {
        this.airLineId = airLineId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public Short getLockedNum() {
        return lockedNum;
    }

    public void setLockedNum(Short lockedNum) {
        this.lockedNum = lockedNum;
    }

    public Short getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Short saleNum) {
        this.saleNum = saleNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}