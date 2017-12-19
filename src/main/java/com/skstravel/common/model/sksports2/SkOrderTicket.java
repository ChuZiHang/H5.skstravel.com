package com.skstravel.common.model.sksports2;

import java.io.Serializable;
import java.math.BigDecimal;

public class SkOrderTicket implements Serializable {
    private Integer recId;

    private Integer orderId;

    private String code;

    private Integer goodsId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private Integer goodsNumber;

    private Integer gameId;

    private Integer scheId;

    private Integer numberId;

    private Integer pitchId;

    private Integer bearerId;

    private Integer isPayBx;

    private String type;

    private String ticketCode;

    private static final long serialVersionUID = 1L;

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getScheId() {
        return scheId;
    }

    public void setScheId(Integer scheId) {
        this.scheId = scheId;
    }

    public Integer getNumberId() {
        return numberId;
    }

    public void setNumberId(Integer numberId) {
        this.numberId = numberId;
    }

    public Integer getPitchId() {
        return pitchId;
    }

    public void setPitchId(Integer pitchId) {
        this.pitchId = pitchId;
    }

    public Integer getBearerId() {
        return bearerId;
    }

    public void setBearerId(Integer bearerId) {
        this.bearerId = bearerId;
    }

    public Integer getIsPayBx() {
        return isPayBx;
    }

    public void setIsPayBx(Integer isPayBx) {
        this.isPayBx = isPayBx;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }
}