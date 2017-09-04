package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class WlbOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 6585527438321839614L;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("cancel_order_status")
    private Long cancelOrderStatus;
    @ApiField("confirm_status")
    private String confirmStatus;
    @ApiField("expect_end_time")
    private Date expectEndTime;
    @ApiField("expect_start_time")
    private Date expectStartTime;
    @ApiField("ext_order_id")
    private Long extOrderId;
    @ApiField("invoice_info")
    private String invoiceInfo;
    @ApiField("is_completed")
    private Boolean isCompleted;
    @ApiField("item_kinds_count")
    private Long itemKindsCount;
    @ApiField("operate_type")
    private String operateType;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_flag")
    private Long orderFlag;
    @ApiField("order_source")
    private String orderSource;
    @ApiField("order_source_code")
    private String orderSourceCode;
    @ApiField("order_status")
    private String orderStatus;
    @ApiField("order_status_reason")
    private String orderStatusReason;
    @ApiField("order_sub_type")
    private String orderSubType;
    @ApiField("order_type")
    private String orderType;
    @ApiField("prev_order_code")
    private String prevOrderCode;
    @ApiField("real_kinds_count")
    private Long realKindsCount;
    @ApiField("receivable_amount")
    private Long receivableAmount;
    @ApiField("receiver_address")
    private String receiverAddress;
    @ApiField("receiver_area")
    private String receiverArea;
    @ApiField("receiver_city")
    private String receiverCity;
    @ApiField("receiver_email")
    private String receiverEmail;
    @ApiField("receiver_mail")
    private String receiverMail;
    @ApiField("receiver_mobile")
    private String receiverMobile;
    @ApiField("receiver_name")
    private String receiverName;
    @ApiField("receiver_phone")
    private String receiverPhone;
    @ApiField("receiver_province")
    private String receiverProvince;
    @ApiField("receiver_wangwang")
    private String receiverWangwang;
    @ApiField("receiver_zip_code")
    private String receiverZipCode;
    @ApiField("remark")
    private String remark;
    @ApiField("schedule_day")
    private String scheduleDay;
    @ApiField("schedule_end")
    private String scheduleEnd;
    @ApiField("schedule_speed")
    private Long scheduleSpeed;
    @ApiField("schedule_start")
    private String scheduleStart;
    @ApiField("sender_address")
    private String senderAddress;
    @ApiField("sender_area")
    private String senderArea;
    @ApiField("sender_city")
    private String senderCity;
    @ApiField("sender_email")
    private String senderEmail;
    @ApiField("sender_mobile")
    private String senderMobile;
    @ApiField("sender_name")
    private String senderName;
    @ApiField("sender_phone")
    private String senderPhone;
    @ApiField("sender_province")
    private String senderProvince;
    @ApiField("sender_zip_code")
    private String senderZipCode;
    @ApiField("service_fee")
    private Long serviceFee;
    @ApiField("shipping_type")
    private String shippingType;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("tms_tp_code")
    private String tmsTpCode;
    @ApiField("total_amount")
    private Long totalAmount;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Long getCancelOrderStatus() {
        return this.cancelOrderStatus;
    }

    public void setCancelOrderStatus(Long cancelOrderStatus) {
        this.cancelOrderStatus = cancelOrderStatus;
    }

    public String getConfirmStatus() {
        return this.confirmStatus;
    }

    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Date getExpectEndTime() {
        return this.expectEndTime;
    }

    public void setExpectEndTime(Date expectEndTime) {
        this.expectEndTime = expectEndTime;
    }

    public Date getExpectStartTime() {
        return this.expectStartTime;
    }

    public void setExpectStartTime(Date expectStartTime) {
        this.expectStartTime = expectStartTime;
    }

    public Long getExtOrderId() {
        return this.extOrderId;
    }

    public void setExtOrderId(Long extOrderId) {
        this.extOrderId = extOrderId;
    }

    public String getInvoiceInfo() {
        return this.invoiceInfo;
    }

    public void setInvoiceInfo(String invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
    }

    public Boolean getIsCompleted() {
        return this.isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Long getItemKindsCount() {
        return this.itemKindsCount;
    }

    public void setItemKindsCount(Long itemKindsCount) {
        this.itemKindsCount = itemKindsCount;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getOrderFlag() {
        return this.orderFlag;
    }

    public void setOrderFlag(Long orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getOrderSource() {
        return this.orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderSourceCode() {
        return this.orderSourceCode;
    }

    public void setOrderSourceCode(String orderSourceCode) {
        this.orderSourceCode = orderSourceCode;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusReason() {
        return this.orderStatusReason;
    }

    public void setOrderStatusReason(String orderStatusReason) {
        this.orderStatusReason = orderStatusReason;
    }

    public String getOrderSubType() {
        return this.orderSubType;
    }

    public void setOrderSubType(String orderSubType) {
        this.orderSubType = orderSubType;
    }

    public String getOrderType() {
        return this.orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPrevOrderCode() {
        return this.prevOrderCode;
    }

    public void setPrevOrderCode(String prevOrderCode) {
        this.prevOrderCode = prevOrderCode;
    }

    public Long getRealKindsCount() {
        return this.realKindsCount;
    }

    public void setRealKindsCount(Long realKindsCount) {
        this.realKindsCount = realKindsCount;
    }

    public Long getReceivableAmount() {
        return this.receivableAmount;
    }

    public void setReceivableAmount(Long receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverArea() {
        return this.receiverArea;
    }

    public void setReceiverArea(String receiverArea) {
        this.receiverArea = receiverArea;
    }

    public String getReceiverCity() {
        return this.receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverEmail() {
        return this.receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getReceiverMail() {
        return this.receiverMail;
    }

    public void setReceiverMail(String receiverMail) {
        this.receiverMail = receiverMail;
    }

    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverProvince() {
        return this.receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverWangwang() {
        return this.receiverWangwang;
    }

    public void setReceiverWangwang(String receiverWangwang) {
        this.receiverWangwang = receiverWangwang;
    }

    public String getReceiverZipCode() {
        return this.receiverZipCode;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getScheduleDay() {
        return this.scheduleDay;
    }

    public void setScheduleDay(String scheduleDay) {
        this.scheduleDay = scheduleDay;
    }

    public String getScheduleEnd() {
        return this.scheduleEnd;
    }

    public void setScheduleEnd(String scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    public Long getScheduleSpeed() {
        return this.scheduleSpeed;
    }

    public void setScheduleSpeed(Long scheduleSpeed) {
        this.scheduleSpeed = scheduleSpeed;
    }

    public String getScheduleStart() {
        return this.scheduleStart;
    }

    public void setScheduleStart(String scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderArea() {
        return this.senderArea;
    }

    public void setSenderArea(String senderArea) {
        this.senderArea = senderArea;
    }

    public String getSenderCity() {
        return this.senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderEmail() {
        return this.senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getSenderMobile() {
        return this.senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return this.senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderProvince() {
        return this.senderProvince;
    }

    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    public String getSenderZipCode() {
        return this.senderZipCode;
    }

    public void setSenderZipCode(String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }

    public Long getServiceFee() {
        return this.serviceFee;
    }

    public void setServiceFee(Long serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getShippingType() {
        return this.shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getTmsTpCode() {
        return this.tmsTpCode;
    }

    public void setTmsTpCode(String tmsTpCode) {
        this.tmsTpCode = tmsTpCode;
    }

    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}


