package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeOrderskuUpdateResponse;

import java.util.Map;

public class TradeOrderskuUpdateRequest
        extends BaseTaobaoRequest<TradeOrderskuUpdateResponse> {
    private Long oid;
    private Long skuId;
    private String skuProps;

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuProps(String skuProps) {
        this.skuProps = skuProps;
    }

    public String getSkuProps() {
        return this.skuProps;
    }

    public String getApiMethodName() {
        return "taobao.trade.ordersku.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("oid", this.oid);
        txtParams.put("sku_id", this.skuId);
        txtParams.put("sku_props", this.skuProps);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradeOrderskuUpdateResponse> getResponseClass() {
        return TradeOrderskuUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.oid, "oid");
    }
}


