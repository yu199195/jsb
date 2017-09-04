package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeAmountGetResponse;

import java.util.Map;

public class TradeAmountGetRequest
        extends BaseTaobaoRequest<TradeAmountGetResponse> {
    private String fields;
    private Long tid;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.trade.amount.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradeAmountGetResponse> getResponseClass() {
        return TradeAmountGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
        RequestCheckUtils.checkMaxValue(this.tid, 9223372036854775807L, "tid");
        RequestCheckUtils.checkMinValue(this.tid, -9223372036854775808L, "tid");
    }
}


