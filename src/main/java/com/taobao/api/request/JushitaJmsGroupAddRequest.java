package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JushitaJmsGroupAddResponse;

import java.util.Map;

public class JushitaJmsGroupAddRequest
        extends BaseTaobaoRequest<JushitaJmsGroupAddResponse> {
    private String groupName;
    private String userNicks;
    private String userPlatform;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setUserNicks(String userNicks) {
        this.userNicks = userNicks;
    }

    public String getUserNicks() {
        return this.userNicks;
    }

    public void setUserPlatform(String userPlatform) {
        this.userPlatform = userPlatform;
    }

    public String getUserPlatform() {
        return this.userPlatform;
    }

    public String getApiMethodName() {
        return "taobao.jushita.jms.group.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
        txtParams.put("user_nicks", this.userNicks);
        txtParams.put("user_platform", this.userPlatform);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<JushitaJmsGroupAddResponse> getResponseClass() {
        return JushitaJmsGroupAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.groupName, "groupName");
        RequestCheckUtils.checkNotEmpty(this.userNicks, "userNicks");
        RequestCheckUtils.checkMaxListSize(this.userNicks, 20, "userNicks");
    }
}


