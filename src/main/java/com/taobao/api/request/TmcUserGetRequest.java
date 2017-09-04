package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcUserGetResponse;

import java.util.Map;

public class TmcUserGetRequest
        extends BaseTaobaoRequest<TmcUserGetResponse> {
    private String fields;
    private String nick;
    private String userPlatform;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setUserPlatform(String userPlatform) {
        this.userPlatform = userPlatform;
    }

    public String getUserPlatform() {
        return this.userPlatform;
    }

    public String getApiMethodName() {
        return "taobao.tmc.user.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("nick", this.nick);
        txtParams.put("user_platform", this.userPlatform);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcUserGetResponse> getResponseClass() {
        return TmcUserGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkNotEmpty(this.nick, "nick");
        RequestCheckUtils.checkMaxLength(this.nick, 100, "nick");
    }
}


