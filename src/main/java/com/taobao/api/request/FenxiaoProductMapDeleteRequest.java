package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductMapDeleteResponse;

import java.util.Map;

public class FenxiaoProductMapDeleteRequest
        extends BaseTaobaoRequest<FenxiaoProductMapDeleteResponse> {
    private Long productId;
    private String skuIds;

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.map.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("sku_ids", this.skuIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductMapDeleteResponse> getResponseClass() {
        return FenxiaoProductMapDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
    }
}


