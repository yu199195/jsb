package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SellercatsListGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5565328796823322568L;
    @ApiListField("seller_cats")
    @ApiField("seller_cat")
    private List<SellerCat> sellerCats;

    public void setSellerCats(List<SellerCat> sellerCats) {
        this.sellerCats = sellerCats;
    }

    public List<SellerCat> getSellerCats() {
        return this.sellerCats;
    }
}


