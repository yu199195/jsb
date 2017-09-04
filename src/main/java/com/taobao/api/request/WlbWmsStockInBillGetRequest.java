package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsStockInBillGetResponse;

import java.util.Map;

public class WlbWmsStockInBillGetRequest
        extends BaseTaobaoRequest<WlbWmsStockInBillGetResponse> {
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
        return "taobao.wlb.wms.stock.in.bill.get";
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

    public Class<WlbWmsStockInBillGetResponse> getResponseClass() {
        return WlbWmsStockInBillGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


