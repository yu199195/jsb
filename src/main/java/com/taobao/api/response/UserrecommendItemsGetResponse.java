package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class UserrecommendItemsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2478826737993133347L;
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


