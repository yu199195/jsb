package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class RefundDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 5243833898287456191L;
    @ApiField("buyer_refund")
    private BuyerRefund buyerRefund;
    @ApiField("distributor_nick")
    private String distributorNick;
    @ApiField("is_return_goods")
    private Boolean isReturnGoods;
    @ApiField("modified")
    private Date modified;
    @ApiField("pay_sup_fee")
    private String paySupFee;
    @ApiField("purchase_order_id")
    private Long purchaseOrderId;
    @ApiField("refund_create_time")
    private Date refundCreateTime;
    @ApiField("refund_desc")
    private String refundDesc;
    @ApiField("refund_fee")
    private String refundFee;
    @ApiField("refund_flow_type")
    private Long refundFlowType;
    @ApiField("refund_reason")
    private String refundReason;
    @ApiField("refund_status")
    private Long refundStatus;
    @ApiField("sub_order_id")
    private Long subOrderId;
    @ApiField("supplier_nick")
    private String supplierNick;
    @ApiField("timeout")
    private Date timeout;
    @ApiField("to_type")
    private Long toType;

    public BuyerRefund getBuyerRefund() {
        return this.buyerRefund;
    }

    public void setBuyerRefund(BuyerRefund buyerRefund) {
        this.buyerRefund = buyerRefund;
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public Boolean getIsReturnGoods() {
        return this.isReturnGoods;
    }

    public void setIsReturnGoods(Boolean isReturnGoods) {
        this.isReturnGoods = isReturnGoods;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getPaySupFee() {
        return this.paySupFee;
    }

    public void setPaySupFee(String paySupFee) {
        this.paySupFee = paySupFee;
    }

    public Long getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Date getRefundCreateTime() {
        return this.refundCreateTime;
    }

    public void setRefundCreateTime(Date refundCreateTime) {
        this.refundCreateTime = refundCreateTime;
    }

    public String getRefundDesc() {
        return this.refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public Long getRefundFlowType() {
        return this.refundFlowType;
    }

    public void setRefundFlowType(Long refundFlowType) {
        this.refundFlowType = refundFlowType;
    }

    public String getRefundReason() {
        return this.refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Long getRefundStatus() {
        return this.refundStatus;
    }

    public void setRefundStatus(Long refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Long getSubOrderId() {
        return this.subOrderId;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    public String getSupplierNick() {
        return this.supplierNick;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
    }

    public Date getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Long getToType() {
        return this.toType;
    }

    public void setToType(Long toType) {
        this.toType = toType;
    }
}


