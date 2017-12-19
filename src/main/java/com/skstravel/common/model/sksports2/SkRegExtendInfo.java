package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkRegExtendInfo implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer regFieldId;

    private String content;

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

    public Integer getRegFieldId() {
        return regFieldId;
    }

    public void setRegFieldId(Integer regFieldId) {
        this.regFieldId = regFieldId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}