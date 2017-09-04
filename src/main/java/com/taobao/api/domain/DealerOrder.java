package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class DealerOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 4337837729338793251L;
    @ApiField("alipay_no")
    private String alipayNo;
    @ApiField("applied_time")
    private Date appliedTime;
    @ApiField("applier_nick")
    private String applierNick;
    @ApiField("audit_time_applier")
    private Date auditTimeApplier;
    @ApiField("audit_time_supplier")
    private Date auditTimeSupplier;
    @ApiField("close_reason")
    private String closeReason;
    @ApiListField("dealer_order_details")
    @ApiField("dealer_order_detail")
    private List<DealerOrderDetail> dealerOrderDetails;
    @ApiField("dealer_order_id")
    private Long dealerOrderId;
    @ApiField("delivered_quantity_count")
    private Long deliveredQuantityCount;
    @ApiField("logistics_fee")
    private String logisticsFee;
    @ApiField("logistics_type")
    private String logisticsType;
    @ApiField("modified_time")
    private Date modifiedTime;
    @ApiField("order_status")
    private String orderStatus;
    @ApiField("pay_time")
    private Date payTime;
    @ApiField("pay_type")
    private String payType;
    @ApiField("quantity_count")
    private Long quantityCount;
    @ApiField("receiver")
    private Receiver receiver;
    @ApiField("refuse_reason_applier")
    private String refuseReasonApplier;
    @ApiField("refuse_reason_supplier")
    private String refuseReasonSupplier;
    @ApiField("supplier_memo")
    private String supplierMemo;
    @ApiField("supplier_memo_flag")
    private Long supplierMemoFlag;
    @ApiField("supplier_nick")
    private String supplierNick;
    @ApiField("total_price")
    private String totalPrice;

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public Date getAppliedTime() {
        return this.appliedTime;
    }

    public void setAppliedTime(Date appliedTime) {
        this.appliedTime = appliedTime;
    }

    public String getApplierNick() {
        return this.applierNick;
    }

    public void setApplierNick(String applierNick) {
        this.applierNick = applierNick;
    }

    public Date getAuditTimeApplier() {
        return this.auditTimeApplier;
    }

    public void setAuditTimeApplier(Date auditTimeApplier) {
        this.auditTimeApplier = auditTimeApplier;
    }

    public Date getAuditTimeSupplier() {
        return this.auditTimeSupplier;
    }

    public void setAuditTimeSupplier(Date auditTimeSupplier) {
        this.auditTimeSupplier = auditTimeSupplier;
    }

    public String getCloseReason() {
        return this.closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public List<DealerOrderDetail> getDealerOrderDetails() {
        return this.dealerOrderDetails;
    }

    public void setDealerOrderDetails(List<DealerOrderDetail> dealerOrderDetails) {
        this.dealerOrderDetails = dealerOrderDetails;
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public Long getDeliveredQuantityCount() {
        return this.deliveredQuantityCount;
    }

    public void setDeliveredQuantityCount(Long deliveredQuantityCount) {
        this.deliveredQuantityCount = deliveredQuantityCount;
    }

    public String getLogisticsFee() {
        return this.logisticsFee;
    }

    public void setLogisticsFee(String logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public String getLogisticsType() {
        return this.logisticsType;
    }

    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Long getQuantityCount() {
        return this.quantityCount;
    }

    public void setQuantityCount(Long quantityCount) {
        this.quantityCount = quantityCount;
    }

    public Receiver getReceiver() {
        return this.receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public String getRefuseReasonApplier() {
        return this.refuseReasonApplier;
    }

    public void setRefuseReasonApplier(String refuseReasonApplier) {
        this.refuseReasonApplier = refuseReasonApplier;
    }

    public String getRefuseReasonSupplier() {
        return this.refuseReasonSupplier;
    }

    public void setRefuseReasonSupplier(String refuseReasonSupplier) {
        this.refuseReasonSupplier = refuseReasonSupplier;
    }

    public String getSupplierMemo() {
        return this.supplierMemo;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo;
    }

    public Long getSupplierMemoFlag() {
        return this.supplierMemoFlag;
    }

    public void setSupplierMemoFlag(Long supplierMemoFlag) {
        this.supplierMemoFlag = supplierMemoFlag;
    }

    public String getSupplierNick() {
        return this.supplierNick;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
    }

    public String getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}


