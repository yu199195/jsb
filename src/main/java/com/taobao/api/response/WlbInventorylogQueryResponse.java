package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbItemInventoryLog;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbInventorylogQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2457314423955144217L;
    @ApiListField("inventory_log_list")
    @ApiField("wlb_item_inventory_log")
    private List<WlbItemInventoryLog> inventoryLogList;
    @ApiField("total_count")
    private Long totalCount;

    public void setInventoryLogList(List<WlbItemInventoryLog> inventoryLogList) {
        this.inventoryLogList = inventoryLogList;
    }

    public List<WlbItemInventoryLog> getInventoryLogList() {
        return this.inventoryLogList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


