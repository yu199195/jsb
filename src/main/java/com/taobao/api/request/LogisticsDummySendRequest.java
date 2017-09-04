package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsDummySendResponse;

import java.util.Map;

public class LogisticsDummySendRequest
        extends BaseTaobaoRequest<LogisticsDummySendResponse> {
    private String feature;
    private String sellerIp;
    private Long tid;

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setSellerIp(String sellerIp) {
        this.sellerIp = sellerIp;
    }

    public String getSellerIp() {
        return this.sellerIp;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.logistics.dummy.send";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("feature", this.feature);
        txtParams.put("seller_ip", this.sellerIp);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsDummySendResponse> getResponseClass() {
        return LogisticsDummySendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


