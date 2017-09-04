package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressAddResponse;

import java.util.Map;

public class LogisticsAddressAddRequest
        extends BaseTaobaoRequest<LogisticsAddressAddResponse> {
    private String addr;
    private Boolean cancelDef;
    private String city;
    private String contactName;
    private String country;
    private Boolean getDef;
    private String memo;
    private String mobilePhone;
    private String phone;
    private String province;
    private String sellerCompany;
    private Boolean sendDef;
    private String zipCode;

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setCancelDef(Boolean cancelDef) {
        this.cancelDef = cancelDef;
    }

    public Boolean getCancelDef() {
        return this.cancelDef;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setGetDef(Boolean getDef) {
        this.getDef = getDef;
    }

    public Boolean getGetDef() {
        return this.getDef;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }

    public void setSellerCompany(String sellerCompany) {
        this.sellerCompany = sellerCompany;
    }

    public String getSellerCompany() {
        return this.sellerCompany;
    }

    public void setSendDef(Boolean sendDef) {
        this.sendDef = sendDef;
    }

    public Boolean getSendDef() {
        return this.sendDef;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getApiMethodName() {
        return "taobao.logistics.address.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("addr", this.addr);
        txtParams.put("cancel_def", this.cancelDef);
        txtParams.put("city", this.city);
        txtParams.put("contact_name", this.contactName);
        txtParams.put("country", this.country);
        txtParams.put("get_def", this.getDef);
        txtParams.put("memo", this.memo);
        txtParams.put("mobile_phone", this.mobilePhone);
        txtParams.put("phone", this.phone);
        txtParams.put("province", this.province);
        txtParams.put("seller_company", this.sellerCompany);
        txtParams.put("send_def", this.sendDef);
        txtParams.put("zip_code", this.zipCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsAddressAddResponse> getResponseClass() {
        return LogisticsAddressAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.addr, "addr");
        RequestCheckUtils.checkNotEmpty(this.city, "city");
        RequestCheckUtils.checkNotEmpty(this.contactName, "contactName");
        RequestCheckUtils.checkMaxLength(this.memo, 256, "memo");
        RequestCheckUtils.checkNotEmpty(this.province, "province");
        RequestCheckUtils.checkMaxLength(this.sellerCompany, 20, "sellerCompany");
    }
}


