package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbItemBatchInventory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemBatchQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8611157592319626352L;
    @ApiListField("item_inventory_batch_list")
    @ApiField("wlb_item_batch_inventory")
    private List<WlbItemBatchInventory> itemInventoryBatchList;
    @ApiField("total_count")
    private Long totalCount;

    public void setItemInventoryBatchList(List<WlbItemBatchInventory> itemInventoryBatchList) {
        this.itemInventoryBatchList = itemInventoryBatchList;
    }

    public List<WlbItemBatchInventory> getItemInventoryBatchList() {
        return this.itemInventoryBatchList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


