package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.WaybillApplyFullUpdateRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillIFullupdateResponse;

import java.util.Map;

public class WlbWaybillIFullupdateRequest
        extends BaseTaobaoRequest<WlbWaybillIFullupdateResponse> {
    private String waybillApplyFullUpdateRequest;

    public void setWaybillApplyFullUpdateRequest(String waybillApplyFullUpdateRequest) {
        this.waybillApplyFullUpdateRequest = waybillApplyFullUpdateRequest;
    }

    public void setWaybillApplyFullUpdateRequest(WaybillApplyFullUpdateRequest waybillApplyFullUpdateRequest) {
        this.waybillApplyFullUpdateRequest = new JSONWriter(false, true).write(waybillApplyFullUpdateRequest);
    }

    public String getWaybillApplyFullUpdateRequest() {
        return this.waybillApplyFullUpdateRequest;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.fullupdate";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_apply_full_update_request", this.waybillApplyFullUpdateRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWaybillIFullupdateResponse> getResponseClass() {
        return WlbWaybillIFullupdateResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


