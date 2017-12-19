package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkGoodsType implements Serializable {
    private Short catId;

    private String catName;

    private Boolean enabled;

    private String attrGroup;

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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAttrGroup() {
        return attrGroup;
    }

    public void setAttrGroup(String attrGroup) {
        this.attrGroup = attrGroup;
    }
}