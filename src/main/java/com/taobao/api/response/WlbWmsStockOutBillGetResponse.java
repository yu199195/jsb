package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoStockOutBillStockoutinfo;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsStockOutBillGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7689639794828216166L;
    @ApiField("stock_out_info")
    private CainiaoStockOutBillStockoutinfo stockOutInfo;

    public void setStockOutInfo(CainiaoStockOutBillStockoutinfo stockOutInfo) {
        this.stockOutInfo = stockOutInfo;
    }

    public CainiaoStockOutBillStockoutinfo getStockOutInfo() {
        return this.stockOutInfo;
    }
}


