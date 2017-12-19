package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkArticleCat implements Serializable {
    private Short catId;

    private String catName;

    private Boolean catType;

    private String keywords;

    private String catDesc;

    private Byte sortOrder;

    private Boolean showInNav;

    private Short parentId;

    private static final long serialVersionUID = 1L;

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Boolean getCatType() {
        return catType;
    }

    public void setCatType(Boolean catType) {
        this.catType = catType;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Boolean showInNav) {
        this.showInNav = showInNav;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}