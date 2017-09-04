package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UpdateSkuShipTime
        extends TaobaoObject {
    private static final long serialVersionUID = 8569522695365672678L;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("properties")
    private String properties;
    @ApiField("ship_time")
    private String shipTime;
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

    public String getShipTime() {
        return this.shipTime;
    }

    public void setShipTime(String shipTime) {
        this.shipTime = shipTime;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}


