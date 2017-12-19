package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkRegFields implements Serializable {
    private Byte id;

    private String regFieldName;

    private Byte disOrder;

    private Boolean display;

    private Boolean type;

    private Boolean isNeed;

    private static final long serialVersionUID = 1L;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getRegFieldName() {
        return regFieldName;
    }

    public void setRegFieldName(String regFieldName) {
        this.regFieldName = regFieldName;
    }

    public Byte getDisOrder() {
        return disOrder;
    }

    public void setDisOrder(Byte disOrder) {
        this.disOrder = disOrder;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getIsNeed() {
        return isNeed;
    }

    public void setIsNeed(Boolean isNeed) {
        this.isNeed = isNeed;
    }
}