package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbItemMapGetByExtentityResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3347665359871853751L;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("item_id")
    private Long itemId;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }
}


