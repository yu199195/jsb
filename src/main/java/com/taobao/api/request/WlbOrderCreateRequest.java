package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderCreateResponse;

import java.util.Date;
import java.util.Map;

public class WlbOrderCreateRequest
        extends BaseTaobaoRequest<WlbOrderCreateResponse> {
    private String alipayNo;
    private String attributes;
    private String buyerNick;
    private Date expectEndTime;
    private Date expectStartTime;
    private String invoinceInfo;
    private Boolean isFinished;
    private String orderCode;
    private String orderFlag;
    private String orderItemList;
    private String orderSubType;
    private String orderType;
    private String outBizCode;
    private Long packageCount;
    private Long payableAmount;
    private String prevOrderCode;
    private String receiverInfo;
    private String remark;
    private String scheduleEnd;
    private String scheduleStart;
    private String scheduleType;
    private String senderInfo;
    private Long serviceFee;
    private String storeCode;
    private String tmsInfo;
    private String tmsOrderCode;
    private String tmsServiceCode;
    private Long totalAmount;

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAttributes() {
        return this.attributes;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setExpectEndTime(Date expectEndTime) {
        this.expectEndTime = expectEndTime;
    }

    public Date getExpectEndTime() {
        return this.expectEndTime;
    }

    public void setExpectStartTime(Date expectStartTime) {
        this.expectStartTime = expectStartTime;
    }

    public Date getExpectStartTime() {
        return this.expectStartTime;
    }

    public void setInvoinceInfo(String invoinceInfo) {
        this.invoinceInfo = invoinceInfo;
    }

    public String getInvoinceInfo() {
        return this.invoinceInfo;
    }

    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }

    public Boolean getIsFinished() {
        return this.isFinished;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
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

    public String getOrderItemList() {
        return this.orderItemList;
    }

    public void setOrderSubType(String orderSubType) {
        this.orderSubType = orderSubType;
    }

    public String getOrderSubType() {
        return this.orderSubType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setPackageCount(Long packageCount) {
        this.packageCount = packageCount;
    }

    public Long getPackageCount() {
        return this.packageCount;
    }

    public void setPayableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Long getPayableAmount() {
        return this.payableAmount;
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

    public String getReceiverInfo() {
        return this.receiverInfo;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setScheduleEnd(String scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    public String getScheduleEnd() {
        return this.scheduleEnd;
    }

    public void setScheduleStart(String scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public String getScheduleStart() {
        return this.scheduleStart;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getScheduleType() {
        return this.scheduleType;
    }

    public void setSenderInfo(String senderInfo) {
        this.senderInfo = senderInfo;
    }

    public String getSenderInfo() {
        return this.senderInfo;
    }

    public void setServiceFee(Long serviceFee) {
        this.serviceFee = serviceFee;
    }

    public Long getServiceFee() {
        return this.serviceFee;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setTmsInfo(String tmsInfo) {
        this.tmsInfo = tmsInfo;
    }

    public String getTmsInfo() {
        return this.tmsInfo;
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

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public String getApiMethodName() {
        return "taobao.wlb.order.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("alipay_no", this.alipayNo);
        txtParams.put("attributes", this.attributes);
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("expect_end_time", this.expectEndTime);
        txtParams.put("expect_start_time", this.expectStartTime);
        txtParams.put("invoince_info", this.invoinceInfo);
        txtParams.put("is_finished", this.isFinished);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_flag", this.orderFlag);
        txtParams.put("order_item_list", this.orderItemList);
        txtParams.put("order_sub_type", this.orderSubType);
        txtParams.put("order_type", this.orderType);
        txtParams.put("out_biz_code", this.outBizCode);
        txtParams.put("package_count", this.packageCount);
        txtParams.put("payable_amount", this.payableAmount);
        txtParams.put("prev_order_code", this.prevOrderCode);
        txtParams.put("receiver_info", this.receiverInfo);
        txtParams.put("remark", this.remark);
        txtParams.put("schedule_end", this.scheduleEnd);
        txtParams.put("schedule_start", this.scheduleStart);
        txtParams.put("schedule_type", this.scheduleType);
        txtParams.put("sender_info", this.senderInfo);
        txtParams.put("service_fee", this.serviceFee);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("tms_info", this.tmsInfo);
        txtParams.put("tms_order_code", this.tmsOrderCode);
        txtParams.put("tms_service_code", this.tmsServiceCode);
        txtParams.put("total_amount", this.totalAmount);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbOrderCreateResponse> getResponseClass() {
        return WlbOrderCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.buyerNick, 64, "buyerNick");
        RequestCheckUtils.checkNotEmpty(this.isFinished, "isFinished");
        RequestCheckUtils.checkNotEmpty(this.orderItemList, "orderItemList");
        RequestCheckUtils.checkNotEmpty(this.orderSubType, "orderSubType");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkNotEmpty(this.outBizCode, "outBizCode");
        RequestCheckUtils.checkMaxLength(this.outBizCode, 128, "outBizCode");
        RequestCheckUtils.checkMaxLength(this.remark, 4000, "remark");
        RequestCheckUtils.checkNotEmpty(this.storeCode, "storeCode");
        RequestCheckUtils.checkMaxLength(this.storeCode, 64, "storeCode");
        RequestCheckUtils.checkMaxLength(this.tmsServiceCode, 64, "tmsServiceCode");
    }
}


