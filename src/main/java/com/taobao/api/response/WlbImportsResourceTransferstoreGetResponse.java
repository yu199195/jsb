package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TranStoreResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbImportsResourceTransferstoreGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4745419416384925341L;
    @ApiListField("stores")
    @ApiField("tran_store_result")
    private List<TranStoreResult> stores;

    public void setStores(List<TranStoreResult> stores) {
        this.stores = stores;
    }

    public List<TranStoreResult> getStores() {
        return this.stores;
    }
}


