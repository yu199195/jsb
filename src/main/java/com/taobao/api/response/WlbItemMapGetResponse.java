package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.OutEntityItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbItemMapGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2158744216858255647L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiListField("out_entity_item_list")
    @ApiField("out_entity_item")
    private List<OutEntityItem> outEntityItemList;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setOutEntityItemList(List<OutEntityItem> outEntityItemList) {
        this.outEntityItemList = outEntityItemList;
    }

    public List<OutEntityItem> getOutEntityItemList() {
        return this.outEntityItemList;
    }
}


