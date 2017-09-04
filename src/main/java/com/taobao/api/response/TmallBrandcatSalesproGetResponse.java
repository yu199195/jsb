package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CatBrandSaleProp;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmallBrandcatSalesproGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1141542671887158948L;
    @ApiListField("cat_brand_sale_props")
    @ApiField("cat_brand_sale_prop")
    private List<CatBrandSaleProp> catBrandSaleProps;

    public void setCatBrandSaleProps(List<CatBrandSaleProp> catBrandSaleProps) {
        this.catBrandSaleProps = catBrandSaleProps;
    }

    public List<CatBrandSaleProp> getCatBrandSaleProps() {
        return this.catBrandSaleProps;
    }
}


