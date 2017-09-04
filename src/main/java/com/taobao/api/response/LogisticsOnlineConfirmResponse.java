package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsOnlineConfirmResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7643842776672755585L;
    @ApiField("shipping")
    private Shipping shipping;

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShipping() {
        return this.shipping;
    }
}


