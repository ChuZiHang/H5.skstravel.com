package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkBookingGoods implements Serializable {
    private Integer recId;

    private Integer userId;

    private String email;

    private String linkMan;

    private String tel;

    private Integer goodsId;

    private String goodsDesc;

    private Short goodsNumber;

    private Integer bookingTime;

    private Boolean isDispose;

    private String disposeUser;

    private Integer disposeTime;

    private String disposeNote;

    private static final long serialVersionUID = 1L;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Integer bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Boolean getIsDispose() {
        return isDispose;
    }

    public void setIsDispose(Boolean isDispose) {
        this.isDispose = isDispose;
    }

    public String getDisposeUser() {
        return disposeUser;
    }

    public void setDisposeUser(String disposeUser) {
        this.disposeUser = disposeUser;
    }

    public Integer getDisposeTime() {
        return disposeTime;
    }

    public void setDisposeTime(Integer disposeTime) {
        this.disposeTime = disposeTime;
    }

    public String getDisposeNote() {
        return disposeNote;
    }

    public void setDisposeNote(String disposeNote) {
        this.disposeNote = disposeNote;
    }
}