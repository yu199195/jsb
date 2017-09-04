package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcUserCancelResponse;

import java.util.Map;

public class TmcUserCancelRequest
        extends BaseTaobaoRequest<TmcUserCancelResponse> {
    private String nick;
    private String userPlatform;

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
        return "taobao.tmc.user.cancel";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("user_platform", this.userPlatform);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcUserCancelResponse> getResponseClass() {
        return TmcUserCancelResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.nick, "nick");
    }
}


