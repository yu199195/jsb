package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiField;

public class SellercatsListAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4435675249356353898L;
    @ApiField("seller_cat")
    private SellerCat sellerCat;

    public void setSellerCat(SellerCat sellerCat) {
        this.sellerCat = sellerCat;
    }

    public SellerCat getSellerCat() {
        return this.sellerCat;
    }
}


