package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDutyDeleteResponse;

import java.util.Map;

public class SubuserDutyDeleteRequest
        extends BaseTaobaoRequest<SubuserDutyDeleteResponse> {
    private Long dutyId;
    private String userNick;

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public Long getDutyId() {
        return this.dutyId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public String getApiMethodName() {
        return "taobao.subuser.duty.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("duty_id", this.dutyId);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserDutyDeleteResponse> getResponseClass() {
        return SubuserDutyDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.dutyId, "dutyId");
        RequestCheckUtils.checkNotEmpty(this.userNick, "userNick");
    }
}


