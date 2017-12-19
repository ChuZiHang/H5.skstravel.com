package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkBanner implements Serializable {
    private Integer id;

    private String imgUrl;

    private Integer placeId;

    private Boolean status;

    private String maxTitle;

    private String minTitle;

    private String link;

    private Integer sequence;

    private String videoLink;

    private String mobileLink;

    private String notes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMaxTitle() {
        return maxTitle;
    }

    public void setMaxTitle(String maxTitle) {
        this.maxTitle = maxTitle;
    }

    public String getMinTitle() {
        return minTitle;
    }

    public void setMinTitle(String minTitle) {
        this.minTitle = minTitle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}