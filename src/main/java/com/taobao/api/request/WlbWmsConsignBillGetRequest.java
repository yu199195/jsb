package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsConsignBillGetResponse;

import java.util.Map;

public class WlbWmsConsignBillGetRequest
        extends BaseTaobaoRequest<WlbWmsConsignBillGetResponse> {
    private String cnOrderCode;
    private String orderCode;

    public void setCnOrderCode(String cnOrderCode) {
        this.cnOrderCode = cnOrderCode;
    }

    public String getCnOrderCode() {
        return this.cnOrderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.consign.bill.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cn_order_code", this.cnOrderCode);
        txtParams.put("order_code", this.orderCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsConsignBillGetResponse> getResponseClass() {
        return WlbWmsConsignBillGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


