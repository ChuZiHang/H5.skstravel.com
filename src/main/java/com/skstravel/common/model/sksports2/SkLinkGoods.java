package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkLinkGoods extends SkLinkGoodsKey implements Serializable {
    private Boolean isDouble;

    private static final long serialVersionUID = 1L;

    public Boolean getIsDouble() {
        return isDouble;
    }

    public void setIsDouble(Boolean isDouble) {
        this.isDouble = isDouble;
    }
}