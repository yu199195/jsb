package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class ItemIncrementUpdateSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1554732141777916119L;
    @ApiField("update_rules")
    private String updateRules;

    public void setUpdateRules(String updateRules) {
        this.updateRules = updateRules;
    }

    public String getUpdateRules() {
        return this.updateRules;
    }
}


