package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TipInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 4537527493211677435L;
    @ApiField("error_code")
    private String errorCode;
    @ApiField("errro_message")
    private String errroMessage;
    @ApiField("info")
    private String info;
    @ApiField("sc_item_id")
    private String scItemId;
    @ApiField("sub_order_id")
    private String subOrderId;

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrroMessage() {
        return this.errroMessage;
    }

    public void setErrroMessage(String errroMessage) {
        this.errroMessage = errroMessage;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getScItemId() {
        return this.scItemId;
    }

    public void setScItemId(String scItemId) {
        this.scItemId = scItemId;
    }

    public String getSubOrderId() {
        return this.subOrderId;
    }

    public void setSubOrderId(String subOrderId) {
        this.subOrderId = subOrderId;
    }
}


