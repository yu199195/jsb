package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbTradeorderGetResponse;

import java.util.Map;

public class WlbTradeorderGetRequest
        extends BaseTaobaoRequest<WlbTradeorderGetResponse> {
    private String subTradeId;
    private String tradeId;
    private String tradeType;

    public void setSubTradeId(String subTradeId) {
        this.subTradeId = subTradeId;
    }

    public String getSubTradeId() {
        return this.subTradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public String getApiMethodName() {
        return "taobao.wlb.tradeorder.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("sub_trade_id", this.subTradeId);
        txtParams.put("trade_id", this.tradeId);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbTradeorderGetResponse> getResponseClass() {
        return WlbTradeorderGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.tradeId, "tradeId");
        RequestCheckUtils.checkNotEmpty(this.tradeType, "tradeType");
    }
}


