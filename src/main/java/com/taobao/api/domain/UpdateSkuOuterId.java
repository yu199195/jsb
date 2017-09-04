package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UpdateSkuOuterId
        extends TaobaoObject {
    private static final long serialVersionUID = 5446281876776625751L;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("properties")
    private String properties;
    @ApiField("sku_id")
    private Long skuId;

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}


