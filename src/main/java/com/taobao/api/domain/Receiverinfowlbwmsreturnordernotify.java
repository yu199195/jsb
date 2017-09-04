package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Receiverinfowlbwmsreturnordernotify
        extends TaobaoObject {
    private static final long serialVersionUID = 5446397917112376193L;
    @ApiField("receiver_address")
    private String receiverAddress;
    @ApiField("receiver_area")
    private String receiverArea;
    @ApiField("receiver_city")
    private String receiverCity;
    @ApiField("receiver_mobile")
    private String receiverMobile;
    @ApiField("receiver_name")
    private String receiverName;
    @ApiField("receiver_nick")
    private String receiverNick;
    @ApiField("receiver_phone")
    private String receiverPhone;
    @ApiField("receiver_province")
    private String receiverProvince;
    @ApiField("receiver_town")
    private String receiverTown;
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

    public String getReceiverNick() {
        return this.receiverNick;
    }

    public void setReceiverNick(String receiverNick) {
        this.receiverNick = receiverNick;
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

    public String getReceiverTown() {
        return this.receiverTown;
    }

    public void setReceiverTown(String receiverTown) {
        this.receiverTown = receiverTown;
    }

    public String getReceiverZipCode() {
        return this.receiverZipCode;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }
}


