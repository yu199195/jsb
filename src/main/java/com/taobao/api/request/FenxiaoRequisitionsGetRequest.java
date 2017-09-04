package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRequisitionsGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoRequisitionsGetRequest
        extends BaseTaobaoRequest<FenxiaoRequisitionsGetResponse> {
    private Date applyEnd;
    private Date applyStart;
    private Long pageNo;
    private Long pageSize;
    private Long status;

    public void setApplyEnd(Date applyEnd) {
        this.applyEnd = applyEnd;
    }

    public Date getApplyEnd() {
        return this.applyEnd;
    }

    public void setApplyStart(Date applyStart) {
        this.applyStart = applyStart;
    }

    public Date getApplyStart() {
        return this.applyStart;
    }

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

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.requisitions.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("apply_end", this.applyEnd);
        txtParams.put("apply_start", this.applyStart);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoRequisitionsGetResponse> getResponseClass() {
        return FenxiaoRequisitionsGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


