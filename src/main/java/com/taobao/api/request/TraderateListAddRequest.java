package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TraderateListAddResponse;

import java.util.Map;

public class TraderateListAddRequest
        extends BaseTaobaoRequest<TraderateListAddResponse> {
    private Boolean anony;
    private String content;
    private String result;
    private String role;
    private Long tid;

    public void setAnony(Boolean anony) {
        this.anony = anony;
    }

    public Boolean getAnony() {
        return this.anony;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.traderate.list.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("anony", this.anony);
        txtParams.put("content", this.content);
        txtParams.put("result", this.result);
        txtParams.put("role", this.role);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TraderateListAddResponse> getResponseClass() {
        return TraderateListAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.result, "result");
        RequestCheckUtils.checkNotEmpty(this.role, "role");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


