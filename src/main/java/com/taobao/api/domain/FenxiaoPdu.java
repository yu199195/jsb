package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoPdu
        extends TaobaoObject {
    private static final long serialVersionUID = 1211872857624193135L;
    @ApiField("distributor_id")
    private Long distributorId;
    @ApiField("distributor_name")
    private String distributorName;
    @ApiField("product_id")
    private Long productId;
    @ApiField("quantity_agent")
    private Long quantityAgent;
    @ApiField("sku_properties")
    private String skuProperties;

    public Long getDistributorId() {
        return this.distributorId;
    }

    public void setDistributorId(Long distributorId) {
        this.distributorId = distributorId;
    }

    public String getDistributorName() {
        return this.distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getQuantityAgent() {
        return this.quantityAgent;
    }

    public void setQuantityAgent(Long quantityAgent) {
        this.quantityAgent = quantityAgent;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }
}


