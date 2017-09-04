package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemSizemappingTemplateDeleteResponse;

import java.util.Map;

public class TmallItemSizemappingTemplateDeleteRequest
        extends BaseTaobaoRequest<TmallItemSizemappingTemplateDeleteResponse> {
    private Long templateId;

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public String getApiMethodName() {
        return "tmall.item.sizemapping.template.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("template_id", this.templateId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemSizemappingTemplateDeleteResponse> getResponseClass() {
        return TmallItemSizemappingTemplateDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.templateId, "templateId");
    }
}


