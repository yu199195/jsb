package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.OcTradetagsGetResponse;

import java.util.Map;

public class OcTradetagsGetRequest
        extends BaseTaobaoRequest<OcTradetagsGetResponse> {
    private Long history;
    private String tagNames;
    private String tagTypes;
    private Long tid;

    public void setHistory(Long history) {
        this.history = history;
    }

    public Long getHistory() {
        return this.history;
    }

    public void setTagNames(String tagNames) {
        this.tagNames = tagNames;
    }

    public String getTagNames() {
        return this.tagNames;
    }

    public void setTagTypes(String tagTypes) {
        this.tagTypes = tagTypes;
    }

    public String getTagTypes() {
        return this.tagTypes;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.oc.tradetags.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("history", this.history);
        txtParams.put("tag_names", this.tagNames);
        txtParams.put("tag_types", this.tagTypes);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OcTradetagsGetResponse> getResponseClass() {
        return OcTradetagsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.tagNames, 20, "tagNames");
        RequestCheckUtils.checkMaxListSize(this.tagTypes, 20, "tagTypes");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


