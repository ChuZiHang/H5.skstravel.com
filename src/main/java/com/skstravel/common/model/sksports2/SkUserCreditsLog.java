package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkUserCreditsLog implements Serializable {
    private Integer id;

    private Byte type;

    private Integer uid;

    private String transNo;

    private Integer creditsNum;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public Integer getCreditsNum() {
        return creditsNum;
    }

    public void setCreditsNum(Integer creditsNum) {
        this.creditsNum = creditsNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}