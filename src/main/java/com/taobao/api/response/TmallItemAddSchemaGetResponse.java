package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallItemAddSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3469513958165684311L;
    @ApiField("add_item_result")
    private String addItemResult;

    public void setAddItemResult(String addItemResult) {
        this.addItemResult = addItemResult;
    }

    public String getAddItemResult() {
        return this.addItemResult;
    }
}


