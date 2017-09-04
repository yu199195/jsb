package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UpdateSkuPrice
        extends TaobaoObject {
    private static final long serialVersionUID = 8674512452682377889L;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("price")
    private String price;
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

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
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


