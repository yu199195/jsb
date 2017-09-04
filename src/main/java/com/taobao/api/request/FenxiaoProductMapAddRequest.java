package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductMapAddResponse;

import java.util.Map;

public class FenxiaoProductMapAddRequest
        extends BaseTaobaoRequest<FenxiaoProductMapAddResponse> {
    private Boolean notCheckOuterCode;
    private Long productId;
    private Long scItemId;
    private String scItemIds;
    private String skuIds;

    public void setNotCheckOuterCode(Boolean notCheckOuterCode) {
        this.notCheckOuterCode = notCheckOuterCode;
    }

    public Boolean getNotCheckOuterCode() {
        return this.notCheckOuterCode;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setScItemIds(String scItemIds) {
        this.scItemIds = scItemIds;
    }

    public String getScItemIds() {
        return this.scItemIds;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.map.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("not_check_outer_code", this.notCheckOuterCode);
        txtParams.put("product_id", this.productId);
        txtParams.put("sc_item_id", this.scItemId);
        txtParams.put("sc_item_ids", this.scItemIds);
        txtParams.put("sku_ids", this.skuIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductMapAddResponse> getResponseClass() {
        return FenxiaoProductMapAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }
}


