package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TradeConfirmFee
        extends TaobaoObject {
    private static final long serialVersionUID = 5534277418216485753L;
    @ApiField("confirm_fee")
    private String confirmFee;
    @ApiField("confirm_post_fee")
    private String confirmPostFee;
    @ApiField("is_last_order")
    private Boolean isLastOrder;

    public String getConfirmFee() {
        return this.confirmFee;
    }

    public void setConfirmFee(String confirmFee) {
        this.confirmFee = confirmFee;
    }

    public String getConfirmPostFee() {
        return this.confirmPostFee;
    }

    public void setConfirmPostFee(String confirmPostFee) {
        this.confirmPostFee = confirmPostFee;
    }

    public Boolean getIsLastOrder() {
        return this.isLastOrder;
    }

    public void setIsLastOrder(Boolean isLastOrder) {
        this.isLastOrder = isLastOrder;
    }
}


