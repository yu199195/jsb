package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class UpdateItemPriceOption
        extends TaobaoObject {
    private static final long serialVersionUID = 8344518857338535294L;
    @ApiField("currency_type")
    private String currencyType;
    @ApiField("ignore_fake_credit")
    private Boolean ignoreFakeCredit;

    public String getCurrencyType() {
        return this.currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Boolean getIgnoreFakeCredit() {
        return this.ignoreFakeCredit;
    }

    public void setIgnoreFakeCredit(Boolean ignoreFakeCredit) {
        this.ignoreFakeCredit = ignoreFakeCredit;
    }
}


