package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoStockInBillStockininfo;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsStockInBillGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7579235777147498818L;
    @ApiField("stock_in_info")
    private CainiaoStockInBillStockininfo stockInInfo;

    public void setStockInInfo(CainiaoStockInBillStockininfo stockInInfo) {
        this.stockInInfo = stockInInfo;
    }

    public CainiaoStockInBillStockininfo getStockInInfo() {
        return this.stockInInfo;
    }
}


