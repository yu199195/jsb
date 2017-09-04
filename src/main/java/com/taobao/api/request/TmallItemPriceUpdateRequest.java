package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.UpdateItemPriceOption;
import com.taobao.api.domain.UpdateSkuPrice;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemPriceUpdateResponse;

import java.util.List;
import java.util.Map;

public class TmallItemPriceUpdateRequest
        extends BaseTaobaoRequest<TmallItemPriceUpdateResponse> {
    private Long itemId;
    private String itemPrice;
    private String options;
    private String skuPrices;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setOptions(UpdateItemPriceOption options) {
        this.options = new JSONWriter(false, true).write(options);
    }

    public String getOptions() {
        return this.options;
    }

    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public void setSkuPrices(List<UpdateSkuPrice> skuPrices) {
        this.skuPrices = new JSONWriter(false, true).write(skuPrices);
    }

    public String getSkuPrices() {
        return this.skuPrices;
    }

    public String getApiMethodName() {
        return "tmall.item.price.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("item_price", this.itemPrice);
        txtParams.put("options", this.options);
        txtParams.put("sku_prices", this.skuPrices);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemPriceUpdateResponse> getResponseClass() {
        return TmallItemPriceUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkObjectMaxListSize(this.skuPrices, 999999, "skuPrices");
    }
}


