package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class BrandCatControl
        extends TaobaoObject {
    private static final long serialVersionUID = 5119411888868755612L;
    @ApiField("brand_id")
    private Long brandId;
    @ApiField("brand_name")
    private String brandName;
    @ApiField("cat_id")
    private Long catId;
    @ApiField("cat_name")
    private String catName;
    @ApiField("certified_data")
    private String certifiedData;

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

    public Long getCatId() {
        return this.catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCertifiedData() {
        return this.certifiedData;
    }

    public void setCertifiedData(String certifiedData) {
        this.certifiedData = certifiedData;
    }
}


