package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Store;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryStoreQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6562853912561551837L;
    @ApiListField("store_list")
    @ApiField("store")
    private List<Store> storeList;

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<Store> getStoreList() {
        return this.storeList;
    }
}


