package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SizeMappingTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmallItemSizemappingTemplatesListResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8646298876483452882L;
    @ApiListField("size_mapping_templates")
    @ApiField("size_mapping_template")
    private List<SizeMappingTemplate> sizeMappingTemplates;

    public void setSizeMappingTemplates(List<SizeMappingTemplate> sizeMappingTemplates) {
        this.sizeMappingTemplates = sizeMappingTemplates;
    }

    public List<SizeMappingTemplate> getSizeMappingTemplates() {
        return this.sizeMappingTemplates;
    }
}


