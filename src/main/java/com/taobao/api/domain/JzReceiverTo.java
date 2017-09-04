package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class JzReceiverTo
        extends TaobaoObject {
    private static final long serialVersionUID = 2665745147551153656L;
    @ApiField("address")
    private String address;
    @ApiField("city")
    private String city;
    @ApiField("contact_name")
    private String contactName;
    @ApiField("country")
    private String country;
    @ApiField("district")
    private String district;
    @ApiField("mobile_phone")
    private String mobilePhone;
    @ApiField("province")
    private String province;
    @ApiField("street")
    private String street;
    @ApiField("tele_phone")
    private String telePhone;
    @ApiField("zip_code")
    private String zipCode;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTelePhone() {
        return this.telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}


