package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ReciverAddressDo
        extends TaobaoObject {
    private static final long serialVersionUID = 5397484762263964264L;
    @ApiField("city")
    private String city;
    @ApiField("country")
    private String country;
    @ApiField("detail_address")
    private String detailAddress;
    @ApiField("district")
    private String district;
    @ApiField("province")
    private String province;
    @ApiField("street")
    private String street;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDetailAddress() {
        return this.detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
}


