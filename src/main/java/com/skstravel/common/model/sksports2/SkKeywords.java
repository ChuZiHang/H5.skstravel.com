package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkKeywords extends SkKeywordsKey implements Serializable {
    private Integer count;

    private static final long serialVersionUID = 1L;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}