package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductSkuUpdateResponse;

import java.util.Map;

public class FenxiaoProductSkuUpdateRequest
        extends BaseTaobaoRequest<FenxiaoProductSkuUpdateResponse> {
    private String agentCostPrice;
    private String dealerCostPrice;
    private Long productId;
    private String properties;
    private Long quantity;
    private String skuNumber;
    private String standardPrice;

    public void setAgentCostPrice(String agentCostPrice) {
        this.agentCostPrice = agentCostPrice;
    }

    public String getAgentCostPrice() {
        return this.agentCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
    }

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

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.sku.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("agent_cost_price", this.agentCostPrice);
        txtParams.put("dealer_cost_price", this.dealerCostPrice);
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
        txtParams.put("quantity", this.quantity);
        txtParams.put("sku_number", this.skuNumber);
        txtParams.put("standard_price", this.standardPrice);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductSkuUpdateResponse> getResponseClass() {
        return FenxiaoProductSkuUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.productId, "productId");
        RequestCheckUtils.checkNotEmpty(this.properties, "properties");
    }
}


