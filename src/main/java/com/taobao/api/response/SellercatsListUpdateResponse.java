package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiField;

public class SellercatsListUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8817948984441952612L;
    @ApiField("seller_cat")
    private SellerCat sellerCat;

    public void setSellerCat(SellerCat sellerCat) {
        this.sellerCat = sellerCat;
    }

    public SellerCat getSellerCat() {
        return this.sellerCat;
    }
}


