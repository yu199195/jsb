package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemTemplate
        extends TaobaoObject {
    private static final long serialVersionUID = 3445837552735381936L;
    @ApiField("shop_type")
    private Long shopType;
    @ApiField("template_id")
    private Long templateId;
    @ApiField("template_name")
    private String templateName;

    public Long getShopType() {
        return this.shopType;
    }

    public void setShopType(Long shopType) {
        this.shopType = shopType;
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


