package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.WaybillDetailQueryRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWaybillIQuerydetailResponse;

import java.util.Map;

public class WlbWaybillIQuerydetailRequest
        extends BaseTaobaoRequest<WlbWaybillIQuerydetailResponse> {
    private String waybillDetailQueryRequest;

    public void setWaybillDetailQueryRequest(String waybillDetailQueryRequest) {
        this.waybillDetailQueryRequest = waybillDetailQueryRequest;
    }

    public void setWaybillDetailQueryRequest(WaybillDetailQueryRequest waybillDetailQueryRequest) {
        this.waybillDetailQueryRequest = new JSONWriter(false, true).write(waybillDetailQueryRequest);
    }

    public String getWaybillDetailQueryRequest() {
        return this.waybillDetailQueryRequest;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.i.querydetail";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("waybill_detail_query_request", this.waybillDetailQueryRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWaybillIQuerydetailResponse> getResponseClass() {
        return WlbWaybillIQuerydetailResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


