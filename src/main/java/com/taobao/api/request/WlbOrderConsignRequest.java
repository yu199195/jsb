package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderConsignResponse;

import java.util.Map;

public class WlbOrderConsignRequest
        extends BaseTaobaoRequest<WlbOrderConsignResponse> {
    private String wlbOrderCode;

    public void setWlbOrderCode(String wlbOrderCode) {
        this.wlbOrderCode = wlbOrderCode;
    }

    public String getWlbOrderCode() {
        return this.wlbOrderCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.order.consign";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("wlb_order_code", this.wlbOrderCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbOrderConsignResponse> getResponseClass() {
        return WlbOrderConsignResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.wlbOrderCode, "wlbOrderCode");
        RequestCheckUtils.checkMaxLength(this.wlbOrderCode, 64, "wlbOrderCode");
    }
}


