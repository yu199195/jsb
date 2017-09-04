package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ShoprecommendItemsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1649418646534762279L;
    @ApiListField("favorite_items")
    @ApiField("favorite_item")
    private List<FavoriteItem> favoriteItems;

    public void setFavoriteItems(List<FavoriteItem> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public List<FavoriteItem> getFavoriteItems() {
        return this.favoriteItems;
    }
}


