package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpuTemplateDO;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductTemplateGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8617741573422488496L;
    @ApiField("template")
    private SpuTemplateDO template;

    public void setTemplate(SpuTemplateDO template) {
        this.template = template;
    }

    public SpuTemplateDO getTemplate() {
        return this.template;
    }
}


