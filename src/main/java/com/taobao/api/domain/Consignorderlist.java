package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Consignorderlist
        extends TaobaoObject {
    private static final long serialVersionUID = 3825626626472522819L;
    @ApiField("consign_order")
    private Consignorder consignOrder;

    public Consignorder getConsignOrder() {
        return this.consignOrder;
    }

    public void setConsignOrder(Consignorder consignOrder) {
        this.consignOrder = consignOrder;
    }
}


