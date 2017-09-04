package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ShopCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ShopcatsListGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2783888648673964128L;
    @ApiListField("shop_cats")
    @ApiField("shop_cat")
    private List<ShopCat> shopCats;

    public void setShopCats(List<ShopCat> shopCats) {
        this.shopCats = shopCats;
    }

    public List<ShopCat> getShopCats() {
        return this.shopCats;
    }
}


