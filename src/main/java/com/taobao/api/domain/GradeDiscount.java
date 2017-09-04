package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class GradeDiscount
        extends TaobaoObject {
    private static final long serialVersionUID = 5393369557818494869L;
    @ApiField("discount_id")
    private Long discountId;
    @ApiField("discount_type")
    private Long discountType;
    @ApiField("price")
    private String price;
    @ApiField("sku_id")
    private Long skuId;
    @ApiField("trade_type")
    private Long tradeType;

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(Long discountType) {
        this.discountType = discountType;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(Long tradeType) {
        this.tradeType = tradeType;
    }
}


