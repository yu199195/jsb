package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsCainiaoBillQueryResponse;

import java.util.Date;
import java.util.Map;

public class WlbWmsCainiaoBillQueryRequest
        extends BaseTaobaoRequest<WlbWmsCainiaoBillQueryResponse> {
    private Date endModifiedTime;
    private String orderType;
    private Long pageNo;
    private Long pageSize;
    private Date startModifiedTime;

    public void setEndModifiedTime(Date endModifiedTime) {
        this.endModifiedTime = endModifiedTime;
    }

    public Date getEndModifiedTime() {
        return this.endModifiedTime;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
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

    public void setStartModifiedTime(Date startModifiedTime) {
        this.startModifiedTime = startModifiedTime;
    }

    public Date getStartModifiedTime() {
        return this.startModifiedTime;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.cainiao.bill.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_modified_time", this.endModifiedTime);
        txtParams.put("order_type", this.orderType);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_modified_time", this.startModifiedTime);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsCainiaoBillQueryResponse> getResponseClass() {
        return WlbWmsCainiaoBillQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.endModifiedTime, "endModifiedTime");
        RequestCheckUtils.checkMaxValue(this.pageSize, 50L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(this.startModifiedTime, "startModifiedTime");
    }
}


