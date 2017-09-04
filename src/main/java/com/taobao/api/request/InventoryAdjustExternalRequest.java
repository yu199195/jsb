package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryAdjustExternalResponse;

import java.util.Date;
import java.util.Map;

public class InventoryAdjustExternalRequest
        extends BaseTaobaoRequest<InventoryAdjustExternalResponse> {
    private String bizType;
    private String bizUniqueCode;
    private String items;
    private String occupyOperateCode;
    private Date operateTime;
    private String operateType;
    private String reduceType;
    private String storeCode;

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getBizType() {
        return this.bizType;
    }

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

    public void setOccupyOperateCode(String occupyOperateCode) {
        this.occupyOperateCode = occupyOperateCode;
    }

    public String getOccupyOperateCode() {
        return this.occupyOperateCode;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public void setReduceType(String reduceType) {
        this.reduceType = reduceType;
    }

    public String getReduceType() {
        return this.reduceType;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getApiMethodName() {
        return "taobao.inventory.adjust.external";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_type", this.bizType);
        txtParams.put("biz_unique_code", this.bizUniqueCode);
        txtParams.put("items", this.items);
        txtParams.put("occupy_operate_code", this.occupyOperateCode);
        txtParams.put("operate_time", this.operateTime);
        txtParams.put("operate_type", this.operateType);
        txtParams.put("reduce_type", this.reduceType);
        txtParams.put("store_code", this.storeCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<InventoryAdjustExternalResponse> getResponseClass() {
        return InventoryAdjustExternalResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.bizType, "bizType");
        RequestCheckUtils.checkNotEmpty(this.bizUniqueCode, "bizUniqueCode");
        RequestCheckUtils.checkNotEmpty(this.items, "items");
        RequestCheckUtils.checkNotEmpty(this.operateTime, "operateTime");
        RequestCheckUtils.checkNotEmpty(this.operateType, "operateType");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
    }
}


