package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserFullinfoGetResponse;

import java.util.Map;

public class SubuserFullinfoGetRequest
        extends BaseTaobaoRequest<SubuserFullinfoGetResponse> {
    private String fields;
    private Long subId;
    private String subNick;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubNick(String subNick) {
        this.subNick = subNick;
    }

    public String getSubNick() {
        return this.subNick;
    }

    public String getApiMethodName() {
        return "taobao.subuser.fullinfo.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("sub_id", this.subId);
        txtParams.put("sub_nick", this.subNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SubuserFullinfoGetResponse> getResponseClass() {
        return SubuserFullinfoGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


