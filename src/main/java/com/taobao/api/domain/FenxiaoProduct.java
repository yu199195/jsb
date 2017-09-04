package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class FenxiaoProduct
        extends TaobaoObject {
    private static final long serialVersionUID = 5411186246458693839L;
    @ApiField("alarm_number")
    private Long alarmNumber;
    @ApiField("category_id")
    private String categoryId;
    @ApiField("city")
    private String city;
    @ApiField("cost_price")
    private String costPrice;
    @ApiField("created")
    private Date created;
    @ApiField("dealer_cost_price")
    private String dealerCostPrice;
    @ApiField("desc_path")
    private String descPath;
    @ApiField("description")
    private String description;
    @ApiField("discount_id")
    private Long discountId;
    @ApiField("have_guarantee")
    private Boolean haveGuarantee;
    @ApiField("have_invoice")
    private Boolean haveInvoice;
    @ApiListField("images")
    @ApiField("fenxiao_image")
    private List<FenxiaoImage> images;
    @ApiField("input_properties")
    private String inputProperties;
    @ApiField("is_authz")
    private String isAuthz;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("items_count")
    private Long itemsCount;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("orders_count")
    private Long ordersCount;
    @ApiField("outer_id")
    private String outerId;
    @ApiListField("pdus")
    @ApiField("fenxiao_pdu")
    private List<FenxiaoPdu> pdus;
    @ApiField("pictures")
    private String pictures;
    @ApiField("pid")
    private Long pid;
    @ApiField("postage_ems")
    private String postageEms;
    @ApiField("postage_fast")
    private String postageFast;
    @ApiField("postage_id")
    private Long postageId;
    @ApiField("postage_ordinary")
    private String postageOrdinary;
    @ApiField("postage_type")
    private String postageType;
    @ApiField("productcat_id")
    private Long productcatId;
    @ApiField("properties")
    private String properties;
    @ApiField("property_alias")
    private String propertyAlias;
    @ApiField("prov")
    private String prov;
    @ApiField("quantity")
    private Long quantity;
    @ApiField("query_item_id")
    private Long queryItemId;
    @ApiField("quota_quantity")
    private Long quotaQuantity;
    @ApiField("reserved_quantity")
    private Long reservedQuantity;
    @ApiField("retail_price_high")
    private String retailPriceHigh;
    @ApiField("retail_price_low")
    private String retailPriceLow;
    @ApiField("scitem_id")
    private Long scitemId;
    @ApiListField("skus")
    @ApiField("fenxiao_sku")
    private List<FenxiaoSku> skus;
    @ApiField("spu_id")
    private Long spuId;
    @ApiField("standard_price")
    private String standardPrice;
    @ApiField("standard_retail_price")
    private String standardRetailPrice;
    @ApiField("status")
    private String status;
    @ApiField("trade_type")
    private String tradeType;
    @ApiField("upshelf_time")
    private Date upshelfTime;

    public Long getAlarmNumber() {
        return this.alarmNumber;
    }

    public void setAlarmNumber(Long alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCostPrice() {
        return this.costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public String getDescPath() {
        return this.descPath;
    }

    public void setDescPath(String descPath) {
        this.descPath = descPath;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Boolean getHaveGuarantee() {
        return this.haveGuarantee;
    }

    public void setHaveGuarantee(Boolean haveGuarantee) {
        this.haveGuarantee = haveGuarantee;
    }

    public Boolean getHaveInvoice() {
        return this.haveInvoice;
    }

    public void setHaveInvoice(Boolean haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public List<FenxiaoImage> getImages() {
        return this.images;
    }

    public void setImages(List<FenxiaoImage> images) {
        this.images = images;
    }

    public String getInputProperties() {
        return this.inputProperties;
    }

    public void setInputProperties(String inputProperties) {
        this.inputProperties = inputProperties;
    }

    public String getIsAuthz() {
        return this.isAuthz;
    }

    public void setIsAuthz(String isAuthz) {
        this.isAuthz = isAuthz;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemsCount() {
        return this.itemsCount;
    }

    public void setItemsCount(Long itemsCount) {
        this.itemsCount = itemsCount;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrdersCount() {
        return this.ordersCount;
    }

    public void setOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public List<FenxiaoPdu> getPdus() {
        return this.pdus;
    }

    public void setPdus(List<FenxiaoPdu> pdus) {
        this.pdus = pdus;
    }

    public String getPictures() {
        return this.pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPostageEms() {
        return this.postageEms;
    }

    public void setPostageEms(String postageEms) {
        this.postageEms = postageEms;
    }

    public String getPostageFast() {
        return this.postageFast;
    }

    public void setPostageFast(String postageFast) {
        this.postageFast = postageFast;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public String getPostageOrdinary() {
        return this.postageOrdinary;
    }

    public void setPostageOrdinary(String postageOrdinary) {
        this.postageOrdinary = postageOrdinary;
    }

    public String getPostageType() {
        return this.postageType;
    }

    public void setPostageType(String postageType) {
        this.postageType = postageType;
    }

    public Long getProductcatId() {
        return this.productcatId;
    }

    public void setProductcatId(Long productcatId) {
        this.productcatId = productcatId;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getProv() {
        return this.prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQueryItemId() {
        return this.queryItemId;
    }

    public void setQueryItemId(Long queryItemId) {
        this.queryItemId = queryItemId;
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

    public String getRetailPriceHigh() {
        return this.retailPriceHigh;
    }

    public void setRetailPriceHigh(String retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public String getRetailPriceLow() {
        return this.retailPriceLow;
    }

    public void setRetailPriceLow(String retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public Long getScitemId() {
        return this.scitemId;
    }

    public void setScitemId(Long scitemId) {
        this.scitemId = scitemId;
    }

    public List<FenxiaoSku> getSkus() {
        return this.skus;
    }

    public void setSkus(List<FenxiaoSku> skus) {
        this.skus = skus;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getStandardRetailPrice() {
        return this.standardRetailPrice;
    }

    public void setStandardRetailPrice(String standardRetailPrice) {
        this.standardRetailPrice = standardRetailPrice;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Date getUpshelfTime() {
        return this.upshelfTime;
    }

    public void setUpshelfTime(Date upshelfTime) {
        this.upshelfTime = upshelfTime;
    }
}


