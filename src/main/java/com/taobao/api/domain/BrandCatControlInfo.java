package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class BrandCatControlInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 5341366939836591659L;
    @ApiListField("brand_cat_controls")
    @ApiField("brand_cat_control")
    private List<BrandCatControl> brandCatControls;

    public List<BrandCatControl> getBrandCatControls() {
        return this.brandCatControls;
    }

    public void setBrandCatControls(List<BrandCatControl> brandCatControls) {
        this.brandCatControls = brandCatControls;
    }
}


