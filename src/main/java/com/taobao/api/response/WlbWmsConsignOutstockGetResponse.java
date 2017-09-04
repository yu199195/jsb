package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoConsignOutstockOutstockinfolist;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWmsConsignOutstockGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1691446898596588416L;
    @ApiListField("out_stock_info_list")
    @ApiField("cainiao_consign_outstock_outstockinfolist")
    private List<CainiaoConsignOutstockOutstockinfolist> outStockInfoList;

    public void setOutStockInfoList(List<CainiaoConsignOutstockOutstockinfolist> outStockInfoList) {
        this.outStockInfoList = outStockInfoList;
    }

    public List<CainiaoConsignOutstockOutstockinfolist> getOutStockInfoList() {
        return this.outStockInfoList;
    }
}


