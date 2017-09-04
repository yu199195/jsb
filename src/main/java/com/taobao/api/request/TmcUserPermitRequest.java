package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcUserPermitResponse;

import java.util.Map;

public class TmcUserPermitRequest
        extends BaseTaobaoRequest<TmcUserPermitResponse> {
    private String topics;

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getTopics() {
        return this.topics;
    }

    public String getApiMethodName() {
        return "taobao.tmc.user.permit";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("topics", this.topics);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcUserPermitResponse> getResponseClass() {
        return TmcUserPermitResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.topics, 100, "topics");
    }
}


