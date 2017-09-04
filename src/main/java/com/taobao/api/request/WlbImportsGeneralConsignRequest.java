package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbImportsGeneralConsignResponse;

import java.util.Map;

public class WlbImportsGeneralConsignRequest
        extends BaseTaobaoRequest<WlbImportsGeneralConsignResponse> {
    private Long cancelId;
    private String firstLogistics;
    private String firstWaybillno;
    private Long resourceId;
    private Long senderId;
    private String storeCode;
    private Long tradeOrderId;

    public void setCancelId(Long cancelId) {
        this.cancelId = cancelId;
    }

    public Long getCancelId() {
        return this.cancelId;
    }

    public void setFirstLogistics(String firstLogistics) {
        this.firstLogistics = firstLogistics;
    }

    public String getFirstLogistics() {
        return this.firstLogistics;
    }

    public void setFirstWaybillno(String firstWaybillno) {
        this.firstWaybillno = firstWaybillno;
    }

    public String getFirstWaybillno() {
        return this.firstWaybillno;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getResourceId() {
        return this.resourceId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getSenderId() {
        return this.senderId;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setTradeOrderId(Long tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
    }

    public Long getTradeOrderId() {
        return this.tradeOrderId;
    }

    public String getApiMethodName() {
        return "taobao.wlb.imports.general.consign";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cancel_id", this.cancelId);
        txtParams.put("first_logistics", this.firstLogistics);
        txtParams.put("first_waybillno", this.firstWaybillno);
        txtParams.put("resource_id", this.resourceId);
        txtParams.put("sender_id", this.senderId);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("trade_order_id", this.tradeOrderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbImportsGeneralConsignResponse> getResponseClass() {
        return WlbImportsGeneralConsignResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.firstLogistics, "firstLogistics");
        RequestCheckUtils.checkNotEmpty(this.firstWaybillno, "firstWaybillno");
        RequestCheckUtils.checkNotEmpty(this.resourceId, "resourceId");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
        RequestCheckUtils.checkNotEmpty(this.tradeOrderId, "tradeOrderId");
    }
}


