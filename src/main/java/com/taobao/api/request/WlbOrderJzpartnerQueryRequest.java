package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderJzpartnerQueryResponse;

import java.util.Map;

public class WlbOrderJzpartnerQueryRequest
        extends BaseTaobaoRequest<WlbOrderJzpartnerQueryResponse> {
    private Long serviceType;
    private Long taobaoTradeId;

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public void setTaobaoTradeId(Long taobaoTradeId) {
        this.taobaoTradeId = taobaoTradeId;
    }

    public Long getTaobaoTradeId() {
        return this.taobaoTradeId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.order.jzpartner.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("service_type", this.serviceType);
        txtParams.put("taobao_trade_id", this.taobaoTradeId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbOrderJzpartnerQueryResponse> getResponseClass() {
        return WlbOrderJzpartnerQueryResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


