package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSpecsTicketGetResponse;

import java.util.Map;

public class TmallProductSpecsTicketGetRequest
        extends BaseTaobaoRequest<TmallProductSpecsTicketGetResponse> {
    private String specIds;

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    public String getSpecIds() {
        return this.specIds;
    }

    public String getApiMethodName() {
        return "tmall.product.specs.ticket.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("spec_ids", this.specIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductSpecsTicketGetResponse> getResponseClass() {
        return TmallProductSpecsTicketGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.specIds, "specIds");
    }
}


