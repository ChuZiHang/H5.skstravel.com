package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkComboTravelType implements Serializable {
    private Integer comboTravelTypeId;

    private String typeName;

    private static final long serialVersionUID = 1L;

    public Integer getComboTravelTypeId() {
        return comboTravelTypeId;
    }

    public void setComboTravelTypeId(Integer comboTravelTypeId) {
        this.comboTravelTypeId = comboTravelTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}