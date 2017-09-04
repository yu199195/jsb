package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductPropImg;
import com.taobao.api.internal.mapping.ApiField;

public class ProductPropimgDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5666635937228979782L;
    @ApiField("product_prop_img")
    private ProductPropImg productPropImg;

    public void setProductPropImg(ProductPropImg productPropImg) {
        this.productPropImg = productPropImg;
    }

    public ProductPropImg getProductPropImg() {
        return this.productPropImg;
    }
}


