package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.UpdateSkuOuterId;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemOuteridUpdateResponse;

import java.util.List;
import java.util.Map;

public class TmallItemOuteridUpdateRequest
        extends BaseTaobaoRequest<TmallItemOuteridUpdateResponse> {
    private Long itemId;
    private String outerId;
    private String skuOuters;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setSkuOuters(String skuOuters) {
        this.skuOuters = skuOuters;
    }

    public void setSkuOuters(List<UpdateSkuOuterId> skuOuters) {
        this.skuOuters = new JSONWriter(false, true).write(skuOuters);
    }

    public String getSkuOuters() {
        return this.skuOuters;
    }

    public String getApiMethodName() {
        return "tmall.item.outerid.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("sku_outers", this.skuOuters);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemOuteridUpdateResponse> getResponseClass() {
        return TmallItemOuteridUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkObjectMaxListSize(this.skuOuters, 2000, "skuOuters");
    }
}


