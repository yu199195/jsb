package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsOrderCancelNotifyResponse;

import java.util.Map;

public class WlbWmsOrderCancelNotifyRequest
        extends BaseTaobaoRequest<WlbWmsOrderCancelNotifyResponse> {
    private String orderCode;
    private String orderType;
    private String storeCode;

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.order.cancel.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_type", this.orderType);
        txtParams.put("store_code", this.storeCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsOrderCancelNotifyResponse> getResponseClass() {
        return WlbWmsOrderCancelNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.orderCode, "orderCode");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
    }
}


