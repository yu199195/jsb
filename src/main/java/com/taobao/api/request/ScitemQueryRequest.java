package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemQueryResponse;

import java.util.Map;

public class ScitemQueryRequest
        extends BaseTaobaoRequest<ScitemQueryResponse> {
    private String barCode;
    private String itemName;
    private Long itemType;
    private String outerCode;
    private Long pageIndex;
    private Long pageSize;
    private String wmsCode;

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setWmsCode(String wmsCode) {
        this.wmsCode = wmsCode;
    }

    public String getWmsCode() {
        return this.wmsCode;
    }

    public String getApiMethodName() {
        return "taobao.scitem.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bar_code", this.barCode);
        txtParams.put("item_name", this.itemName);
        txtParams.put("item_type", this.itemType);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("page_index", this.pageIndex);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("wms_code", this.wmsCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ScitemQueryResponse> getResponseClass() {
        return ScitemQueryResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


