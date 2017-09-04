package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WirelessBuntingShopShorturlCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5541525269477898114L;
    @ApiField("shorturl")
    private String shorturl;

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getShorturl() {
        return this.shorturl;
    }
}


