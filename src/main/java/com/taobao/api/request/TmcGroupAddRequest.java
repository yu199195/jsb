package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcGroupAddResponse;

import java.util.Map;

public class TmcGroupAddRequest
        extends BaseTaobaoRequest<TmcGroupAddResponse> {
    private String groupName;
    private String nicks;
    private String userPlatform;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setNicks(String nicks) {
        this.nicks = nicks;
    }

    public String getNicks() {
        return this.nicks;
    }

    public void setUserPlatform(String userPlatform) {
        this.userPlatform = userPlatform;
    }

    public String getUserPlatform() {
        return this.userPlatform;
    }

    public String getApiMethodName() {
        return "taobao.tmc.group.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("group_name", this.groupName);
        txtParams.put("nicks", this.nicks);
        txtParams.put("user_platform", this.userPlatform);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcGroupAddResponse> getResponseClass() {
        return TmcGroupAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.groupName, "groupName");
        RequestCheckUtils.checkMaxLength(this.groupName, 32, "groupName");
        RequestCheckUtils.checkNotEmpty(this.nicks, "nicks");
        RequestCheckUtils.checkMaxListSize(this.nicks, 200, "nicks");
    }
}


