package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkGoodsActivityWithBLOBs extends SkGoodsActivity implements Serializable {
    private String actDesc;

    private String extInfo;

    private static final long serialVersionUID = 1L;

    public String getActDesc() {
        return actDesc;
    }

    public void setActDesc(String actDesc) {
        this.actDesc = actDesc;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }
}