package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class AddressResult
        extends TaobaoObject {
    private static final long serialVersionUID = 3485838857844948183L;
    @ApiField("addr")
    private String addr;
    @ApiField("area_id")
    private Long areaId;
    @ApiField("cancel_def")
    private Boolean cancelDef;
    @ApiField("city")
    private String city;
    @ApiField("contact_id")
    private Long contactId;
    @ApiField("contact_name")
    private String contactName;
    @ApiField("country")
    private String country;
    @ApiField("get_def")
    private Boolean getDef;
    @ApiField("memo")
    private String memo;
    @ApiField("mobile_phone")
    private String mobilePhone;
    @ApiField("modify_date")
    private Date modifyDate;
    @ApiField("phone")
    private String phone;
    @ApiField("province")
    private String province;
    @ApiField("seller_company")
    private String sellerCompany;
    @ApiField("send_def")
    private Boolean sendDef;
    @ApiField("zip_code")
    private String zipCode;

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Long getAreaId() {
        return this.areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Boolean getCancelDef() {
        return this.cancelDef;
    }

    public void setCancelDef(Boolean cancelDef) {
        this.cancelDef = cancelDef;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getContactId() {
        return this.contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
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

    public Boolean getGetDef() {
        return this.getDef;
    }

    public void setGetDef(Boolean getDef) {
        this.getDef = getDef;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getSellerCompany() {
        return this.sellerCompany;
    }

    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany;
    }

    public Boolean getSendDef() {
        return this.sendDef;
    }

    public void setSendDef(Boolean sendDef) {
        this.sendDef = sendDef;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}


