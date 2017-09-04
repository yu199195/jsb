package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDistributorProductsGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoDistributorProductsGetRequest
        extends BaseTaobaoRequest<FenxiaoDistributorProductsGetResponse> {
    private String downloadStatus;
    private Date endTime;
    private String fields;
    private String itemIds;
    private String orderBy;
    private Long pageNo;
    private Long pageSize;
    private String pids;
    private Long productcatId;
    private Date startTime;
    private String supplierNick;
    private String timeType;
    private String tradeType;

    public void setDownloadStatus(String downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    public String getDownloadStatus() {
        return this.downloadStatus;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
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

    public void setPids(String pids) {
        this.pids = pids;
    }

    public String getPids() {
        return this.pids;
    }

    public void setProductcatId(Long productcatId) {
        this.productcatId = productcatId;
    }

    public Long getProductcatId() {
        return this.productcatId;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
    }

    public String getSupplierNick() {
        return this.supplierNick;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getTimeType() {
        return this.timeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.distributor.products.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("download_status", this.downloadStatus);
        txtParams.put("end_time", this.endTime);
        txtParams.put("fields", this.fields);
        txtParams.put("item_ids", this.itemIds);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("pids", this.pids);
        txtParams.put("productcat_id", this.productcatId);
        txtParams.put("start_time", this.startTime);
        txtParams.put("supplier_nick", this.supplierNick);
        txtParams.put("time_type", this.timeType);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDistributorProductsGetResponse> getResponseClass() {
        return FenxiaoDistributorProductsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.itemIds, 20, "itemIds");
        RequestCheckUtils.checkMaxListSize(this.pids, 20, "pids");
    }
}


