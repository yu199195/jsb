package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class ItemSchemaIncrementUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2632461662523429387L;
    @ApiField("item_id")
    private String itemId;

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }
}


