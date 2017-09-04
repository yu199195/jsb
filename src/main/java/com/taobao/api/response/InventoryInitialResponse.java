package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryInitialResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3778254824336246892L;
    @ApiListField("tip_infos")
    @ApiField("tip_info")
    private List<TipInfo> tipInfos;

    public void setTipInfos(List<TipInfo> tipInfos) {
        this.tipInfos = tipInfos;
    }

    public List<TipInfo> getTipInfos() {
        return this.tipInfos;
    }
}


