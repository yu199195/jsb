package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductsGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoProductsGetRequest
        extends BaseTaobaoRequest<FenxiaoProductsGetResponse> {
    private Date endModified;
    private String fields;
    private String isAuthz;
    private String itemIds;
    private String outerId;
    private Long pageNo;
    private Long pageSize;
    private String pids;
    private Long productcatId;
    private String skuNumber;
    private Date startModified;
    private String status;

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setIsAuthz(String isAuthz) {
        this.isAuthz = isAuthz;
    }

    public String getIsAuthz() {
        return this.isAuthz;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    public String getItemIds() {
        return this.itemIds;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
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

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public void setStartModified(Date startModified) {
        this.startModified = startModified;
    }

    public Date getStartModified() {
        return this.startModified;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.products.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_modified", this.endModified);
        txtParams.put("fields", this.fields);
        txtParams.put("is_authz", this.isAuthz);
        txtParams.put("item_ids", this.itemIds);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("pids", this.pids);
        txtParams.put("productcat_id", this.productcatId);
        txtParams.put("sku_number", this.skuNumber);
        txtParams.put("start_modified", this.startModified);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductsGetResponse> getResponseClass() {
        return FenxiaoProductsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.itemIds, 20, "itemIds");
        RequestCheckUtils.checkMaxListSize(this.pids, 30, "pids");
    }
}


