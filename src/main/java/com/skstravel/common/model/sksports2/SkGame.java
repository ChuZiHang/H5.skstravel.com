package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkGame implements Serializable {
    private Integer id;

    private String gameName;

    private Integer startTime;

    private Integer endTime;

    private String gameImg;

    private String gameLogo;

    private String gameSealogo;

    private String template;

    private String gameIntro;

    private Integer isType;

    private Byte isInsurance;

    private Integer scatId;

    private String gameText;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
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

    public String getGameImg() {
        return gameImg;
    }

    public void setGameImg(String gameImg) {
        this.gameImg = gameImg;
    }

    public String getGameLogo() {
        return gameLogo;
    }

    public void setGameLogo(String gameLogo) {
        this.gameLogo = gameLogo;
    }

    public String getGameSealogo() {
        return gameSealogo;
    }

    public void setGameSealogo(String gameSealogo) {
        this.gameSealogo = gameSealogo;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getGameIntro() {
        return gameIntro;
    }

    public void setGameIntro(String gameIntro) {
        this.gameIntro = gameIntro;
    }

    public Integer getIsType() {
        return isType;
    }

    public void setIsType(Integer isType) {
        this.isType = isType;
    }

    public Byte getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(Byte isInsurance) {
        this.isInsurance = isInsurance;
    }

    public Integer getScatId() {
        return scatId;
    }

    public void setScatId(Integer scatId) {
        this.scatId = scatId;
    }

    public String getGameText() {
        return gameText;
    }

    public void setGameText(String gameText) {
        this.gameText = gameText;
    }
}