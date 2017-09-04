package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.Orderitemlistwlbwmsstockoutordernotify;
import com.taobao.api.domain.Receiverwlbwmsstockoutordernotify;
import com.taobao.api.domain.Senderwlbwmsstockoutordernotify;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockOutOrderNotifyResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WlbWmsStockOutOrderNotifyRequest
        extends BaseTaobaoRequest<WlbWmsStockOutOrderNotifyResponse> {
    private String carNo;
    private String carriersName;
    private String extendFields;
    private String orderCode;
    private Date orderCreateTime;
    private String orderItemList;
    private Long orderType;
    private String outboundTypeDesc;
    private String pickCall;
    private String pickId;
    private String pickName;
    private String prevOrderCode;
    private String receiverInfo;
    private String remark;
    private Date sendTime;
    private String senderInfo;
    private String storeCode;
    private String transportMode;

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarNo() {
        return this.carNo;
    }

    public void setCarriersName(String carriersName) {
        this.carriersName = carriersName;
    }

    public String getCarriersName() {
        return this.carriersName;
    }

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
    }

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public void setOrderItemList(String orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void setOrderItemList(List<Orderitemlistwlbwmsstockoutordernotify> orderItemList) {
        this.orderItemList = new JSONWriter(false, true).write(orderItemList);
    }

    public String getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOutboundTypeDesc(String outboundTypeDesc) {
        this.outboundTypeDesc = outboundTypeDesc;
    }

    public String getOutboundTypeDesc() {
        return this.outboundTypeDesc;
    }

    public void setPickCall(String pickCall) {
        this.pickCall = pickCall;
    }

    public String getPickCall() {
        return this.pickCall;
    }

    public void setPickId(String pickId) {
        this.pickId = pickId;
    }

    public String getPickId() {
        return this.pickId;
    }

    public void setPickName(String pickName) {
        this.pickName = pickName;
    }

    public String getPickName() {
        return this.pickName;
    }

    public void setPrevOrderCode(String prevOrderCode) {
        this.prevOrderCode = prevOrderCode;
    }

    public String getPrevOrderCode() {
        return this.prevOrderCode;
    }

    public void setReceiverInfo(String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public void setReceiverInfo(Receiverwlbwmsstockoutordernotify receiverInfo) {
        this.receiverInfo = new JSONWriter(false, true).write(receiverInfo);
    }

    public String getReceiverInfo() {
        return this.receiverInfo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public void setSenderInfo(String senderInfo) {
        this.senderInfo = senderInfo;
    }

    public void setSenderInfo(Senderwlbwmsstockoutordernotify senderInfo) {
        this.senderInfo = new JSONWriter(false, true).write(senderInfo);
    }

    public String getSenderInfo() {
        return this.senderInfo;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getTransportMode() {
        return this.transportMode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.stock.out.order.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("car_no", this.carNo);
        txtParams.put("carriers_name", this.carriersName);
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_create_time", this.orderCreateTime);
        txtParams.put("order_item_list", this.orderItemList);
        txtParams.put("order_type", this.orderType);
        txtParams.put("outbound_type_desc", this.outboundTypeDesc);
        txtParams.put("pick_call", this.pickCall);
        txtParams.put("pick_id", this.pickId);
        txtParams.put("pick_name", this.pickName);
        txtParams.put("prev_order_code", this.prevOrderCode);
        txtParams.put("receiver_info", this.receiverInfo);
        txtParams.put("remark", this.remark);
        txtParams.put("send_time", this.sendTime);
        txtParams.put("sender_info", this.senderInfo);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("transport_mode", this.transportMode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsStockOutOrderNotifyResponse> getResponseClass() {
        return WlbWmsStockOutOrderNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.orderCode, "orderCode");
        RequestCheckUtils.checkNotEmpty(this.orderCreateTime, "orderCreateTime");
        RequestCheckUtils.checkObjectMaxListSize(this.orderItemList, 5000, "orderItemList");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
    }
}


