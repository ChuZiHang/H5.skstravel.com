package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkComboPitch implements Serializable {
    private Integer comboPitchId;

    private String comboPitchName;

    private String comboPitchContain;

    private String comboPitchImg;

    private String comboPitchDesc;

    private static final long serialVersionUID = 1L;

    public Integer getComboPitchId() {
        return comboPitchId;
    }

    public void setComboPitchId(Integer comboPitchId) {
        this.comboPitchId = comboPitchId;
    }

    public String getComboPitchName() {
        return comboPitchName;
    }

    public void setComboPitchName(String comboPitchName) {
        this.comboPitchName = comboPitchName;
    }

    public String getComboPitchContain() {
        return comboPitchContain;
    }

    public void setComboPitchContain(String comboPitchContain) {
        this.comboPitchContain = comboPitchContain;
    }

    public String getComboPitchImg() {
        return comboPitchImg;
    }

    public void setComboPitchImg(String comboPitchImg) {
        this.comboPitchImg = comboPitchImg;
    }

    public String getComboPitchDesc() {
        return comboPitchDesc;
    }

    public void setComboPitchDesc(String comboPitchDesc) {
        this.comboPitchDesc = comboPitchDesc;
    }
}