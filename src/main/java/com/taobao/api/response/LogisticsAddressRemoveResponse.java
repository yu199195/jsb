package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsAddressRemoveResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4277125352837475279L;
    @ApiField("address_result")
    private AddressResult addressResult;

    public void setAddressResult(AddressResult addressResult) {
        this.addressResult = addressResult;
    }

    public AddressResult getAddressResult() {
        return this.addressResult;
    }
}


