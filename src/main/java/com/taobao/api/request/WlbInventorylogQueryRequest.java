package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventorylogQueryResponse;

import java.util.Date;
import java.util.Map;

public class WlbInventorylogQueryRequest
        extends BaseTaobaoRequest<WlbInventorylogQueryResponse> {
    private Date gmtEnd;
    private Date gmtStart;
    private Long itemId;
    private String opType;
    private Long opUserId;
    private String orderCode;
    private Long pageNo;
    private Long pageSize;
    private String storeCode;

    public void setGmtEnd(Date gmtEnd) {
        this.gmtEnd = gmtEnd;
    }

    public Date getGmtEnd() {
        return this.gmtEnd;
    }

    public void setGmtStart(Date gmtStart) {
        this.gmtStart = gmtStart;
    }

    public Date getGmtStart() {
        return this.gmtStart;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getOpType() {
        return this.opType;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

    public Long getOpUserId() {
        return this.opUserId;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
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

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.inventorylog.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("gmt_end", this.gmtEnd);
        txtParams.put("gmt_start", this.gmtStart);
        txtParams.put("item_id", this.itemId);
        txtParams.put("op_type", this.opType);
        txtParams.put("op_user_id", this.opUserId);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("store_code", this.storeCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbInventorylogQueryResponse> getResponseClass() {
        return WlbInventorylogQueryResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


