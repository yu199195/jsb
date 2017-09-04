package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDistributorItemsGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoDistributorItemsGetRequest
        extends BaseTaobaoRequest<FenxiaoDistributorItemsGetResponse> {
    private Long distributorId;
    private Date endModified;
    private Long pageNo;
    private Long pageSize;
    private Long productId;
    private Date startModified;

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public Long getDistributorId() {
        return this.distributorId;
    }

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setStartModified(Date startModified) {
        this.startModified = startModified;
    }

    public Date getStartModified() {
        return this.startModified;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.distributor.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_id", this.distributorId);
        txtParams.put("end_modified", this.endModified);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("product_id", this.productId);
        txtParams.put("start_modified", this.startModified);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDistributorItemsGetResponse> getResponseClass() {
        return FenxiaoDistributorItemsGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


