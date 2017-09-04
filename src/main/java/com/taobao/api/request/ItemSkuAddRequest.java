package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemSkuAddResponse;

import java.util.Map;

public class ItemSkuAddRequest
        extends BaseTaobaoRequest<ItemSkuAddResponse> {
    private String ignorewarning;
    private String itemPrice;
    private String lang;
    private Long numIid;
    private String outerId;
    private String price;
    private String properties;
    private Long quantity;
    private String skuHdHeight;
    private String skuHdLampQuantity;
    private String skuHdLength;
    private String specId;

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

    public void setSkuHdHeight(String skuHdHeight) {
        this.skuHdHeight = skuHdHeight;
    }

    public String getSkuHdHeight() {
        return this.skuHdHeight;
    }

    public void setSkuHdLampQuantity(String skuHdLampQuantity) {
        this.skuHdLampQuantity = skuHdLampQuantity;
    }

    public String getSkuHdLampQuantity() {
        return this.skuHdLampQuantity;
    }

    public void setSkuHdLength(String skuHdLength) {
        this.skuHdLength = skuHdLength;
    }

    public String getSkuHdLength() {
        return this.skuHdLength;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public String getSpecId() {
        return this.specId;
    }

    public String getApiMethodName() {
        return "taobao.item.sku.add";
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
        txtParams.put("sku_hd_height", this.skuHdHeight);
        txtParams.put("sku_hd_lamp_quantity", this.skuHdLampQuantity);
        txtParams.put("sku_hd_length", this.skuHdLength);
        txtParams.put("spec_id", this.specId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemSkuAddResponse> getResponseClass() {
        return ItemSkuAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(this.price, "price");
        RequestCheckUtils.checkNotEmpty(this.properties, "properties");
        RequestCheckUtils.checkNotEmpty(this.quantity, "quantity");
        RequestCheckUtils.checkMinValue(this.quantity, 0L, "quantity");
    }
}


