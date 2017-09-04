package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5375269799167428767L;
    @ApiField("get_product_result")
    private String getProductResult;

    public void setGetProductResult(String getProductResult) {
        this.getProductResult = getProductResult;
    }

    public String getGetProductResult() {
        return this.getProductResult;
    }
}


