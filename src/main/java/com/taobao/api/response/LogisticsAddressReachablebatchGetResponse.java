package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressReachableTopResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class LogisticsAddressReachablebatchGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3259165465652338948L;
    @ApiListField("reachable_results")
    @ApiField("address_reachable_top_result")
    private List<AddressReachableTopResult> reachableResults;

    public void setReachableResults(List<AddressReachableTopResult> reachableResults) {
        this.reachableResults = reachableResults;
    }

    public List<AddressReachableTopResult> getReachableResults() {
        return this.reachableResults;
    }
}


