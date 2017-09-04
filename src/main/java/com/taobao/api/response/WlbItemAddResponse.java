package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbItemAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6567137927118816937L;
    @ApiField("item_id")
    private String itemId;

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }
}


