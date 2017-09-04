package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ScItem
        extends TaobaoObject {
    private static final long serialVersionUID = 1358464426335716249L;
    @ApiField("bar_code")
    private String barCode;
    @ApiField("brand_id")
    private Long brandId;
    @ApiField("brand_name")
    private String brandName;
    @ApiField("height")
    private Long height;
    @ApiField("is_area_sale")
    private Long isAreaSale;
    @ApiField("is_costly")
    private Boolean isCostly;
    @ApiField("is_dangerous")
    private Boolean isDangerous;
    @ApiField("is_friable")
    private Boolean isFriable;
    @ApiField("is_warranty")
    private Boolean isWarranty;
    @ApiField("item_id")
    private Long itemId;
    @ApiField("item_name")
    private String itemName;
    @ApiField("item_type")
    private Long itemType;
    @ApiField("length")
    private Long length;
    @ApiField("matter_status")
    private String matterStatus;
    @ApiField("options")
    private Long options;
    @ApiField("outer_code")
    private String outerCode;
    @ApiField("price")
    private Long price;
    @ApiField("properties")
    private String properties;
    @ApiField("remark")
    private String remark;
    @ApiField("volume")
    private Long volume;
    @ApiField("weight")
    private Long weight;
    @ApiField("width")
    private Long width;
    @ApiField("wms_code")
    private String wmsCode;

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getHeight() {
        return this.height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getIsAreaSale() {
        return this.isAreaSale;
    }

    public void setIsAreaSale(Long isAreaSale) {
        this.isAreaSale = isAreaSale;
    }

    public Boolean getIsCostly() {
        return this.isCostly;
    }

    public void setIsCostly(Boolean isCostly) {
        this.isCostly = isCostly;
    }

    public Boolean getIsDangerous() {
        return this.isDangerous;
    }

    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public Boolean getIsFriable() {
        return this.isFriable;
    }

    public void setIsFriable(Boolean isFriable) {
        this.isFriable = isFriable;
    }

    public Boolean getIsWarranty() {
        return this.isWarranty;
    }

    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getItemType() {
        return this.itemType;
    }

    public void setItemType(Long itemType) {
        this.itemType = itemType;
    }

    public Long getLength() {
        return this.length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getMatterStatus() {
        return this.matterStatus;
    }

    public void setMatterStatus(String matterStatus) {
        this.matterStatus = matterStatus;
    }

    public Long getOptions() {
        return this.options;
    }

    public void setOptions(Long options) {
        this.options = options;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public Long getPrice() {
        return this.price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public Long getWidth() {
        return this.width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public String getWmsCode() {
        return this.wmsCode;
    }

    public void setWmsCode(String wmsCode) {
        this.wmsCode = wmsCode;
    }
}


