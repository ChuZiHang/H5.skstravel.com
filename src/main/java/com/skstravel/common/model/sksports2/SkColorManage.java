package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkColorManage implements Serializable {
    private Integer colorId;

    private String colorName;

    private String colorValue;

    private Integer gameId;

    private Integer isColor;

    private Integer typeId;

    private static final long serialVersionUID = 1L;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getIsColor() {
        return isColor;
    }

    public void setIsColor(Integer isColor) {
        this.isColor = isColor;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}