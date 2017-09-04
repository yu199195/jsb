package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryAdjustTradeResponse;

import java.util.Date;
import java.util.Map;

public class InventoryAdjustTradeRequest
        extends BaseTaobaoRequest<InventoryAdjustTradeResponse> {
    private String bizUniqueCode;
    private String items;
    private Date operateTime;
    private String tbOrderType;

    public void setBizUniqueCode(String bizUniqueCode) {
        this.bizUniqueCode = bizUniqueCode;
    }

    public String getBizUniqueCode() {
        return this.bizUniqueCode;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return this.items;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setTbOrderType(String tbOrderType) {
        this.tbOrderType = tbOrderType;
    }

    public String getTbOrderType() {
        return this.tbOrderType;
    }

    public String getApiMethodName() {
        return "taobao.inventory.adjust.trade";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_unique_code", this.bizUniqueCode);
        txtParams.put("items", this.items);
        txtParams.put("operate_time", this.operateTime);
        txtParams.put("tb_order_type", this.tbOrderType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<InventoryAdjustTradeResponse> getResponseClass() {
        return InventoryAdjustTradeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.bizUniqueCode, "bizUniqueCode");
        RequestCheckUtils.checkNotEmpty(this.items, "items");
        RequestCheckUtils.checkNotEmpty(this.operateTime, "operateTime");
        RequestCheckUtils.checkNotEmpty(this.tbOrderType, "tbOrderType");
    }
}


