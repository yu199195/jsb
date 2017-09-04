package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemBatchInventory
        extends TaobaoObject {
    private static final long serialVersionUID = 1258394966959655443L;
    @ApiListField("item_batch")
    @ApiField("wlb_item_batch")
    private List<WlbItemBatch> itemBatch;
    @ApiField("item_id")
    private Long itemId;
    @ApiListField("item_inventorys")
    @ApiField("wlb_item_inventory")
    private List<WlbItemInventory> itemInventorys;
    @ApiField("total_quantity")
    private Long totalQuantity;

    public List<WlbItemBatch> getItemBatch() {
        return this.itemBatch;
    }

    public void setItemBatch(List<WlbItemBatch> itemBatch) {
        this.itemBatch = itemBatch;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public List<WlbItemInventory> getItemInventorys() {
        return this.itemInventorys;
    }

    public void setItemInventorys(List<WlbItemInventory> itemInventorys) {
        this.itemInventorys = itemInventorys;
    }

    public Long getTotalQuantity() {
        return this.totalQuantity;
    }

    public void setTotalQuantity(Long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}


