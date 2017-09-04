package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FuwuScoresGetResponse;

import java.util.Date;
import java.util.Map;

public class FuwuScoresGetRequest
        extends BaseTaobaoRequest<FuwuScoresGetResponse> {
    private Long currentPage;
    private Date date;
    private Long pageSize;

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getApiMethodName() {
        return "taobao.fuwu.scores.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("current_page", this.currentPage);
        txtParams.put("date", this.date);
        txtParams.put("page_size", this.pageSize);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FuwuScoresGetResponse> getResponseClass() {
        return FuwuScoresGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.currentPage, "currentPage");
        RequestCheckUtils.checkNotEmpty(this.date, "date");
        RequestCheckUtils.checkMaxValue(this.pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
    }
}


