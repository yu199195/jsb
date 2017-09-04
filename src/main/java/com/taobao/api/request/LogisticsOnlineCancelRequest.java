package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOnlineCancelResponse;

import java.util.Map;

public class LogisticsOnlineCancelRequest
        extends BaseTaobaoRequest<LogisticsOnlineCancelResponse> {
    private Long tid;

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.logistics.online.cancel";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsOnlineCancelResponse> getResponseClass() {
        return LogisticsOnlineCancelResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


