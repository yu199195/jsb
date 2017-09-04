package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SizeMappingTemplate;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemSizemappingTemplateGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2794652538229256319L;
    @ApiField("size_mapping_template")
    private SizeMappingTemplate sizeMappingTemplate;

    public void setSizeMappingTemplate(SizeMappingTemplate sizeMappingTemplate) {
        this.sizeMappingTemplate = sizeMappingTemplate;
    }

    public SizeMappingTemplate getSizeMappingTemplate() {
        return this.sizeMappingTemplate;
    }
}


