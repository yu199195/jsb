package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductUpdateResponse;

import java.util.HashMap;
import java.util.Map;

public class FenxiaoProductUpdateRequest
        extends BaseTaobaoRequest<FenxiaoProductUpdateResponse>
        implements TaobaoUploadRequest<FenxiaoProductUpdateResponse> {
    private Long alarmNumber;
    private Long categoryId;
    private String city;
    private String costPrice;
    private String dealerCostPrice;
    private String desc;
    private Long discountId;
    private String haveGuarantee;
    private String haveInvoice;
    private FileItem image;
    private String inputProperties;
    private String isAuthz;
    private String name;
    private String outerId;
    private String picPath;
    private Long pid;
    private String postageEms;
    private String postageFast;
    private Long postageId;
    private String postageOrdinary;
    private String postageType;
    private String properties;
    private String propertyAlias;
    private String prov;
    private Long quantity;
    private String retailPriceHigh;
    private String retailPriceLow;
    private String skuCostPrices;
    private String skuDealerCostPrices;
    private String skuIds;
    private String skuOuterIds;
    private String skuProperties;
    private String skuPropertiesDel;
    private String skuQuantitys;
    private String skuStandardPrices;
    private String standardPrice;
    private String standardRetailPrice;
    private String status;

    public void setAlarmNumber(Long alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    public Long getAlarmNumber() {
        return this.alarmNumber;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getCostPrice() {
        return this.costPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getDiscountId() {
        return this.discountId;
    }

    public void setHaveGuarantee(String haveGuarantee) {
        this.haveGuarantee = haveGuarantee;
    }

    public String getHaveGuarantee() {
        return this.haveGuarantee;
    }

    public void setHaveInvoice(String haveInvoice) {
        this.haveInvoice = haveInvoice;
    }

    public String getHaveInvoice() {
        return this.haveInvoice;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setInputProperties(String inputProperties) {
        this.inputProperties = inputProperties;
    }

    public String getInputProperties() {
        return this.inputProperties;
    }

    public void setIsAuthz(String isAuthz) {
        this.isAuthz = isAuthz;
    }

    public String getIsAuthz() {
        return this.isAuthz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setPostageEms(String postageEms) {
        this.postageEms = postageEms;
    }

    public String getPostageEms() {
        return this.postageEms;
    }

    public void setPostageFast(String postageFast) {
        this.postageFast = postageFast;
    }

    public String getPostageFast() {
        return this.postageFast;
    }

    public void setPostageId(Long postageId) {
        this.postageId = postageId;
    }

    public Long getPostageId() {
        return this.postageId;
    }

    public void setPostageOrdinary(String postageOrdinary) {
        this.postageOrdinary = postageOrdinary;
    }

    public String getPostageOrdinary() {
        return this.postageOrdinary;
    }

    public void setPostageType(String postageType) {
        this.postageType = postageType;
    }

    public String getPostageType() {
        return this.postageType;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getProv() {
        return this.prov;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setRetailPriceHigh(String retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public String getRetailPriceHigh() {
        return this.retailPriceHigh;
    }

    public void setRetailPriceLow(String retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public String getRetailPriceLow() {
        return this.retailPriceLow;
    }

    public void setSkuCostPrices(String skuCostPrices) {
        this.skuCostPrices = skuCostPrices;
    }

    public String getSkuCostPrices() {
        return this.skuCostPrices;
    }

    public void setSkuDealerCostPrices(String skuDealerCostPrices) {
        this.skuDealerCostPrices = skuDealerCostPrices;
    }

    public String getSkuDealerCostPrices() {
        return this.skuDealerCostPrices;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    public void setSkuOuterIds(String skuOuterIds) {
        this.skuOuterIds = skuOuterIds;
    }

    public String getSkuOuterIds() {
        return this.skuOuterIds;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public void setSkuPropertiesDel(String skuPropertiesDel) {
        this.skuPropertiesDel = skuPropertiesDel;
    }

    public String getSkuPropertiesDel() {
        return this.skuPropertiesDel;
    }

    public void setSkuQuantitys(String skuQuantitys) {
        this.skuQuantitys = skuQuantitys;
    }

    public String getSkuQuantitys() {
        return this.skuQuantitys;
    }

    public void setSkuStandardPrices(String skuStandardPrices) {
        this.skuStandardPrices = skuStandardPrices;
    }

    public String getSkuStandardPrices() {
        return this.skuStandardPrices;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public void setStandardRetailPrice(String standardRetailPrice) {
        this.standardRetailPrice = standardRetailPrice;
    }

    public String getStandardRetailPrice() {
        return this.standardRetailPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alarm_number", this.alarmNumber);
        txtParams.put("category_id", this.categoryId);
        txtParams.put("city", this.city);
        txtParams.put("cost_price", this.costPrice);
        txtParams.put("dealer_cost_price", this.dealerCostPrice);
        txtParams.put("desc", this.desc);
        txtParams.put("discount_id", this.discountId);
        txtParams.put("have_guarantee", this.haveGuarantee);
        txtParams.put("have_invoice", this.haveInvoice);
        txtParams.put("input_properties", this.inputProperties);
        txtParams.put("is_authz", this.isAuthz);
        txtParams.put("name", this.name);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("pid", this.pid);
        txtParams.put("postage_ems", this.postageEms);
        txtParams.put("postage_fast", this.postageFast);
        txtParams.put("postage_id", this.postageId);
        txtParams.put("postage_ordinary", this.postageOrdinary);
        txtParams.put("postage_type", this.postageType);
        txtParams.put("properties", this.properties);
        txtParams.put("property_alias", this.propertyAlias);
        txtParams.put("prov", this.prov);
        txtParams.put("quantity", this.quantity);
        txtParams.put("retail_price_high", this.retailPriceHigh);
        txtParams.put("retail_price_low", this.retailPriceLow);
        txtParams.put("sku_cost_prices", this.skuCostPrices);
        txtParams.put("sku_dealer_cost_prices", this.skuDealerCostPrices);
        txtParams.put("sku_ids", this.skuIds);
        txtParams.put("sku_outer_ids", this.skuOuterIds);
        txtParams.put("sku_properties", this.skuProperties);
        txtParams.put("sku_properties_del", this.skuPropertiesDel);
        txtParams.put("sku_quantitys", this.skuQuantitys);
        txtParams.put("sku_standard_prices", this.skuStandardPrices);
        txtParams.put("standard_price", this.standardPrice);
        txtParams.put("standard_retail_price", this.standardRetailPrice);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoProductUpdateResponse> getResponseClass() {
        return FenxiaoProductUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.pid, "pid");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


