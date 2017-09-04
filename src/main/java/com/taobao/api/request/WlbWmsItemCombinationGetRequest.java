package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWmsItemCombinationGetResponse;

import java.util.Map;

public class WlbWmsItemCombinationGetRequest
        extends BaseTaobaoRequest<WlbWmsItemCombinationGetResponse> {
    private Long itemid;

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public Long getItemid() {
        return this.itemid;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.item.combination.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("itemid", this.itemid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsItemCombinationGetResponse> getResponseClass() {
        return WlbWmsItemCombinationGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemid, "itemid");
    }
}


