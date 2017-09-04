package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ProductImg;
import com.taobao.api.internal.mapping.ApiField;

public class ProductImgDeleteResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1722913939488851142L;
    @ApiField("product_img")
    private ProductImg productImg;

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

    public ProductImg getProductImg() {
        return this.productImg;
    }
}


