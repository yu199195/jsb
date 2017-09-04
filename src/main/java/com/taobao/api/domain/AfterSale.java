package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class AfterSale
        extends TaobaoObject {
    private static final long serialVersionUID = 1382216794893756888L;
    @ApiField("after_sale_id")
    private Long afterSaleId;
    @ApiField("after_sale_name")
    private String afterSaleName;
    @ApiField("after_sale_path")
    private String afterSalePath;

    public Long getAfterSaleId() {
        return this.afterSaleId;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public String getAfterSaleName() {
        return this.afterSaleName;
    }

    public void setAfterSaleName(String afterSaleName) {
        this.afterSaleName = afterSaleName;
    }

    public String getAfterSalePath() {
        return this.afterSalePath;
    }

    public void setAfterSalePath(String afterSalePath) {
        this.afterSalePath = afterSalePath;
    }
}


