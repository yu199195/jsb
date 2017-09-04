package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderCreateResponse;

import java.util.Map;

public class FenxiaoDealerRequisitionorderCreateRequest
        extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderCreateResponse> {
    private String address;
    private String buyerName;
    private String city;
    private String district;
    private String idCardNumber;
    private String logisticsType;
    private String mobile;
    private String orderDetail;
    private String phone;
    private String postCode;
    private String province;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    public String getLogisticsType() {
        return this.logisticsType;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOrderDetail() {
        return this.orderDetail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return this.province;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("buyer_name", this.buyerName);
        txtParams.put("city", this.city);
        txtParams.put("district", this.district);
        txtParams.put("id_card_number", this.idCardNumber);
        txtParams.put("logistics_type", this.logisticsType);
        txtParams.put("mobile", this.mobile);
        txtParams.put("order_detail", this.orderDetail);
        txtParams.put("phone", this.phone);
        txtParams.put("post_code", this.postCode);
        txtParams.put("province", this.province);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDealerRequisitionorderCreateResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.address, "address");
        RequestCheckUtils.checkNotEmpty(this.buyerName, "buyerName");
        RequestCheckUtils.checkNotEmpty(this.logisticsType, "logisticsType");
        RequestCheckUtils.checkNotEmpty(this.orderDetail, "orderDetail");
        RequestCheckUtils.checkMaxListSize(this.orderDetail, 50, "orderDetail");
        RequestCheckUtils.checkNotEmpty(this.province, "province");
    }
}


