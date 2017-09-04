package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemRecommendAddResponse;

import java.util.Map;

public class ItemRecommendAddRequest
        extends BaseTaobaoRequest<ItemRecommendAddResponse> {
    private Long numIid;

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getApiMethodName() {
        return "taobao.item.recommend.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("num_iid", this.numIid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemRecommendAddResponse> getResponseClass() {
        return ItemRecommendAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
    }
}


