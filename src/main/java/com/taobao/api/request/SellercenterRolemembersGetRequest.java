package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterRolemembersGetResponse;

import java.util.Map;

public class SellercenterRolemembersGetRequest
        extends BaseTaobaoRequest<SellercenterRolemembersGetResponse> {
    private Long roleId;

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getRoleId() {
        return this.roleId;
    }

    public String getApiMethodName() {
        return "taobao.sellercenter.rolemembers.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("role_id", this.roleId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SellercenterRolemembersGetResponse> getResponseClass() {
        return SellercenterRolemembersGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.roleId, "roleId");
    }
}


