package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemsSellerListGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4716416343894878566L;
    @ApiListField("items")
    @ApiField("item")
    private List<Item> items;

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return this.items;
    }
}


