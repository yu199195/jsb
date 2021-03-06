package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class DeliveryTemplateDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5157722131593283681L;
    @ApiField("complete")
    private Boolean complete;

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Boolean getComplete() {
        return this.complete;
    }
}


