package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoBimTradeorderConsignResponse;

import java.util.Map;

public class CainiaoBimTradeorderConsignRequest
        extends BaseTaobaoRequest<CainiaoBimTradeorderConsignResponse> {
    private String storeCode;
    private String tradeId;

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public String getApiMethodName() {
        return "cainiao.bim.tradeorder.consign";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("store_code", this.storeCode);
        txtParams.put("trade_id", this.tradeId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<CainiaoBimTradeorderConsignResponse> getResponseClass() {
        return CainiaoBimTradeorderConsignResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.tradeId, "tradeId");
    }
}


