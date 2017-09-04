package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemSizemappingTemplatesListResponse;

import java.util.Map;

public class TmallItemSizemappingTemplatesListRequest
        extends BaseTaobaoRequest<TmallItemSizemappingTemplatesListResponse> {
    public String getApiMethodName() {
        return "tmall.item.sizemapping.templates.list";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemSizemappingTemplatesListResponse> getResponseClass() {
        return TmallItemSizemappingTemplatesListResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


