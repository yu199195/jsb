package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressReachableResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsAddressReachableResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1537869396587122623L;
    @ApiListField("reachable_result_list")
    @ApiField("address_reachable_result")
    private List<AddressReachableResult> reachableResultList;

    public void setReachableResultList(List<AddressReachableResult> reachableResultList) {
        this.reachableResultList = reachableResultList;
    }

    public List<AddressReachableResult> getReachableResultList() {
        return this.reachableResultList;
    }
}


