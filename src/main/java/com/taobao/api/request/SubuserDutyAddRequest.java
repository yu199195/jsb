package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDutyAddResponse;

import java.util.Map;

public class SubuserDutyAddRequest
        extends BaseTaobaoRequest<SubuserDutyAddResponse> {
    private Long dutyLevel;
    private String dutyName;
    private String userNick;

    public void setDutyLevel(Long dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public Long getDutyLevel() {
        return this.dutyLevel;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public String getDutyName() {
        return this.dutyName;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public String getApiMethodName() {
        return "taobao.subuser.duty.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("duty_level", this.dutyLevel);
        txtParams.put("duty_name", this.dutyName);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserDutyAddResponse> getResponseClass() {
        return SubuserDutyAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.dutyLevel, "dutyLevel");
        RequestCheckUtils.checkNotEmpty(this.dutyName, "dutyName");
        RequestCheckUtils.checkNotEmpty(this.userNick, "userNick");
    }
}


