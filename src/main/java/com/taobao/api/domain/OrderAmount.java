package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class OrderAmount
        extends TaobaoObject {
    private static final long serialVersionUID = 7614872611743852413L;
    @ApiField("adjust_fee")
    private String adjustFee;
    @ApiField("discount_fee")
    private String discountFee;
    @ApiField("divide_order_fee")
    private String divideOrderFee;
    @ApiField("num")
    private Long num;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("oid")
    private Long oid;
    @ApiField("part_mjz_discount")
    private String partMjzDiscount;
    @ApiField("payment")
    private String payment;
    @ApiField("price")
    private String price;
    @ApiField("promotion_name")
    private String promotionName;
    @ApiField("sku_id")
    private Long skuId;
    @ApiField("sku_properties_name")
    private String skuPropertiesName;
    @ApiField("title")
    private String title;

    public String getAdjustFee() {
        return this.adjustFee;
    }

    public void setAdjustFee(String adjustFee) {
        this.adjustFee = adjustFee;
    }

    public String getDiscountFee() {
        return this.discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public String getDivideOrderFee() {
        return this.divideOrderFee;
    }

    public void setDivideOrderFee(String divideOrderFee) {
        this.divideOrderFee = divideOrderFee;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getPartMjzDiscount() {
        return this.partMjzDiscount;
    }

    public void setPartMjzDiscount(String partMjzDiscount) {
        this.partMjzDiscount = partMjzDiscount;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromotionName() {
        return this.promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuPropertiesName() {
        return this.skuPropertiesName;
    }

    public void setSkuPropertiesName(String skuPropertiesName) {
        this.skuPropertiesName = skuPropertiesName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


