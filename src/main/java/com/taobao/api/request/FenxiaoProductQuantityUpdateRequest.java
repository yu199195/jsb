package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductQuantityUpdateResponse;

import java.util.Map;

public class FenxiaoProductQuantityUpdateRequest
        extends BaseTaobaoRequest<FenxiaoProductQuantityUpdateResponse> {
    private Long productId;
    private String properties;
    private String quantity;
    private Long type;

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.quantity.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
        txtParams.put("quantity", this.quantity);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductQuantityUpdateResponse> getResponseClass() {
        return FenxiaoProductQuantityUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
        RequestCheckUtils.checkNotEmpty(this.quantity, "quantity");
    }
}


