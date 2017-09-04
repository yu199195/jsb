package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shop;
import com.taobao.api.internal.mapping.ApiField;

public class ShopGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8323714794735233477L;
    @ApiField("shop")
    private Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return this.shop;
    }
}


