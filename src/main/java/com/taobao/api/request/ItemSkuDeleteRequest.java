package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuDeleteResponse;

import java.util.Map;

public class ItemSkuDeleteRequest
        extends BaseTaobaoRequest<ItemSkuDeleteResponse> {
    private String ignorewarning;
    private Long itemNum;
    private String itemPrice;
    private String lang;
    private Long numIid;
    private String properties;

    public void setIgnorewarning(String ignorewarning) {
        this.ignorewarning = ignorewarning;
    }

    public String getIgnorewarning() {
        return this.ignorewarning;
    }

    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    public Long getItemNum() {
        return this.itemNum;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return this.lang;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getApiMethodName() {
        return "taobao.item.sku.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ignorewarning", this.ignorewarning);
        txtParams.put("item_num", this.itemNum);
        txtParams.put("item_price", this.itemPrice);
        txtParams.put("lang", this.lang);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("properties", this.properties);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemSkuDeleteResponse> getResponseClass() {
        return ItemSkuDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkNotEmpty(this.properties, "properties");
    }
}


