package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductAddSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3243586181514646462L;
    @ApiField("add_product_rule")
    private String addProductRule;

    public void setAddProductRule(String addProductRule) {
        this.addProductRule = addProductRule;
    }

    public String getAddProductRule() {
        return this.addProductRule;
    }
}


