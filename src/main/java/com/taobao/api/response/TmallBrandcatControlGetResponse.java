package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BrandCatControlInfo;
import com.taobao.api.internal.mapping.ApiField;

public class TmallBrandcatControlGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5527618494551815659L;
    @ApiField("brand_cat_control_info")
    private BrandCatControlInfo brandCatControlInfo;

    public void setBrandCatControlInfo(BrandCatControlInfo brandCatControlInfo) {
        this.brandCatControlInfo = brandCatControlInfo;
    }

    public BrandCatControlInfo getBrandCatControlInfo() {
        return this.brandCatControlInfo;
    }
}


