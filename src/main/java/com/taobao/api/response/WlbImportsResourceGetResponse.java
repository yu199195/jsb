package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ResourceResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbImportsResourceGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2274781716423744875L;
    @ApiListField("resources")
    @ApiField("resource_result")
    private List<ResourceResult> resources;

    public void setResources(List<ResourceResult> resources) {
        this.resources = resources;
    }

    public List<ResourceResult> getResources() {
        return this.resources;
    }
}


