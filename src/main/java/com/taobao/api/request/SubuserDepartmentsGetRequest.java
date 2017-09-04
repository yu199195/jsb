package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDepartmentsGetResponse;

import java.util.Map;

public class SubuserDepartmentsGetRequest
        extends BaseTaobaoRequest<SubuserDepartmentsGetResponse> {
    private String userNick;

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public String getApiMethodName() {
        return "taobao.subuser.departments.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserDepartmentsGetResponse> getResponseClass() {
        return SubuserDepartmentsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.userNick, "userNick");
    }
}


