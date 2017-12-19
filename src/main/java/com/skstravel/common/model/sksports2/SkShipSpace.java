package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkShipSpace implements Serializable {
    private Integer sId;

    private String spaceName;

    private static final long serialVersionUID = 1L;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }
}