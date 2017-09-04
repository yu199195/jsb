package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TmallProductUpdateSchemaGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1166837831614952183L;
    @ApiField("update_product_schema")
    private String updateProductSchema;

    public void setUpdateProductSchema(String updateProductSchema) {
        this.updateProductSchema = updateProductSchema;
    }

    public String getUpdateProductSchema() {
        return this.updateProductSchema;
    }
}


