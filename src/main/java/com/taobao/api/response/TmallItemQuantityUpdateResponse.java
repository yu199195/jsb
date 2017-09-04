package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemQuantityUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8356539963257965568L;
    @ApiField("quantity_update_result")
    private String quantityUpdateResult;

    public void setQuantityUpdateResult(String quantityUpdateResult) {
        this.quantityUpdateResult = quantityUpdateResult;
    }

    public String getQuantityUpdateResult() {
        return this.quantityUpdateResult;
    }
}


