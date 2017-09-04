package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class WlbItemConsignmentCreateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4281719615267896336L;
    @ApiField("consignment_id")
    private Long consignmentId;

    public void setConsignmentId(Long consignmentId) {
        this.consignmentId = consignmentId;
    }

    public Long getConsignmentId() {
        return this.consignmentId;
    }
}


