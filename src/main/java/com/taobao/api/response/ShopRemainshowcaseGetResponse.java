package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shop;
import com.taobao.api.internal.mapping.ApiField;

public class ShopRemainshowcaseGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6799843627394243122L;
    @ApiField("shop")
    private Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return this.shop;
    }
}


