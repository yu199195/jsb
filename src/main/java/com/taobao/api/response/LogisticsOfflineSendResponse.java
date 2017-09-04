package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsOfflineSendResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6343165221591427428L;
    @ApiField("shipping")
    private Shipping shipping;

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShipping() {
        return this.shipping;
    }
}


