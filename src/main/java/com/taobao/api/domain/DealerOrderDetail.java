package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class DealerOrderDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 5822294955469345564L;
    @ApiField("dealer_detail_id")
    private Long dealerDetailId;
    @ApiField("dealer_order_id")
    private Long dealerOrderId;
    @ApiField("final_price")
    private String finalPrice;
    @ApiField("is_deleted")
    private Boolean isDeleted;
    @ApiField("original_price")
    private String originalPrice;
    @ApiField("price_count")
    private String priceCount;
    @ApiField("product_id")
    private Long productId;
    @ApiField("product_title")
    private String productTitle;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("sku_id")
    private Long skuId;
    @ApiField("sku_number")
    private String skuNumber;
    @ApiField("sku_spec")
    private String skuSpec;
    @ApiField("snapshot_url")
    private String snapshotUrl;

    public Long getDealerDetailId() {
        return this.dealerDetailId;
    }

    public void setDealerDetailId(Long dealerDetailId) {
        this.dealerDetailId = dealerDetailId;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public String getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getPriceCount() {
        return this.priceCount;
    }

    public void setPriceCount(String priceCount) {
        this.priceCount = priceCount;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getSkuSpec() {
        return this.skuSpec;
    }

    public void setSkuSpec(String skuSpec) {
        this.skuSpec = skuSpec;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }
}


