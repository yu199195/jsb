package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeReceivetimeDelayResponse;

import java.util.Map;

public class TradeReceivetimeDelayRequest
        extends BaseTaobaoRequest<TradeReceivetimeDelayResponse> {
    private Long days;
    private Long tid;

    public void setDays(Long days) {
        this.days = days;
    }

    public Long getDays() {
        return this.days;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.trade.receivetime.delay";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("days", this.days);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradeReceivetimeDelayResponse> getResponseClass() {
        return TradeReceivetimeDelayResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.days, "days");
        RequestCheckUtils.checkMaxValue(this.days, 10L, "days");
        RequestCheckUtils.checkMinValue(this.days, 3L, "days");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


