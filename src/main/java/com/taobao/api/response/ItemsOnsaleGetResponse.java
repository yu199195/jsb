package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemsOnsaleGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7881935946366478739L;
    @ApiListField("items")
    @ApiField("item")
    private List<Item> items;
    @ApiField("total_results")
    private Long totalResults;

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


