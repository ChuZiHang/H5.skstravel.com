package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkBill implements Serializable {
    private Integer billId;

    private String billName;

    private Byte mediaType;

    private String billSource;

    private String billLink;

    private Integer startTime;

    private Integer endTime;

    private Byte showPage;

    private Byte status;

    private static final long serialVersionUID = 1L;

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public Byte getMediaType() {
        return mediaType;
    }

    public void setMediaType(Byte mediaType) {
        this.mediaType = mediaType;
    }

    public String getBillSource() {
        return billSource;
    }

    public void setBillSource(String billSource) {
        this.billSource = billSource;
    }

    public String getBillLink() {
        return billLink;
    }

    public void setBillLink(String billLink) {
        this.billLink = billLink;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Byte getShowPage() {
        return showPage;
    }

    public void setShowPage(Byte showPage) {
        this.showPage = showPage;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}