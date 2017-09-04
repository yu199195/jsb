package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ProductExtraInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 6562587619953225661L;
    @ApiField("field_key")
    private String fieldKey;
    @ApiField("field_name")
    private String fieldName;
    @ApiField("field_value")
    private String fieldValue;
    @ApiField("product_id")
    private Long productId;

    public String getFieldKey() {
        return this.fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}


