package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Store;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryStoreManageResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2251854539963134633L;
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


