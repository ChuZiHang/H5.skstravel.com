package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkUsersZhaohang implements Serializable {
    private Integer id;

    private Integer userId;

    private String openId;

    private String acccessToken;

    private Date expiresIn;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAcccessToken() {
        return acccessToken;
    }

    public void setAcccessToken(String acccessToken) {
        this.acccessToken = acccessToken;
    }

    public Date getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Date expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}