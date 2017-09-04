package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WmsInventoryQueryItemlist;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsInventoryQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5762285679772431495L;
    @ApiListField("item_list")
    @ApiField("wms_inventory_query_itemlist")
    private List<WmsInventoryQueryItemlist> itemList;
    @ApiField("total_count")
    private Long totalCount;
    @ApiField("wl_error_code")
    private String wlErrorCode;
    @ApiField("wl_error_msg")
    private String wlErrorMsg;
    @ApiField("wl_success")
    private Boolean wlSuccess;

    public void setItemList(List<WmsInventoryQueryItemlist> itemList) {
        this.itemList = itemList;
    }

    public List<WmsInventoryQueryItemlist> getItemList() {
        return this.itemList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setWlErrorCode(String wlErrorCode) {
        this.wlErrorCode = wlErrorCode;
    }

    public String getWlErrorCode() {
        return this.wlErrorCode;
    }

    public void setWlErrorMsg(String wlErrorMsg) {
        this.wlErrorMsg = wlErrorMsg;
    }

    public String getWlErrorMsg() {
        return this.wlErrorMsg;
    }

    public void setWlSuccess(Boolean wlSuccess) {
        this.wlSuccess = wlSuccess;
    }

    public Boolean getWlSuccess() {
        return this.wlSuccess;
    }
}


