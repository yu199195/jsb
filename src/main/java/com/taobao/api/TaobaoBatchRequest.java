package com.taobao.api;

import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TaobaoBatchRequest
        extends BaseTaobaoRequest<TaobaoBatchResponse> {
    private String publicMethod;
    private TaobaoHashMap publicParams;
    private List<TaobaoRequest<? extends TaobaoResponse>> requestList;

    public String getPublicMethod() {
        return this.publicMethod;
    }

    public void setPublicMethod(String publicMethod) {
        this.publicMethod = publicMethod;
    }

    public TaobaoHashMap getPublicParams() {
        if (this.publicParams == null) {
            this.publicParams = new TaobaoHashMap();
        }
        return this.publicParams;
    }

    public void setPublicParams(TaobaoHashMap publicParams) {
        this.publicParams = publicParams;
    }

    public void addPublicParam(String key, String value) {
        getPublicParams().put(key, value);
    }

    public List<TaobaoRequest<? extends TaobaoResponse>> getRequestList() {
        return this.requestList;
    }

    public void setRequestList(List<TaobaoRequest<? extends TaobaoResponse>> requestList) {
        this.requestList = requestList;
    }

    public TaobaoBatchRequest addRequest(TaobaoRequest<? extends TaobaoResponse> request) {
        if (this.requestList == null) {
            this.requestList = new ArrayList();
        }
        this.requestList.add(request);
        return this;
    }

    public void check() throws ApiRuleException {
    }

    public String getApiMethodName() {
        return null;
    }

    public Class<TaobaoBatchResponse> getResponseClass() {
        return TaobaoBatchResponse.class;
    }

    public Map<String, String> getTextParams() {
        return null;
    }
}


