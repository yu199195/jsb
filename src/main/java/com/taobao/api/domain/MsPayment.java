package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class MsPayment
        extends TaobaoObject {
    private static final long serialVersionUID = 6484743527612287395L;
    @ApiField("price")
    private String price;
    @ApiField("reference_price")
    private String referencePrice;
    @ApiField("voucher_price")
    private String voucherPrice;

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReferencePrice() {
        return this.referencePrice;
    }

    public void setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice;
    }

    public String getVoucherPrice() {
        return this.voucherPrice;
    }

    public void setVoucherPrice(String voucherPrice) {
        this.voucherPrice = voucherPrice;
    }
}


