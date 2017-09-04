package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.Orderitemlistwlbwmsreturnordernotify;
import com.taobao.api.domain.Receiverinfowlbwmsreturnordernotify;
import com.taobao.api.domain.Senderinfowlbwmsreturnordernotify;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsReturnOrderNotifyResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WlbWmsReturnOrderNotifyRequest
        extends BaseTaobaoRequest<WlbWmsReturnOrderNotifyResponse> {
    private String buyerNick;
    private String extendFields;
    private String orderCode;
    private Date orderCreateTime;
    private String orderFlag;
    private String orderItemList;
    private String orderSource;
    private String orderType;
    private String ownerUserId;
    private String prevOrderCode;
    private String receiverInfo;
    private String remark;
    private String returnReason;
    private String senderInfo;
    private String storeCode;
    private String tmsOrderCode;
    private String tmsServiceCode;
    private String tmsServiceName;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
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

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getOrderFlag() {
        return this.orderFlag;
    }

    public void setOrderItemList(String orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void setOrderItemList(List<Orderitemlistwlbwmsreturnordernotify> orderItemList) {
        this.orderItemList = new JSONWriter(false, true).write(orderItemList);
    }

    public String getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderSource() {
        return this.orderSource;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getOwnerUserId() {
        return this.ownerUserId;
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

    public void setReceiverInfo(Receiverinfowlbwmsreturnordernotify receiverInfo) {
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

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getReturnReason() {
        return this.returnReason;
    }

    public void setSenderInfo(String senderInfo) {
        this.senderInfo = senderInfo;
    }

    public void setSenderInfo(Senderinfowlbwmsreturnordernotify senderInfo) {
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

    public void setTmsOrderCode(String tmsOrderCode) {
        this.tmsOrderCode = tmsOrderCode;
    }

    public String getTmsOrderCode() {
        return this.tmsOrderCode;
    }

    public void setTmsServiceCode(String tmsServiceCode) {
        this.tmsServiceCode = tmsServiceCode;
    }

    public String getTmsServiceCode() {
        return this.tmsServiceCode;
    }

    public void setTmsServiceName(String tmsServiceName) {
        this.tmsServiceName = tmsServiceName;
    }

    public String getTmsServiceName() {
        return this.tmsServiceName;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.return.order.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_create_time", this.orderCreateTime);
        txtParams.put("order_flag", this.orderFlag);
        txtParams.put("order_item_list", this.orderItemList);
        txtParams.put("order_source", this.orderSource);
        txtParams.put("order_type", this.orderType);
        txtParams.put("owner_user_id", this.ownerUserId);
        txtParams.put("prev_order_code", this.prevOrderCode);
        txtParams.put("receiver_info", this.receiverInfo);
        txtParams.put("remark", this.remark);
        txtParams.put("return_reason", this.returnReason);
        txtParams.put("sender_info", this.senderInfo);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("tms_order_code", this.tmsOrderCode);
        txtParams.put("tms_service_code", this.tmsServiceCode);
        txtParams.put("tms_service_name", this.tmsServiceName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsReturnOrderNotifyResponse> getResponseClass() {
        return WlbWmsReturnOrderNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkObjectMaxListSize(this.orderItemList, 50000, "orderItemList");
    }
}


