package com.skstravel.common.model.sksports2;

import java.io.Serializable;

public class SkMailTemplates implements Serializable {
    private Boolean templateId;

    private String templateCode;

    private Boolean isHtml;

    private String templateSubject;

    private Integer lastModify;

    private Integer lastSend;

    private String type;

    private String templateContent;

    private static final long serialVersionUID = 1L;

    public Boolean getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Boolean templateId) {
        this.templateId = templateId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public Boolean getIsHtml() {
        return isHtml;
    }

    public void setIsHtml(Boolean isHtml) {
        this.isHtml = isHtml;
    }

    public String getTemplateSubject() {
        return templateSubject;
    }

    public void setTemplateSubject(String templateSubject) {
        this.templateSubject = templateSubject;
    }

    public Integer getLastModify() {
        return lastModify;
    }

    public void setLastModify(Integer lastModify) {
        this.lastModify = lastModify;
    }

    public Integer getLastSend() {
        return lastSend;
    }

    public void setLastSend(Integer lastSend) {
        this.lastSend = lastSend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }
}