package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.UpdateItemShipTimeOption;
import com.taobao.api.domain.UpdateSkuShipTime;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemShiptimeUpdateResponse;

import java.util.List;
import java.util.Map;

public class TmallItemShiptimeUpdateRequest
        extends BaseTaobaoRequest<TmallItemShiptimeUpdateResponse> {
    private Long itemId;
    private String option;
    private String shipTime;
    private String skuShipTimes;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setOption(UpdateItemShipTimeOption option) {
        this.option = new JSONWriter(false, true).write(option);
    }

    public String getOption() {
        return this.option;
    }

    public void setShipTime(String shipTime) {
        this.shipTime = shipTime;
    }

    public String getShipTime() {
        return this.shipTime;
    }

    public void setSkuShipTimes(String skuShipTimes) {
        this.skuShipTimes = skuShipTimes;
    }

    public void setSkuShipTimes(List<UpdateSkuShipTime> skuShipTimes) {
        this.skuShipTimes = new JSONWriter(false, true).write(skuShipTimes);
    }

    public String getSkuShipTimes() {
        return this.skuShipTimes;
    }

    public String getApiMethodName() {
        return "tmall.item.shiptime.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("option", this.option);
        txtParams.put("ship_time", this.shipTime);
        txtParams.put("sku_ship_times", this.skuShipTimes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallItemShiptimeUpdateResponse> getResponseClass() {
        return TmallItemShiptimeUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.itemId, "itemId");
        RequestCheckUtils.checkObjectMaxListSize(this.skuShipTimes, 20, "skuShipTimes");
    }
}


