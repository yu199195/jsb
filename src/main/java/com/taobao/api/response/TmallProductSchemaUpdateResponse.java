package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductSchemaUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3696636376891126385L;
    @ApiField("update_product_result")
    private String updateProductResult;

    public void setUpdateProductResult(String updateProductResult) {
        this.updateProductResult = updateProductResult;
    }

    public String getUpdateProductResult() {
        return this.updateProductResult;
    }
}


