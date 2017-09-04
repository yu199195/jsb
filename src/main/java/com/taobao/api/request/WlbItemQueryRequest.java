package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemQueryResponse;

import java.util.Map;

public class WlbItemQueryRequest
        extends BaseTaobaoRequest<WlbItemQueryResponse> {
    private String isSku;
    private String itemCode;
    private String itemType;
    private String name;
    private Long pageNo;
    private Long pageSize;
    private Long parentId;
    private String status;
    private String title;

    public void setIsSku(String isSku) {
        this.isSku = isSku;
    }

    public String getIsSku() {
        return this.isSku;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_sku", this.isSku);
        txtParams.put("item_code", this.itemCode);
        txtParams.put("item_type", this.itemType);
        txtParams.put("name", this.name);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("parent_id", this.parentId);
        txtParams.put("status", this.status);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemQueryResponse> getResponseClass() {
        return WlbItemQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.itemCode, 64, "itemCode");
        RequestCheckUtils.checkMinValue(this.pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(this.pageSize, 50L, "pageSize");
        RequestCheckUtils.checkMinValue(this.pageSize, 1L, "pageSize");
        RequestCheckUtils.checkMaxLength(this.title, 255, "title");
    }
}


