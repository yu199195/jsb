package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderQueryResponse;

import java.util.Map;

public class FenxiaoDealerRequisitionorderQueryRequest
        extends BaseTaobaoRequest<FenxiaoDealerRequisitionorderQueryResponse> {
    private String dealerOrderIds;
    private String fields;

    public void setDealerOrderIds(String dealerOrderIds) {
        this.dealerOrderIds = dealerOrderIds;
    }

    public String getDealerOrderIds() {
        return this.dealerOrderIds;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_ids", this.dealerOrderIds);
        txtParams.put("fields", this.fields);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoDealerRequisitionorderQueryResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.dealerOrderIds, "dealerOrderIds");
        RequestCheckUtils.checkMaxListSize(this.dealerOrderIds, 50, "dealerOrderIds");
    }
}


