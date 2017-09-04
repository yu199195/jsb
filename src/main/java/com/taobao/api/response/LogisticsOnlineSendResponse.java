package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsOnlineSendResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3232862199213339329L;
    @ApiField("shipping")
    private Shipping shipping;

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShipping() {
        return this.shipping;
    }
}


