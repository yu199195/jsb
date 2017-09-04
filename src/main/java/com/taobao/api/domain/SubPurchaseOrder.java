package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class SubPurchaseOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 7348949581656943999L;
    @ApiField("auction_id")
    private Long auctionId;
    @ApiField("auction_price")
    private String auctionPrice;
    @ApiField("auction_sku_id")
    private Long auctionSkuId;
    @ApiField("bill_fee")
    private String billFee;
    @ApiField("buyer_payment")
    private String buyerPayment;
    @ApiField("created")
    private Date created;
    @ApiField("discount_fee")
    private String discountFee;
    @ApiField("distributor_payment")
    private String distributorPayment;
    @ApiListField("features")
    @ApiField("feature")
    private List<Feature> features;
    @ApiField("fenxiao_id")
    private Long fenxiaoId;
    @ApiField("id")
    private Long id;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("item_outer_id")
    private String itemOuterId;
    @ApiField("num")
    private Long num;
    @ApiField("old_sku_properties")
    private String oldSkuProperties;
    @ApiField("order_200_status")
    private String order200Status;
    @ApiField("price")
    private String price;
    @ApiField("promotion_type")
    private String promotionType;
    @ApiField("refund_fee")
    private String refundFee;
    @ApiField("sc_item_id")
    private Long scItemId;
    @ApiField("sku_id")
    private Long skuId;
    @ApiField("sku_outer_id")
    private String skuOuterId;
    @ApiField("sku_properties")
    private String skuProperties;
    @ApiField("snapshot_url")
    private String snapshotUrl;
    @ApiField("status")
    private String status;
    @ApiField("sub_tc_order_id")
    private Long subTcOrderId;
    @ApiField("tc_adjust_fee")
    private Long tcAdjustFee;
    @ApiField("tc_discount_fee")
    private Long tcDiscountFee;
    @ApiField("tc_order_id")
    private Long tcOrderId;
    @ApiField("tc_preferential_type")
    private String tcPreferentialType;
    @ApiField("title")
    private String title;
    @ApiField("total_fee")
    private String totalFee;

    public Long getAuctionId() {
        return this.auctionId;
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public String getAuctionPrice() {
        return this.auctionPrice;
    }

    public void setAuctionPrice(String auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public Long getAuctionSkuId() {
        return this.auctionSkuId;
    }

    public void setAuctionSkuId(Long auctionSkuId) {
        this.auctionSkuId = auctionSkuId;
    }

    public String getBillFee() {
        return this.billFee;
    }

    public void setBillFee(String billFee) {
        this.billFee = billFee;
    }

    public String getBuyerPayment() {
        return this.buyerPayment;
    }

    public void setBuyerPayment(String buyerPayment) {
        this.buyerPayment = buyerPayment;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDiscountFee() {
        return this.discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public String getDistributorPayment() {
        return this.distributorPayment;
    }

    public void setDistributorPayment(String distributorPayment) {
        this.distributorPayment = distributorPayment;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Long getFenxiaoId() {
        return this.fenxiaoId;
    }

    public void setFenxiaoId(Long fenxiaoId) {
        this.fenxiaoId = fenxiaoId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemOuterId() {
        return this.itemOuterId;
    }

    public void setItemOuterId(String itemOuterId) {
        this.itemOuterId = itemOuterId;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getOldSkuProperties() {
        return this.oldSkuProperties;
    }

    public void setOldSkuProperties(String oldSkuProperties) {
        this.oldSkuProperties = oldSkuProperties;
    }

    public String getOrder200Status() {
        return this.order200Status;
    }

    public void setOrder200Status(String order200Status) {
        this.order200Status = order200Status;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public String getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuOuterId() {
        return this.skuOuterId;
    }

    public void setSkuOuterId(String skuOuterId) {
        this.skuOuterId = skuOuterId;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSubTcOrderId() {
        return this.subTcOrderId;
    }

    public void setSubTcOrderId(Long subTcOrderId) {
        this.subTcOrderId = subTcOrderId;
    }

    public Long getTcAdjustFee() {
        return this.tcAdjustFee;
    }

    public void setTcAdjustFee(Long tcAdjustFee) {
        this.tcAdjustFee = tcAdjustFee;
    }

    public Long getTcDiscountFee() {
        return this.tcDiscountFee;
    }

    public void setTcDiscountFee(Long tcDiscountFee) {
        this.tcDiscountFee = tcDiscountFee;
    }

    public Long getTcOrderId() {
        return this.tcOrderId;
    }

    public void setTcOrderId(Long tcOrderId) {
        this.tcOrderId = tcOrderId;
    }

    public String getTcPreferentialType() {
        return this.tcPreferentialType;
    }

    public void setTcPreferentialType(String tcPreferentialType) {
        this.tcPreferentialType = tcPreferentialType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }
}


