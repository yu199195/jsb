package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsAddressSearchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6112274386522638456L;
    @ApiListField("addresses")
    @ApiField("address_result")
    private List<AddressResult> addresses;

    public void setAddresses(List<AddressResult> addresses) {
        this.addresses = addresses;
    }

    public List<AddressResult> getAddresses() {
        return this.addresses;
    }
}


