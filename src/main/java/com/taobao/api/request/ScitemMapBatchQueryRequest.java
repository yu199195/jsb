package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemMapBatchQueryResponse;

import java.util.Map;

public class ScitemMapBatchQueryRequest
        extends BaseTaobaoRequest<ScitemMapBatchQueryResponse> {
    private String outerCode;
    private Long pageIndex;
    private Long pageSize;
    private Long scItemId;

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public String getApiMethodName() {
        return "taobao.scitem.map.batch.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("page_index", this.pageIndex);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("sc_item_id", this.scItemId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ScitemMapBatchQueryResponse> getResponseClass() {
        return ScitemMapBatchQueryResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


