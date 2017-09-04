package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CatBrandSaleProp
        extends TaobaoObject {
    private static final long serialVersionUID = 8449616884725878254L;
    @ApiField("brand_id")
    private Long brandId;
    @ApiField("cat_id")
    private Long catId;
    @ApiField("def_market_prop_value")
    private Long defMarketPropValue;
    @ApiField("is_not_spec")
    private Boolean isNotSpec;
    @ApiField("property_id")
    private Long propertyId;

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getDefMarketPropValue() {
        return this.defMarketPropValue;
    }

    public void setDefMarketPropValue(Long defMarketPropValue) {
        this.defMarketPropValue = defMarketPropValue;
    }

    public Boolean getIsNotSpec() {
        return this.isNotSpec;
    }

    public void setIsNotSpec(Boolean isNotSpec) {
        this.isNotSpec = isNotSpec;
    }

    public Long getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }
}


