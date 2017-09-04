package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemIncrementUpdateSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4484929456982648156L;
    @ApiField("update_item_result")
    private String updateItemResult;

    public void setUpdateItemResult(String updateItemResult) {
        this.updateItemResult = updateItemResult;
    }

    public String getUpdateItemResult() {
        return this.updateItemResult;
    }
}


