package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ModularDescInfo;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemDescModulesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4154327516642497333L;
    @ApiField("modular_desc_info")
    private ModularDescInfo modularDescInfo;

    public void setModularDescInfo(ModularDescInfo modularDescInfo) {
        this.modularDescInfo = modularDescInfo;
    }

    public ModularDescInfo getModularDescInfo() {
        return this.modularDescInfo;
    }
}


