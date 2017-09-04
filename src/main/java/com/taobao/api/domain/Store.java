package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Store
        extends TaobaoObject {
    private static final long serialVersionUID = 2154766767339698759L;
    @ApiField("address")
    private String address;
    @ApiField("address_area_name")
    private String addressAreaName;
    @ApiField("alias_name")
    private String aliasName;
    @ApiField("contact")
    private String contact;
    @ApiField("phone")
    private String phone;
    @ApiField("post_code")
    private String postCode;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("store_name")
    private String storeName;
    @ApiField("store_type")
    private String storeType;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressAreaName() {
        return this.addressAreaName;
    }

    public void setAddressAreaName(String addressAreaName) {
        this.addressAreaName = addressAreaName;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
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

    public String getStoreType() {
        return this.storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }
}


