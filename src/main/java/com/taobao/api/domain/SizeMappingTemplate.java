package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class SizeMappingTemplate
        extends TaobaoObject {
    private static final long serialVersionUID = 4781121472332673688L;
    @ApiField("template_content")
    private String templateContent;
    @ApiField("template_id")
    private Long templateId;
    @ApiField("template_name")
    private String templateName;

    public String getTemplateContent() {
        return this.templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}


