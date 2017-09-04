package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemIncrementUpdateSchemaGetResponse;

import java.util.Map;

public class TmallItemIncrementUpdateSchemaGetRequest
        extends BaseTaobaoRequest<TmallItemIncrementUpdateSchemaGetResponse> {
    private Long itemId;
    private String xmlData;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getXmlData() {
        return this.xmlData;
    }

    public String getApiMethodName() {
        return "tmall.item.increment.update.schema.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("xml_data", this.xmlData);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemIncrementUpdateSchemaGetResponse> getResponseClass() {
        return TmallItemIncrementUpdateSchemaGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
    }
}


