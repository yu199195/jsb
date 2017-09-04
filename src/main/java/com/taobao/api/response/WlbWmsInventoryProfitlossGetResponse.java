package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoInventoryProfitlossProfitlossinfo;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsInventoryProfitlossGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3151331144182513935L;
    @ApiField("profit_loss_info")
    private CainiaoInventoryProfitlossProfitlossinfo profitLossInfo;

    public void setProfitLossInfo(CainiaoInventoryProfitlossProfitlossinfo profitLossInfo) {
        this.profitLossInfo = profitLossInfo;
    }

    public CainiaoInventoryProfitlossProfitlossinfo getProfitLossInfo() {
        return this.profitLossInfo;
    }
}


