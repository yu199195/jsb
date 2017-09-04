package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsConsignOrderCreateandsendResponse;

import java.util.Map;

public class LogisticsConsignOrderCreateandsendRequest
        extends BaseTaobaoRequest<LogisticsConsignOrderCreateandsendResponse> {
    private Long companyId;
    private String itemJsonString;
    private Long logisType;
    private String mailNo;
    private Long orderSource;
    private Long orderType;
    private String rAddress;
    private Long rAreaId;
    private String rCityName;
    private String rDistName;
    private String rMobilePhone;
    private String rName;
    private String rProvName;
    private String rTelephone;
    private String rZipCode;
    private String sAddress;
    private Long sAreaId;
    private String sCityName;
    private String sDistName;
    private String sMobilePhone;
    private String sName;
    private String sProvName;
    private String sTelephone;
    private String sZipCode;
    private String shipping;
    private Long tradeId;
    private Long userId;

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return this.companyId;
    }

    public void setItemJsonString(String itemJsonString) {
        this.itemJsonString = itemJsonString;
    }

    public String getItemJsonString() {
        return this.itemJsonString;
    }

    public void setLogisType(Long logisType) {
        this.logisType = logisType;
    }

    public Long getLogisType() {
        return this.logisType;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    public void setOrderSource(Long orderSource) {
        this.orderSource = orderSource;
    }

    public Long getOrderSource() {
        return this.orderSource;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    public String getrAddress() {
        return this.rAddress;
    }

    public void setrAreaId(Long rAreaId) {
        this.rAreaId = rAreaId;
    }

    public Long getrAreaId() {
        return this.rAreaId;
    }

    public void setrCityName(String rCityName) {
        this.rCityName = rCityName;
    }

    public String getrCityName() {
        return this.rCityName;
    }

    public void setrDistName(String rDistName) {
        this.rDistName = rDistName;
    }

    public String getrDistName() {
        return this.rDistName;
    }

    public void setrMobilePhone(String rMobilePhone) {
        this.rMobilePhone = rMobilePhone;
    }

    public String getrMobilePhone() {
        return this.rMobilePhone;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrName() {
        return this.rName;
    }

    public void setrProvName(String rProvName) {
        this.rProvName = rProvName;
    }

    public String getrProvName() {
        return this.rProvName;
    }

    public void setrTelephone(String rTelephone) {
        this.rTelephone = rTelephone;
    }

    public String getrTelephone() {
        return this.rTelephone;
    }

    public void setrZipCode(String rZipCode) {
        this.rZipCode = rZipCode;
    }

    public String getrZipCode() {
        return this.rZipCode;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsAddress() {
        return this.sAddress;
    }

    public void setsAreaId(Long sAreaId) {
        this.sAreaId = sAreaId;
    }

    public Long getsAreaId() {
        return this.sAreaId;
    }

    public void setsCityName(String sCityName) {
        this.sCityName = sCityName;
    }

    public String getsCityName() {
        return this.sCityName;
    }

    public void setsDistName(String sDistName) {
        this.sDistName = sDistName;
    }

    public String getsDistName() {
        return this.sDistName;
    }

    public void setsMobilePhone(String sMobilePhone) {
        this.sMobilePhone = sMobilePhone;
    }

    public String getsMobilePhone() {
        return this.sMobilePhone;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsName() {
        return this.sName;
    }

    public void setsProvName(String sProvName) {
        this.sProvName = sProvName;
    }

    public String getsProvName() {
        return this.sProvName;
    }

    public void setsTelephone(String sTelephone) {
        this.sTelephone = sTelephone;
    }

    public String getsTelephone() {
        return this.sTelephone;
    }

    public void setsZipCode(String sZipCode) {
        this.sZipCode = sZipCode;
    }

    public String getsZipCode() {
        return this.sZipCode;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getShipping() {
        return this.shipping;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getTradeId() {
        return this.tradeId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getApiMethodName() {
        return "taobao.logistics.consign.order.createandsend";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("company_id", this.companyId);
        txtParams.put("item_json_string", this.itemJsonString);
        txtParams.put("logis_type", this.logisType);
        txtParams.put("mail_no", this.mailNo);
        txtParams.put("order_source", this.orderSource);
        txtParams.put("order_type", this.orderType);
        txtParams.put("r_address", this.rAddress);
        txtParams.put("r_area_id", this.rAreaId);
        txtParams.put("r_city_name", this.rCityName);
        txtParams.put("r_dist_name", this.rDistName);
        txtParams.put("r_mobile_phone", this.rMobilePhone);
        txtParams.put("r_name", this.rName);
        txtParams.put("r_prov_name", this.rProvName);
        txtParams.put("r_telephone", this.rTelephone);
        txtParams.put("r_zip_code", this.rZipCode);
        txtParams.put("s_address", this.sAddress);
        txtParams.put("s_area_id", this.sAreaId);
        txtParams.put("s_city_name", this.sCityName);
        txtParams.put("s_dist_name", this.sDistName);
        txtParams.put("s_mobile_phone", this.sMobilePhone);
        txtParams.put("s_name", this.sName);
        txtParams.put("s_prov_name", this.sProvName);
        txtParams.put("s_telephone", this.sTelephone);
        txtParams.put("s_zip_code", this.sZipCode);
        txtParams.put("shipping", this.shipping);
        txtParams.put("trade_id", this.tradeId);
        txtParams.put("user_id", this.userId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsConsignOrderCreateandsendResponse> getResponseClass() {
        return LogisticsConsignOrderCreateandsendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.companyId, "companyId");
        RequestCheckUtils.checkNotEmpty(this.itemJsonString, "itemJsonString");
        RequestCheckUtils.checkNotEmpty(this.logisType, "logisType");
        RequestCheckUtils.checkNotEmpty(this.orderSource, "orderSource");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkNotEmpty(this.rAddress, "rAddress");
        RequestCheckUtils.checkNotEmpty(this.rAreaId, "rAreaId");
        RequestCheckUtils.checkNotEmpty(this.rCityName, "rCityName");
        RequestCheckUtils.checkNotEmpty(this.rName, "rName");
        RequestCheckUtils.checkNotEmpty(this.rProvName, "rProvName");
        RequestCheckUtils.checkNotEmpty(this.rZipCode, "rZipCode");
        RequestCheckUtils.checkNotEmpty(this.sAddress, "sAddress");
        RequestCheckUtils.checkNotEmpty(this.sAreaId, "sAreaId");
        RequestCheckUtils.checkNotEmpty(this.sCityName, "sCityName");
        RequestCheckUtils.checkNotEmpty(this.sName, "sName");
        RequestCheckUtils.checkNotEmpty(this.sProvName, "sProvName");
        RequestCheckUtils.checkNotEmpty(this.sZipCode, "sZipCode");
        RequestCheckUtils.checkNotEmpty(this.tradeId, "tradeId");
        RequestCheckUtils.checkNotEmpty(this.userId, "userId");
    }
}


