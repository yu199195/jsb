package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductSchemaAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4456372643161987633L;
    @ApiField("add_product_result")
    private String addProductResult;

    public void setAddProductResult(String addProductResult) {
        this.addProductResult = addProductResult;
    }

    public String getAddProductResult() {
        return this.addProductResult;
    }
}


