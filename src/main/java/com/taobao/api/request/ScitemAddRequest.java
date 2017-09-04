package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemAddResponse;

import java.util.Map;

public class ScitemAddRequest
        extends BaseTaobaoRequest<ScitemAddResponse> {
    private String barCode;
    private Long brandId;
    private String brandName;
    private Long height;
    private Long isAreaSale;
    private Long isCostly;
    private Long isDangerous;
    private Long isFriable;
    private Long isWarranty;
    private String itemName;
    private Long itemType;
    private Long length;
    private Long matterStatus;
    private String outerCode;
    private Long price;
    private String properties;
    private String remark;
    private Long spuId;
    private Long volume;
    private Long weight;
    private Long width;
    private String wmsCode;

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getHeight() {
        return this.height;
    }

    public void setIsAreaSale(Long isAreaSale) {
        this.isAreaSale = isAreaSale;
    }

    public Long getIsAreaSale() {
        return this.isAreaSale;
    }

    public void setIsCostly(Long isCostly) {
        this.isCostly = isCostly;
    }

    public Long getIsCostly() {
        return this.isCostly;
    }

    public void setIsDangerous(Long isDangerous) {
        this.isDangerous = isDangerous;
    }

    public Long getIsDangerous() {
        return this.isDangerous;
    }

    public void setIsFriable(Long isFriable) {
        this.isFriable = isFriable;
    }

    public Long getIsFriable() {
        return this.isFriable;
    }

    public void setIsWarranty(Long isWarranty) {
        this.isWarranty = isWarranty;
    }

    public Long getIsWarranty() {
        return this.isWarranty;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getLength() {
        return this.length;
    }

    public void setMatterStatus(Long matterStatus) {
        this.matterStatus = matterStatus;
    }

    public Long getMatterStatus() {
        return this.matterStatus;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getWidth() {
        return this.width;
    }

    public void setWmsCode(String wmsCode) {
        this.wmsCode = wmsCode;
    }

    public String getWmsCode() {
        return this.wmsCode;
    }

    public String getApiMethodName() {
        return "taobao.scitem.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bar_code", this.barCode);
        txtParams.put("brand_id", this.brandId);
        txtParams.put("brand_name", this.brandName);
        txtParams.put("height", this.height);
        txtParams.put("is_area_sale", this.isAreaSale);
        txtParams.put("is_costly", this.isCostly);
        txtParams.put("is_dangerous", this.isDangerous);
        txtParams.put("is_friable", this.isFriable);
        txtParams.put("is_warranty", this.isWarranty);
        txtParams.put("item_name", this.itemName);
        txtParams.put("item_type", this.itemType);
        txtParams.put("length", this.length);
        txtParams.put("matter_status", this.matterStatus);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("price", this.price);
        txtParams.put("properties", this.properties);
        txtParams.put("remark", this.remark);
        txtParams.put("spu_id", this.spuId);
        txtParams.put("volume", this.volume);
        txtParams.put("weight", this.weight);
        txtParams.put("width", this.width);
        txtParams.put("wms_code", this.wmsCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ScitemAddResponse> getResponseClass() {
        return ScitemAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemName, "itemName");
        RequestCheckUtils.checkNotEmpty(this.outerCode, "outerCode");
    }
}


