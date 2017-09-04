package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class BrandCatMetaData
        extends TaobaoObject {
    private static final long serialVersionUID = 7866885699769719712L;
    @ApiField("brand_id")
    private Long brandId;
    @ApiField("cat_id")
    private Long catId;
    @ApiField("certified_data")
    private String certifiedData;
    @ApiField("is_darwin")
    private Boolean isDarwin;

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

    public String getCertifiedData() {
        return this.certifiedData;
    }

    public void setCertifiedData(String certifiedData) {
        this.certifiedData = certifiedData;
    }

    public Boolean getIsDarwin() {
        return this.isDarwin;
    }

    public void setIsDarwin(Boolean isDarwin) {
        this.isDarwin = isDarwin;
    }
}


