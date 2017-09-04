package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsAddressModifyResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2597591127546745579L;
    @ApiField("address_result")
    private AddressResult addressResult;

    public void setAddressResult(AddressResult addressResult) {
        this.addressResult = addressResult;
    }

    public AddressResult getAddressResult() {
        return this.addressResult;
    }
}


