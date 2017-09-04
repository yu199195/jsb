package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateExplainAddResponse;

import java.util.Map;

public class TraderateExplainAddRequest
        extends BaseTaobaoRequest<TraderateExplainAddResponse> {
    private Long oid;
    private String reply;

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getReply() {
        return this.reply;
    }

    public String getApiMethodName() {
        return "taobao.traderate.explain.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("oid", this.oid);
        txtParams.put("reply", this.reply);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TraderateExplainAddResponse> getResponseClass() {
        return TraderateExplainAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.oid, "oid");
        RequestCheckUtils.checkNotEmpty(this.reply, "reply");
    }
}


