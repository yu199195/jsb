package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaSmsNumQueryResponse;

import java.util.Map;

public class AlibabaAliqinTaSmsNumQueryRequest
        extends BaseTaobaoRequest<AlibabaAliqinTaSmsNumQueryResponse> {
    private String bizId;
    private Long currentPage;
    private Long pageSize;
    private String queryDate;
    private String recNum;

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate;
    }

    public String getQueryDate() {
        return this.queryDate;
    }

    public void setRecNum(String recNum) {
        this.recNum = recNum;
    }

    public String getRecNum() {
        return this.recNum;
    }

    public String getApiMethodName() {
        return "alibaba.aliqin.ta.sms.num.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_id", this.bizId);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("query_date", this.queryDate);
        txtParams.put("rec_num", this.recNum);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AlibabaAliqinTaSmsNumQueryResponse> getResponseClass() {
        return AlibabaAliqinTaSmsNumQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.currentPage, "currentPage");
        RequestCheckUtils.checkNotEmpty(this.pageSize, "pageSize");
        RequestCheckUtils.checkNotEmpty(this.queryDate, "queryDate");
        RequestCheckUtils.checkNotEmpty(this.recNum, "recNum");
    }
}


