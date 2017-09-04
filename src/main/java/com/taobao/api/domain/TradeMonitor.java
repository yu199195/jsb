package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class TradeMonitor
        extends TaobaoObject {
    private static final long serialVersionUID = 3784689276983432823L;
    @ApiField("area")
    private String area;
    @ApiField("buy_amount")
    private Long buyAmount;
    @ApiField("buyer_full_name")
    private String buyerFullName;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("city")
    private String city;
    @ApiField("distributor_nick")
    private String distributorNick;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("item_number")
    private String itemNumber;
    @ApiField("item_price")
    private Long itemPrice;
    @ApiField("item_sku_name")
    private String itemSkuName;
    @ApiField("item_sku_number")
    private String itemSkuNumber;
    @ApiField("item_title")
    private String itemTitle;
    @ApiField("item_total_price")
    private Long itemTotalPrice;
    @ApiField("pay_time")
    private Date payTime;
    @ApiField("product_id")
    private Long productId;
    @ApiField("product_number")
    private String productNumber;
    @ApiField("product_sku_number")
    private String productSkuNumber;
    @ApiField("product_title")
    private String productTitle;
    @ApiField("provence")
    private String provence;
    @ApiField("retail_price_high")
    private Long retailPriceHigh;
    @ApiField("retail_price_low")
    private Long retailPriceLow;
    @ApiField("shipping_address")
    private String shippingAddress;
    @ApiField("status")
    private String status;
    @ApiField("sub_tc_order_id")
    private Long subTcOrderId;
    @ApiField("supplier_nick")
    private String supplierNick;
    @ApiField("tc_adjust_fee")
    private Long tcAdjustFee;
    @ApiField("tc_discount_fee")
    private Long tcDiscountFee;
    @ApiField("tc_order_id")
    private Long tcOrderId;
    @ApiField("tc_preferential_type")
    private String tcPreferentialType;
    @ApiField("trade_monitor_id")
    private Long tradeMonitorId;

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getBuyAmount() {
        return this.buyAmount;
    }

    public void setBuyAmount(Long buyAmount) {
        this.buyAmount = buyAmount;
    }

    public String getBuyerFullName() {
        return this.buyerFullName;
    }

    public void setBuyerFullName(String buyerFullName) {
        this.buyerFullName = buyerFullName;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Long getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemSkuName() {
        return this.itemSkuName;
    }

    public void setItemSkuName(String itemSkuName) {
        this.itemSkuName = itemSkuName;
    }

    public String getItemSkuNumber() {
        return this.itemSkuNumber;
    }

    public void setItemSkuNumber(String itemSkuNumber) {
        this.itemSkuNumber = itemSkuNumber;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Long getItemTotalPrice() {
        return this.itemTotalPrice;
    }

    public void setItemTotalPrice(Long itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductSkuNumber() {
        return this.productSkuNumber;
    }

    public void setProductSkuNumber(String productSkuNumber) {
        this.productSkuNumber = productSkuNumber;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProvence() {
        return this.provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }

    public Long getRetailPriceHigh() {
        return this.retailPriceHigh;
    }

    public void setRetailPriceHigh(Long retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public Long getRetailPriceLow() {
        return this.retailPriceLow;
    }

    public void setRetailPriceLow(Long retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public String getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    public String getSupplierNick() {
        return this.supplierNick;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
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

    public Long getTradeMonitorId() {
        return this.tradeMonitorId;
    }

    public void setTradeMonitorId(Long tradeMonitorId) {
        this.tradeMonitorId = tradeMonitorId;
    }
}


