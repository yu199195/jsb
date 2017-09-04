package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BrandCatMetaData;
import com.taobao.api.internal.mapping.ApiField;

public class TmallBrandcatMetadataGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2885533691664244166L;
    @ApiField("brand_cat_meta_data")
    private BrandCatMetaData brandCatMetaData;

    public void setBrandCatMetaData(BrandCatMetaData brandCatMetaData) {
        this.brandCatMetaData = brandCatMetaData;
    }

    public BrandCatMetaData getBrandCatMetaData() {
        return this.brandCatMetaData;
    }
}


