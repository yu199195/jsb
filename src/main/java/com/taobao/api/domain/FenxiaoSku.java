package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoSku
        extends TaobaoObject {
    private static final long serialVersionUID = 8112316166222852576L;
    @ApiField("cost_price")
    private String costPrice;
    @ApiField("dealer_cost_price")
    private String dealerCostPrice;
    @ApiField("id")
    private Long id;
    @ApiField("name")
    private String name;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("properties")
    private String properties;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("quota_quantity")
    private Long quotaQuantity;
    @ApiField("reserved_quantity")
    private Long reservedQuantity;
    @ApiField("scitem_id")
    private Long scitemId;
    @ApiField("standard_price")
    private String standardPrice;

    public String getCostPrice() {
        return this.costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuotaQuantity() {
        return this.quotaQuantity;
    }

    public void setQuotaQuantity(Long quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    public Long getReservedQuantity() {
        return this.reservedQuantity;
    }

    public void setReservedQuantity(Long reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Long getScitemId() {
        return this.scitemId;
    }

    public void setScitemId(Long scitemId) {
        this.scitemId = scitemId;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }
}


