package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbInventory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbInventoryDetailGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3582826645451774441L;
    @ApiListField("inventory_list")
    @ApiField("wlb_inventory")
    private List<WlbInventory> inventoryList;
    @ApiField("item_id")
    private Long itemId;

    public void setInventoryList(List<WlbInventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public List<WlbInventory> getInventoryList() {
        return this.inventoryList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
}


