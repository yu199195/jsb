package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UpdateItemShipTimeOption
        extends TaobaoObject {
    private static final long serialVersionUID = 2387773168753468656L;
    @ApiField("ship_time_type")
    private Long shipTimeType;
    @ApiField("update_type")
    private Long updateType;

    public Long getShipTimeType() {
        return this.shipTimeType;
    }

    public void setShipTimeType(Long shipTimeType) {
        this.shipTimeType = shipTimeType;
    }

    public Long getUpdateType() {
        return this.updateType;
    }

    public void setUpdateType(Long updateType) {
        this.updateType = updateType;
    }
}


