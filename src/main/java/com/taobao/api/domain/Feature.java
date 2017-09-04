package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Feature
        extends TaobaoObject {
    private static final long serialVersionUID = 5717164873748738225L;
    @ApiField("attr_key")
    private String attrKey;
    @ApiField("attr_value")
    private String attrValue;

    public String getAttrKey() {
        return this.attrKey;
    }

    public void setAttrKey(String attrKey) {
        this.attrKey = attrKey;
    }

    public String getAttrValue() {
        return this.attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
}


