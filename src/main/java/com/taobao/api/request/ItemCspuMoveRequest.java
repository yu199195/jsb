package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemCspuMoveResponse;

import java.util.Map;

public class ItemCspuMoveRequest
        extends BaseTaobaoRequest<ItemCspuMoveResponse> {
    private Long itemId;
    private String skuCspuMapping;
    private String skuMealpropertyMapping;
    private Long spuId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setSkuCspuMapping(String skuCspuMapping) {
        this.skuCspuMapping = skuCspuMapping;
    }

    public String getSkuCspuMapping() {
        return this.skuCspuMapping;
    }

    public void setSkuMealpropertyMapping(String skuMealpropertyMapping) {
        this.skuMealpropertyMapping = skuMealpropertyMapping;
    }

    public String getSkuMealpropertyMapping() {
        return this.skuMealpropertyMapping;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    public String getApiMethodName() {
        return "taobao.item.cspu.move";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("sku_cspu_mapping", this.skuCspuMapping);
        txtParams.put("sku_mealproperty_mapping", this.skuMealpropertyMapping);
        txtParams.put("spu_id", this.spuId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemCspuMoveResponse> getResponseClass() {
        return ItemCspuMoveResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
    }
}


