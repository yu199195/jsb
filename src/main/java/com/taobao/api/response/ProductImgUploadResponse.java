package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductImg;
import com.taobao.api.internal.mapping.ApiField;

public class ProductImgUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8229362986917749278L;
    @ApiField("product_img")
    private ProductImg productImg;

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

    public ProductImg getProductImg() {
        return this.productImg;
    }
}


