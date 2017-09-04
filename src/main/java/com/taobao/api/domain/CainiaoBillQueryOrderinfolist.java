package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoBillQueryOrderinfolist
        extends TaobaoObject {
    private static final long serialVersionUID = 8837465881764617165L;
    @ApiField("order_info")
    private CainiaoBillQueryOrderinfo orderInfo;

    public CainiaoBillQueryOrderinfo getOrderInfo() {
        return this.orderInfo;
    }

    public void setOrderInfo(CainiaoBillQueryOrderinfo orderInfo) {
        this.orderInfo = orderInfo;
    }
}


