package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemUpdateSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4868391695116976928L;
    @ApiField("update_item_result")
    private String updateItemResult;

    public void setUpdateItemResult(String updateItemResult) {
        this.updateItemResult = updateItemResult;
    }

    public String getUpdateItemResult() {
        return this.updateItemResult;
    }
}


