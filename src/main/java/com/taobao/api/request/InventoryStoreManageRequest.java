package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryStoreManageResponse;

import java.util.Map;

public class InventoryStoreManageRequest
        extends BaseTaobaoRequest<InventoryStoreManageResponse> {
    private String address;
    private String addressAreaName;
    private String aliasName;
    private String contact;
    private String operateType;
    private String phone;
    private Long postcode;
    private String storeCode;
    private String storeName;
    private String storeType;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddressAreaName(String addressAreaName) {
        this.addressAreaName = addressAreaName;
    }

    public String getAddressAreaName() {
        return this.addressAreaName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return this.contact;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPostcode(Long postcode) {
        this.postcode = postcode;
    }

    public Long getPostcode() {
        return this.postcode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getStoreType() {
        return this.storeType;
    }

    public String getApiMethodName() {
        return "taobao.inventory.store.manage";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("address_area_name", this.addressAreaName);
        txtParams.put("alias_name", this.aliasName);
        txtParams.put("contact", this.contact);
        txtParams.put("operate_type", this.operateType);
        txtParams.put("phone", this.phone);
        txtParams.put("postcode", this.postcode);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("store_name", this.storeName);
        txtParams.put("store_type", this.storeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<InventoryStoreManageResponse> getResponseClass() {
        return InventoryStoreManageResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.address, "address");
        RequestCheckUtils.checkNotEmpty(this.addressAreaName, "addressAreaName");
        RequestCheckUtils.checkNotEmpty(this.operateType, "operateType");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
        RequestCheckUtils.checkNotEmpty(this.storeName, "storeName");
        RequestCheckUtils.checkNotEmpty(this.storeType, "storeType");
    }
}


