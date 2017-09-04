package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcUserTopicsGetResponse;

import java.util.Map;

public class TmcUserTopicsGetRequest
        extends BaseTaobaoRequest<TmcUserTopicsGetResponse> {
    private String nick;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public String getApiMethodName() {
        return "taobao.tmc.user.topics.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcUserTopicsGetResponse> getResponseClass() {
        return TmcUserTopicsGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


