package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbSubscriptionQueryResponse;

import java.util.Map;

public class WlbSubscriptionQueryRequest
        extends BaseTaobaoRequest<WlbSubscriptionQueryResponse> {
    private Long pageNo;
    private Long pageSize;
    private String status;

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.wlb.subscription.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbSubscriptionQueryResponse> getResponseClass() {
        return WlbSubscriptionQueryResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


