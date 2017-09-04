package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemSizemappingTemplateCreateResponse;

import java.util.Map;

public class TmallItemSizemappingTemplateCreateRequest
        extends BaseTaobaoRequest<TmallItemSizemappingTemplateCreateResponse> {
    private String templateContent;
    private String templateName;

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getTemplateContent() {
        return this.templateContent;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getApiMethodName() {
        return "tmall.item.sizemapping.template.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("template_content", this.templateContent);
        txtParams.put("template_name", this.templateName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemSizemappingTemplateCreateResponse> getResponseClass() {
        return TmallItemSizemappingTemplateCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.templateContent, "templateContent");
        RequestCheckUtils.checkMaxLength(this.templateContent, 8000, "templateContent");
        RequestCheckUtils.checkNotEmpty(this.templateName, "templateName");
        RequestCheckUtils.checkMaxLength(this.templateName, 20, "templateName");
    }
}


