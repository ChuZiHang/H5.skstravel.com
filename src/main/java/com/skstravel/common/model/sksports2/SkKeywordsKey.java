package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkKeywordsKey implements Serializable {
    private Date date;

    private String searchengine;

    private String keyword;

    private static final long serialVersionUID = 1L;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSearchengine() {
        return searchengine;
    }

    public void setSearchengine(String searchengine) {
        this.searchengine = searchengine;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}