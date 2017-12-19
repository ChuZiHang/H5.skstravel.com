package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkCombo implements Serializable {
    private Integer comboId;

    private String comboName;

    private String comboTitle;

    private String comboIntro;

    private String comboLogo;

    private String comboImg;

    private String comboColor;

    private String comboPitchs;

    private String comboTravels;

    private Integer comboTravelTypeId;

    private String comboHead;

    private String comboFoot;

    private String comboIntroTitle;

    private String comboIntroButton;

    private Byte isShow;

    private BigDecimal comboPrice;

    private Short sortOrder;

    private static final long serialVersionUID = 1L;

    public Integer getComboId() {
        return comboId;
    }

    public void setComboId(Integer comboId) {
        this.comboId = comboId;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }

    public String getComboTitle() {
        return comboTitle;
    }

    public void setComboTitle(String comboTitle) {
        this.comboTitle = comboTitle;
    }

    public String getComboIntro() {
        return comboIntro;
    }

    public void setComboIntro(String comboIntro) {
        this.comboIntro = comboIntro;
    }

    public String getComboLogo() {
        return comboLogo;
    }

    public void setComboLogo(String comboLogo) {
        this.comboLogo = comboLogo;
    }

    public String getComboImg() {
        return comboImg;
    }

    public void setComboImg(String comboImg) {
        this.comboImg = comboImg;
    }

    public String getComboColor() {
        return comboColor;
    }

    public void setComboColor(String comboColor) {
        this.comboColor = comboColor;
    }

    public String getComboPitchs() {
        return comboPitchs;
    }

    public void setComboPitchs(String comboPitchs) {
        this.comboPitchs = comboPitchs;
    }

    public String getComboTravels() {
        return comboTravels;
    }

    public void setComboTravels(String comboTravels) {
        this.comboTravels = comboTravels;
    }

    public Integer getComboTravelTypeId() {
        return comboTravelTypeId;
    }

    public void setComboTravelTypeId(Integer comboTravelTypeId) {
        this.comboTravelTypeId = comboTravelTypeId;
    }

    public String getComboHead() {
        return comboHead;
    }

    public void setComboHead(String comboHead) {
        this.comboHead = comboHead;
    }

    public String getComboFoot() {
        return comboFoot;
    }

    public void setComboFoot(String comboFoot) {
        this.comboFoot = comboFoot;
    }

    public String getComboIntroTitle() {
        return comboIntroTitle;
    }

    public void setComboIntroTitle(String comboIntroTitle) {
        this.comboIntroTitle = comboIntroTitle;
    }

    public String getComboIntroButton() {
        return comboIntroButton;
    }

    public void setComboIntroButton(String comboIntroButton) {
        this.comboIntroButton = comboIntroButton;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public BigDecimal getComboPrice() {
        return comboPrice;
    }

    public void setComboPrice(BigDecimal comboPrice) {
        this.comboPrice = comboPrice;
    }

    public Short getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Short sortOrder) {
        this.sortOrder = sortOrder;
    }
}