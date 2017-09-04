package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Distributor;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoDistributorsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4165417117768222172L;
    @ApiListField("distributors")
    @ApiField("distributor")
    private List<Distributor> distributors;

    public void setDistributors(List<Distributor> distributors) {
        this.distributors = distributors;
    }

    public List<Distributor> getDistributors() {
        return this.distributors;
    }
}


