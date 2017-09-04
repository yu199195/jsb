package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemSizemappingTemplateDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3599983953351498617L;
    @ApiField("template_id")
    private Long templateId;

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
    }
}


