package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CainiaoConsignOutstockOutstockinfolist
        extends TaobaoObject {
    private static final long serialVersionUID = 1826527281392831827L;
    @ApiField("out_stock_info")
    private CainiaoConsignOutstockOutstockinfo outStockInfo;

    public CainiaoConsignOutstockOutstockinfo getOutStockInfo() {
        return this.outStockInfo;
    }

    public void setOutStockInfo(CainiaoConsignOutstockOutstockinfo outStockInfo) {
        this.outStockInfo = outStockInfo;
    }
}


