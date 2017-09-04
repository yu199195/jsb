package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbImportsOrderGetResponse;

import java.util.Date;
import java.util.Map;

public class WlbImportsOrderGetRequest
        extends BaseTaobaoRequest<WlbImportsOrderGetResponse> {
    private Date gmtCreateEnd;
    private Date gmtCreateStart;
    private Long pageNo;
    private Long pageSize;
    private String statusCode;
    private Long tradeId;

    public void setGmtCreateEnd(Date gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
    }

    public Date getGmtCreateEnd() {
        return this.gmtCreateEnd;
    }

    public void setGmtCreateStart(Date gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
    }

    public Date getGmtCreateStart() {
        return this.gmtCreateStart;
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

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getTradeId() {
        return this.tradeId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.imports.order.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gmt_create_end", this.gmtCreateEnd);
        txtParams.put("gmt_create_start", this.gmtCreateStart);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("status_code", this.statusCode);
        txtParams.put("trade_id", this.tradeId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbImportsOrderGetResponse> getResponseClass() {
        return WlbImportsOrderGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


