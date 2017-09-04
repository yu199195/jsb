package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3549225651548897462L;
    @ApiListField("item_list")
    @ApiField("wlb_item")
    private List<WlbItem> itemList;
    @ApiField("total_count")
    private Long totalCount;

    public void setItemList(List<WlbItem> itemList) {
        this.itemList = itemList;
    }

    public List<WlbItem> getItemList() {
        return this.itemList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }
}


