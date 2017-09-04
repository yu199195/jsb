package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemrecommendItemsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4488766191168481411L;
    @ApiListField("values")
    @ApiField("favorite_item")
    private List<FavoriteItem> values;

    public void setValues(List<FavoriteItem> values) {
        this.values = values;
    }

    public List<FavoriteItem> getValues() {
        return this.values;
    }
}


