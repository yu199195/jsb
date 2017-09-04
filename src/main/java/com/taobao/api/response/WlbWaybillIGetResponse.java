package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplyNewInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbWaybillIGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8299486844155627814L;
    @ApiListField("waybill_apply_new_cols")
    @ApiField("waybill_apply_new_info")
    private List<WaybillApplyNewInfo> waybillApplyNewCols;

    public void setWaybillApplyNewCols(List<WaybillApplyNewInfo> waybillApplyNewCols) {
        this.waybillApplyNewCols = waybillApplyNewCols;
    }

    public List<WaybillApplyNewInfo> getWaybillApplyNewCols() {
        return this.waybillApplyNewCols;
    }
}


