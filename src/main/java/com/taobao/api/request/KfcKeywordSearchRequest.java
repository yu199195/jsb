package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.KfcKeywordSearchResponse;

import java.util.Map;

public class KfcKeywordSearchRequest
        extends BaseTaobaoRequest<KfcKeywordSearchResponse> {
    private String apply;
    private String content;
    private String nick;

    public void setApply(String apply) {
        this.apply = apply;
    }

    public String getApply() {
        return this.apply;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public String getApiMethodName() {
        return "taobao.kfc.keyword.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("apply", this.apply);
        txtParams.put("content", this.content);
        txtParams.put("nick", this.nick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<KfcKeywordSearchResponse> getResponseClass() {
        return KfcKeywordSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.content, "content");
    }
}


