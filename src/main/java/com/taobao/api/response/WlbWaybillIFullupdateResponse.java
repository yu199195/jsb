package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplyUpdateInfo;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWaybillIFullupdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2311712393334769663L;
    @ApiField("waybill_apply_update_info")
    private WaybillApplyUpdateInfo waybillApplyUpdateInfo;

    public void setWaybillApplyUpdateInfo(WaybillApplyUpdateInfo waybillApplyUpdateInfo) {
        this.waybillApplyUpdateInfo = waybillApplyUpdateInfo;
    }

    public WaybillApplyUpdateInfo getWaybillApplyUpdateInfo() {
        return this.waybillApplyUpdateInfo;
    }
}


