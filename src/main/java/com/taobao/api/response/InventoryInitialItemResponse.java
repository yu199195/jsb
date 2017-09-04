package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryInitialItemResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6886238628865271237L;
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


