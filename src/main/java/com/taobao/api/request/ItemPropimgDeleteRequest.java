package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemPropimgDeleteResponse;

import java.util.Map;

public class ItemPropimgDeleteRequest
        extends BaseTaobaoRequest<ItemPropimgDeleteResponse> {
    private Long id;
    private Long numIid;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getApiMethodName() {
        return "taobao.item.propimg.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("num_iid", this.numIid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemPropimgDeleteResponse> getResponseClass() {
        return ItemPropimgDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.id, "id");
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
    }
}


