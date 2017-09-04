package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TranStoreResult
        extends TaobaoObject {
    private static final long serialVersionUID = 7277415925236928244L;
    @ApiField("store_address")
    private String storeAddress;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("store_name")
    private String storeName;

    public String getStoreAddress() {
        return this.storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}


