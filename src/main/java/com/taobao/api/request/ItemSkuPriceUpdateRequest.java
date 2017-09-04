package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuPriceUpdateResponse;

import java.util.Map;

public class ItemSkuPriceUpdateRequest
        extends BaseTaobaoRequest<ItemSkuPriceUpdateResponse> {
    private String ignorewarning;
    private String itemPrice;
    private String lang;
    private Long numIid;
    private String outerId;
    private String price;
    private String properties;
    private Long quantity;

    public void setIgnorewarning(String ignorewarning) {
        this.ignorewarning = ignorewarning;
    }

    public String getIgnorewarning() {
        return this.ignorewarning;
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

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public String getApiMethodName() {
        return "taobao.item.sku.price.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ignorewarning", this.ignorewarning);
        txtParams.put("item_price", this.itemPrice);
        txtParams.put("lang", this.lang);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("price", this.price);
        txtParams.put("properties", this.properties);
        txtParams.put("quantity", this.quantity);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemSkuPriceUpdateResponse> getResponseClass() {
        return ItemSkuPriceUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(this.properties, "properties");
        RequestCheckUtils.checkMinValue(this.quantity, 0L, "quantity");
    }
}


