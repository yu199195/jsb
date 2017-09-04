package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class InventoryAdjustTradeResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8329994998515872256L;
    @ApiField("operate_code")
    private String operateCode;
    @ApiListField("tip_infos")
    @ApiField("tip_info")
    private List<TipInfo> tipInfos;

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public String getOperateCode() {
        return this.operateCode;
    }

    public void setTipInfos(List<TipInfo> tipInfos) {
        this.tipInfos = tipInfos;
    }

    public List<TipInfo> getTipInfos() {
        return this.tipInfos;
    }
}


