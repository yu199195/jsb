package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WirelessBuntingItemShorturlCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5281944411496927795L;
    @ApiField("shorturl")
    private String shorturl;

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getShorturl() {
        return this.shorturl;
    }
}


