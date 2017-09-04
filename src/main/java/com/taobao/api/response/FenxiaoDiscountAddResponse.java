package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoDiscountAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4678289875965311534L;
    @ApiField("discount_id")
    private Long discountId;

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Long getDiscountId() {
        return this.discountId;
    }
}


