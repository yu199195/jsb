package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeShippingaddressUpdateResponse;

import java.util.Map;

public class TradeShippingaddressUpdateRequest
        extends BaseTaobaoRequest<TradeShippingaddressUpdateResponse> {
    private String receiverAddress;
    private String receiverCity;
    private String receiverDistrict;
    private String receiverMobile;
    private String receiverName;
    private String receiverPhone;
    private String receiverState;
    private String receiverZip;
    private Long tid;

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverCity() {
        return this.receiverCity;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    public String getReceiverDistrict() {
        return this.receiverDistrict;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    public String getReceiverState() {
        return this.receiverState;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    public String getReceiverZip() {
        return this.receiverZip;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.trade.shippingaddress.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("receiver_address", this.receiverAddress);
        txtParams.put("receiver_city", this.receiverCity);
        txtParams.put("receiver_district", this.receiverDistrict);
        txtParams.put("receiver_mobile", this.receiverMobile);
        txtParams.put("receiver_name", this.receiverName);
        txtParams.put("receiver_phone", this.receiverPhone);
        txtParams.put("receiver_state", this.receiverState);
        txtParams.put("receiver_zip", this.receiverZip);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradeShippingaddressUpdateResponse> getResponseClass() {
        return TradeShippingaddressUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.receiverAddress, 228, "receiverAddress");
        RequestCheckUtils.checkMaxLength(this.receiverCity, 32, "receiverCity");
        RequestCheckUtils.checkMaxLength(this.receiverDistrict, 32, "receiverDistrict");
        RequestCheckUtils.checkMaxLength(this.receiverMobile, 11, "receiverMobile");
        RequestCheckUtils.checkMaxLength(this.receiverName, 50, "receiverName");
        RequestCheckUtils.checkMaxLength(this.receiverPhone, 30, "receiverPhone");
        RequestCheckUtils.checkMaxLength(this.receiverState, 32, "receiverState");
        RequestCheckUtils.checkMaxLength(this.receiverZip, 6, "receiverZip");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


