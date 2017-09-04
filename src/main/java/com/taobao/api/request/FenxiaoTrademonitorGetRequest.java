package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoTrademonitorGetResponse;

import java.util.Date;
import java.util.Map;

public class FenxiaoTrademonitorGetRequest
        extends BaseTaobaoRequest<FenxiaoTrademonitorGetResponse> {
    private String distributorNick;
    private Date endCreated;
    private String fields;
    private Long pageNo;
    private Long pageSize;
    private Long productId;
    private Date startCreated;

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.trademonitor.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("distributor_nick", this.distributorNick);
        txtParams.put("end_created", this.endCreated);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("product_id", this.productId);
        txtParams.put("start_created", this.startCreated);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoTrademonitorGetResponse> getResponseClass() {
        return FenxiaoTrademonitorGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


