package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.Orderitemlistwlbwmsstockinordernotifywl;
import com.taobao.api.domain.Receiverinfowlbwmsstockinordernotifywl;
import com.taobao.api.domain.Senderinfowlbwmsstockinordernotifywl;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockInOrderNotifyResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WlbWmsStockInOrderNotifyRequest
        extends BaseTaobaoRequest<WlbWmsStockInOrderNotifyResponse> {
    private String expectEndTime;
    private String expectStartTime;
    private String extendFields;
    private String inboundTypeDesc;
    private String orderCode;
    private Date orderCreateTime;
    private String orderFlag;
    private String orderItemList;
    private Long orderType;
    private String prevOrderCode;
    private String receiverInfo;
    private String remark;
    private String returnReason;
    private String senderInfo;
    private String storeCode;
    private String supplierCode;
    private String supplierName;
    private String tmsOrderCode;
    private String tmsServiceCode;
    private String tmsServiceName;

    public void setExpectEndTime(String expectEndTime) {
        this.expectEndTime = expectEndTime;
    }

    public String getExpectEndTime() {
        return this.expectEndTime;
    }

    public void setExpectStartTime(String expectStartTime) {
        this.expectStartTime = expectStartTime;
    }

    public String getExpectStartTime() {
        return this.expectStartTime;
    }

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
    }

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setInboundTypeDesc(String inboundTypeDesc) {
        this.inboundTypeDesc = inboundTypeDesc;
    }

    public String getInboundTypeDesc() {
        return this.inboundTypeDesc;
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

    public void setOrderItemList(List<Orderitemlistwlbwmsstockinordernotifywl> orderItemList) {
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

    public void setPrevOrderCode(String prevOrderCode) {
        this.prevOrderCode = prevOrderCode;
    }

    public String getPrevOrderCode() {
        return this.prevOrderCode;
    }

    public void setReceiverInfo(String receiverInfo) {
        this.receiverInfo = receiverInfo;
    }

    public void setReceiverInfo(Receiverinfowlbwmsstockinordernotifywl receiverInfo) {
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

    public void setSenderInfo(Senderinfowlbwmsstockinordernotifywl senderInfo) {
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

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return this.supplierCode;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return this.supplierName;
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
        return "taobao.wlb.wms.stock.in.order.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("expect_end_time", this.expectEndTime);
        txtParams.put("expect_start_time", this.expectStartTime);
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("inbound_type_desc", this.inboundTypeDesc);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_create_time", this.orderCreateTime);
        txtParams.put("order_flag", this.orderFlag);
        txtParams.put("order_item_list", this.orderItemList);
        txtParams.put("order_type", this.orderType);
        txtParams.put("prev_order_code", this.prevOrderCode);
        txtParams.put("receiver_info", this.receiverInfo);
        txtParams.put("remark", this.remark);
        txtParams.put("return_reason", this.returnReason);
        txtParams.put("sender_info", this.senderInfo);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("supplier_code", this.supplierCode);
        txtParams.put("supplier_name", this.supplierName);
        txtParams.put("tms_order_code", this.tmsOrderCode);
        txtParams.put("tms_service_code", this.tmsServiceCode);
        txtParams.put("tms_service_name", this.tmsServiceName);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsStockInOrderNotifyResponse> getResponseClass() {
        return WlbWmsStockInOrderNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.orderCode, "orderCode");
        RequestCheckUtils.checkNotEmpty(this.orderCreateTime, "orderCreateTime");
        RequestCheckUtils.checkObjectMaxListSize(this.orderItemList, 5000, "orderItemList");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
    }
}


