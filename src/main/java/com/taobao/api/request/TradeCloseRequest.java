package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeCloseResponse;

import java.util.Map;

public class TradeCloseRequest
        extends BaseTaobaoRequest<TradeCloseResponse> {
    private String closeReason;
    private Long tid;

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.trade.close";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("close_reason", this.closeReason);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradeCloseResponse> getResponseClass() {
        return TradeCloseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.closeReason, "closeReason");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


