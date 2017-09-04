package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercatsListAddResponse;

import java.util.Map;

public class SellercatsListAddRequest
        extends BaseTaobaoRequest<SellercatsListAddResponse> {
    private String name;
    private Long parentCid;
    private String pictUrl;
    private Long sortOrder;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Long getParentCid() {
        return this.parentCid;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl;
    }

    public String getPictUrl() {
        return this.pictUrl;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() {
        return this.sortOrder;
    }

    public String getApiMethodName() {
        return "taobao.sellercats.list.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("name", this.name);
        txtParams.put("parent_cid", this.parentCid);
        txtParams.put("pict_url", this.pictUrl);
        txtParams.put("sort_order", this.sortOrder);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SellercatsListAddResponse> getResponseClass() {
        return SellercatsListAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.name, "name");
    }
}


