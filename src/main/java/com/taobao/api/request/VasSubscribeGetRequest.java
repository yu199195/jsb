package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasSubscribeGetResponse;

import java.util.Map;

public class VasSubscribeGetRequest
        extends BaseTaobaoRequest<VasSubscribeGetResponse> {
    private String articleCode;
    private String nick;

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleCode() {
        return this.articleCode;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public String getApiMethodName() {
        return "taobao.vas.subscribe.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("article_code", this.articleCode);
        txtParams.put("nick", this.nick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<VasSubscribeGetResponse> getResponseClass() {
        return VasSubscribeGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.articleCode, "articleCode");
        RequestCheckUtils.checkNotEmpty(this.nick, "nick");
    }
}


