package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.IpcInventoryDetailDo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryIpcInventorydetailGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8246937686963221758L;
    @ApiListField("inventory_details")
    @ApiField("ipc_inventory_detail_do")
    private List<IpcInventoryDetailDo> inventoryDetails;

    public void setInventoryDetails(List<IpcInventoryDetailDo> inventoryDetails) {
        this.inventoryDetails = inventoryDetails;
    }

    public List<IpcInventoryDetailDo> getInventoryDetails() {
        return this.inventoryDetails;
    }
}


