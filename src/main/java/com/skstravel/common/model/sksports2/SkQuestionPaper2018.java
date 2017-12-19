package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkQuestionPaper2018 implements Serializable {
    private Integer id;

    private String realname;

    private String phone;

    private String email;

    private Byte ticketTypeLevel;

    private String vipLevelText;

    private Integer numberId;

    private String numberName;

    private String notes;

    private Integer uid;

    private Date createTime;

    private String ip;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getTicketTypeLevel() {
        return ticketTypeLevel;
    }

    public void setTicketTypeLevel(Byte ticketTypeLevel) {
        this.ticketTypeLevel = ticketTypeLevel;
    }

    public String getVipLevelText() {
        return vipLevelText;
    }

    public void setVipLevelText(String vipLevelText) {
        this.vipLevelText = vipLevelText;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public String getNumberName() {
        return numberName;
    }

    public void setNumberName(String numberName) {
        this.numberName = numberName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}