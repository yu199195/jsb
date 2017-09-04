package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemSizemappingTemplateUpdateResponse;

import java.util.Map;

public class TmallItemSizemappingTemplateUpdateRequest
        extends BaseTaobaoRequest<TmallItemSizemappingTemplateUpdateResponse> {
    private String templateContent;
    private Long templateId;
    private String templateName;

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public String getTemplateContent() {
        return this.templateContent;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getApiMethodName() {
        return "tmall.item.sizemapping.template.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("template_content", this.templateContent);
        txtParams.put("template_id", this.templateId);
        txtParams.put("template_name", this.templateName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemSizemappingTemplateUpdateResponse> getResponseClass() {
        return TmallItemSizemappingTemplateUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.templateContent, "templateContent");
        RequestCheckUtils.checkMaxLength(this.templateContent, 8000, "templateContent");
        RequestCheckUtils.checkNotEmpty(this.templateId, "templateId");
        RequestCheckUtils.checkNotEmpty(this.templateName, "templateName");
        RequestCheckUtils.checkMaxLength(this.templateName, 20, "templateName");
    }
}


