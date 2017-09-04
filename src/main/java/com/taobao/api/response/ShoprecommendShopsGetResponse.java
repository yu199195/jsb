package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteShop;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ShoprecommendShopsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3359287222594954732L;
    @ApiListField("favorite_shops")
    @ApiField("favorite_shop")
    private List<FavoriteShop> favoriteShops;

    public void setFavoriteShops(List<FavoriteShop> favoriteShops) {
        this.favoriteShops = favoriteShops;
    }

    public List<FavoriteShop> getFavoriteShops() {
        return this.favoriteShops;
    }
}


