package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.util.Date;

public class SkNumber implements Serializable {
    private Integer id;

    private String numName;

    private String numImg;

    private Integer scheId;

    private Integer pitchId;

    private Date numStart;

    private Date numEnd;

    private String colorId;

    private String numbers;

    private Boolean isHot;

    private String numTitle;

    private String numText;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumName() {
        return numName;
    }

    public void setNumName(String numName) {
        this.numName = numName;
    }

    public String getNumImg() {
        return numImg;
    }

    public void setNumImg(String numImg) {
        this.numImg = numImg;
    }

    public Integer getScheId() {
        return scheId;
    }

    public void setScheId(Integer scheId) {
        this.scheId = scheId;
    }

    public Integer getPitchId() {
        return pitchId;
    }

    public void setPitchId(Integer pitchId) {
        this.pitchId = pitchId;
    }

    public Date getNumStart() {
        return numStart;
    }

    public void setNumStart(Date numStart) {
        this.numStart = numStart;
    }

    public Date getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(Date numEnd) {
        this.numEnd = numEnd;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public String getNumTitle() {
        return numTitle;
    }

    public void setNumTitle(String numTitle) {
        this.numTitle = numTitle;
    }

    public String getNumText() {
        return numText;
    }

    public void setNumText(String numText) {
        this.numText = numText;
    }
}