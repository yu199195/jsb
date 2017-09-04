package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Receiverwlbwmsstockoutordernotify
        extends TaobaoObject {
    private static final long serialVersionUID = 2124536744526615667L;
    @ApiField("receiver_address")
    private String receiverAddress;
    @ApiField("receiver_area")
    private String receiverArea;
    @ApiField("receiver_city")
    private String receiverCity;
    @ApiField("receiver_code")
    private String receiverCode;
    @ApiField("receiver_mobile")
    private String receiverMobile;
    @ApiField("receiver_name")
    private String receiverName;
    @ApiField("receiver_phone")
    private String receiverPhone;
    @ApiField("receiver_province")
    private String receiverProvince;
    @ApiField("receiver_zip_code")
    private String receiverZipCode;

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverArea() {
        return this.receiverArea;
    }

    public void setReceiverArea(String receiverArea) {
        this.receiverArea = receiverArea;
    }

    public String getReceiverCity() {
        return this.receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverCode() {
        return this.receiverCode;
    }

    public void setReceiverCode(String receiverCode) {
        this.receiverCode = receiverCode;
    }

    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverProvince() {
        return this.receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverZipCode() {
        return this.receiverZipCode;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }
}


