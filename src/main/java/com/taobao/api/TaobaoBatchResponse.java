package com.taobao.api;

import java.util.ArrayList;
import java.util.List;

public class TaobaoBatchResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = -3566443848146265580L;
    private List<TaobaoResponse> responseList;

    public TaobaoBatchResponse() {
    }

    public TaobaoBatchResponse(String errorCode, String msg) {
        setErrorCode(errorCode);
        setMsg(msg);
    }

    public List<TaobaoResponse> getResponseList() {
        return this.responseList;
    }

    public void setResponseList(List<TaobaoResponse> responseList) {
        this.responseList = responseList;
    }

    public <T extends TaobaoResponse> T getResponse(TaobaoRequest<T> request) {
        if ((this.responseList == null) || (this.responseList.isEmpty())) {
            return null;
        }
        return (T) this.responseList.get(request.getBatchApiOrder());
    }

    public void addResponse(TaobaoResponse response) {
        if (this.responseList == null) {
            this.responseList = new ArrayList();
        }
        this.responseList.add(response);
    }
}


