package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductPropImg;
import com.taobao.api.internal.mapping.ApiField;

public class ProductPropimgUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7691551984468776894L;
    @ApiField("product_prop_img")
    private ProductPropImg productPropImg;

    public void setProductPropImg(ProductPropImg productPropImg) {
        this.productPropImg = productPropImg;
    }

    public ProductPropImg getProductPropImg() {
        return this.productPropImg;
    }
}


