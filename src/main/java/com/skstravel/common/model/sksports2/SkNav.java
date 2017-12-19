package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkNav implements Serializable {
    private Integer id;

    private String ctype;

    private Short cid;

    private String name;

    private Boolean ifshow;

    private Boolean vieworder;

    private Boolean opennew;

    private String url;

    private String type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public Short getCid() {
        return cid;
    }

    public void setCid(Short cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIfshow() {
        return ifshow;
    }

    public void setIfshow(Boolean ifshow) {
        this.ifshow = ifshow;
    }

    public Boolean getVieworder() {
        return vieworder;
    }

    public void setVieworder(Boolean vieworder) {
        this.vieworder = vieworder;
    }

    public Boolean getOpennew() {
        return opennew;
    }

    public void setOpennew(Boolean opennew) {
        this.opennew = opennew;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}