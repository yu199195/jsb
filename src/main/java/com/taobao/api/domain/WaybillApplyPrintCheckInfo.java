package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WaybillApplyPrintCheckInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 5433861775128563477L;
    @ApiField("notice_code")
    private String noticeCode;
    @ApiField("notice_message")
    private String noticeMessage;
    @ApiField("print_quantity")
    private Long printQuantity;
    @ApiField("waybill_code")
    private String waybillCode;

    public String getNoticeCode() {
        return this.noticeCode;
    }

    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    public String getNoticeMessage() {
        return this.noticeMessage;
    }

    public void setNoticeMessage(String noticeMessage) {
        this.noticeMessage = noticeMessage;
    }

    public Long getPrintQuantity() {
        return this.printQuantity;
    }

    public void setPrintQuantity(Long printQuantity) {
        this.printQuantity = printQuantity;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }
}


