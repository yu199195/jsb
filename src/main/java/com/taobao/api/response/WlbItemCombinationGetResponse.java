package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemCombinationGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5363113898514779654L;
    @ApiListField("item_id_list")
    @ApiField("number")
    private List<Long> itemIdList;

    public void setItemIdList(List<Long> itemIdList) {
        this.itemIdList = itemIdList;
    }

    public List<Long> getItemIdList() {
        return this.itemIdList;
    }
}


