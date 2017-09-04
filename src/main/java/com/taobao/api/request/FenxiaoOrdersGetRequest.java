package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrdersGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoOrdersGetRequest
        extends BaseTaobaoRequest<FenxiaoOrdersGetResponse> {
    private Date endCreated;
    private String fields;
    private Long pageNo;
    private Long pageSize;
    private Long purchaseOrderId;
    private Date startCreated;
    private String status;
    private Long tcOrderId;
    private String timeType;

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
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

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTcOrderId(Long tcOrderId) {
        this.tcOrderId = tcOrderId;
    }

    public Long getTcOrderId() {
        return this.tcOrderId;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getTimeType() {
        return this.timeType;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.orders.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_created", this.endCreated);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("purchase_order_id", this.purchaseOrderId);
        txtParams.put("start_created", this.startCreated);
        txtParams.put("status", this.status);
        txtParams.put("tc_order_id", this.tcOrderId);
        txtParams.put("time_type", this.timeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoOrdersGetResponse> getResponseClass() {
        return FenxiaoOrdersGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(this.pageNo, 2147483647L, "pageNo");
        RequestCheckUtils.checkMinValue(this.pageNo, -21474836478L, "pageNo");
        RequestCheckUtils.checkMaxValue(this.pageSize, 2147483647L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, -21474836478L, "pageSize");
        RequestCheckUtils.checkMaxValue(this.purchaseOrderId, 9223372036854775807L, "purchaseOrderId");
        RequestCheckUtils.checkMinValue(this.purchaseOrderId, -9223372036854775808L, "purchaseOrderId");
    }
}


