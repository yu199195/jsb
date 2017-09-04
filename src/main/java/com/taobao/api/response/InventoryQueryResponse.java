package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.InventorySum;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2642213686533872869L;
    @ApiListField("item_inventorys")
    @ApiField("inventory_sum")
    private List<InventorySum> itemInventorys;
    @ApiListField("tip_infos")
    @ApiField("tip_info")
    private List<TipInfo> tipInfos;

    public void setItemInventorys(List<InventorySum> itemInventorys) {
        this.itemInventorys = itemInventorys;
    }

    public List<InventorySum> getItemInventorys() {
        return this.itemInventorys;
    }

    public void setTipInfos(List<TipInfo> tipInfos) {
        this.tipInfos = tipInfos;
    }

    public List<TipInfo> getTipInfos() {
        return this.tipInfos;
    }
}


