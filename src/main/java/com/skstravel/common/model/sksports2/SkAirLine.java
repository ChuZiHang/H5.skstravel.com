package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkAirLine implements Serializable {
    private Integer id;

    private String title;

    private Integer fromCity;

    private Integer toCity;

    private Byte hasTransfer;

    private Byte type;

    private String flyTime;

    private String returnFlyTime;

    private Integer price;

    private String description;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getFromCity() {
        return fromCity;
    }

    public void setFromCity(Integer fromCity) {
        this.fromCity = fromCity;
    }

    public Integer getToCity() {
        return toCity;
    }

    public void setToCity(Integer toCity) {
        this.toCity = toCity;
    }

    public Byte getHasTransfer() {
        return hasTransfer;
    }

    public void setHasTransfer(Byte hasTransfer) {
        this.hasTransfer = hasTransfer;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getFlyTime() {
        return flyTime;
    }

    public void setFlyTime(String flyTime) {
        this.flyTime = flyTime;
    }

    public String getReturnFlyTime() {
        return returnFlyTime;
    }

    public void setReturnFlyTime(String returnFlyTime) {
        this.returnFlyTime = returnFlyTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}