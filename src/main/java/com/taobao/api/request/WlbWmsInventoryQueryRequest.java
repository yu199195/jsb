package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsInventoryQueryResponse;

import java.util.Date;
import java.util.Map;

public class WlbWmsInventoryQueryRequest
        extends BaseTaobaoRequest<WlbWmsInventoryQueryResponse> {
    private String batchCode;
    private String channelCode;
    private Date dueDate;
    private Long inventoryType;
    private String itemId;
    private Long pageNo;
    private Long pageSize;
    private Date produceDate;
    private String storeCode;
    private Long type;

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getBatchCode() {
        return this.batchCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelCode() {
        return this.channelCode;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setInventoryType(Long inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Long getInventoryType() {
        return this.inventoryType;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
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

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    public Date getProduceDate() {
        return this.produceDate;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.inventory.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("batch_code", this.batchCode);
        txtParams.put("channel_code", this.channelCode);
        txtParams.put("due_date", this.dueDate);
        txtParams.put("inventory_type", this.inventoryType);
        txtParams.put("item_id", this.itemId);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("produce_date", this.produceDate);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsInventoryQueryResponse> getResponseClass() {
        return WlbWmsInventoryQueryResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


