package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class ScitemMapDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7191159415328991827L;
    @ApiField("module")
    private Long module;

    public void setModule(Long module) {
        this.module = module;
    }

    public Long getModule() {
        return this.module;
    }
}


