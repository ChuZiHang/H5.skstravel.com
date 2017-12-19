package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkComboWithBLOBs extends SkCombo implements Serializable {
    private String comboTickets;

    private String comboIntroBig;

    private String comboIntroSmall;

    private String comboReserveContent;

    private String comboMoneyContent;

    private String comboVisaContent;

    private String comboEditor;

    private String comboCharge;

    private String comboVisa;

    private static final long serialVersionUID = 1L;

    public String getComboTickets() {
        return comboTickets;
    }

    public void setComboTickets(String comboTickets) {
        this.comboTickets = comboTickets;
    }

    public String getComboIntroBig() {
        return comboIntroBig;
    }

    public void setComboIntroBig(String comboIntroBig) {
        this.comboIntroBig = comboIntroBig;
    }

    public String getComboIntroSmall() {
        return comboIntroSmall;
    }

    public void setComboIntroSmall(String comboIntroSmall) {
        this.comboIntroSmall = comboIntroSmall;
    }

    public String getComboReserveContent() {
        return comboReserveContent;
    }

    public void setComboReserveContent(String comboReserveContent) {
        this.comboReserveContent = comboReserveContent;
    }

    public String getComboMoneyContent() {
        return comboMoneyContent;
    }

    public void setComboMoneyContent(String comboMoneyContent) {
        this.comboMoneyContent = comboMoneyContent;
    }

    public String getComboVisaContent() {
        return comboVisaContent;
    }

    public void setComboVisaContent(String comboVisaContent) {
        this.comboVisaContent = comboVisaContent;
    }

    public String getComboEditor() {
        return comboEditor;
    }

    public void setComboEditor(String comboEditor) {
        this.comboEditor = comboEditor;
    }

    public String getComboCharge() {
        return comboCharge;
    }

    public void setComboCharge(String comboCharge) {
        this.comboCharge = comboCharge;
    }

    public String getComboVisa() {
        return comboVisa;
    }

    public void setComboVisa(String comboVisa) {
        this.comboVisa = comboVisa;
    }
}