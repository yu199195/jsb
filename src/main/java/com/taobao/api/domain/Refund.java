package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Refund
        extends TaobaoObject {
    private static final long serialVersionUID = 2834558598376583612L;
    @ApiField("address")
    private String address;
    @ApiField("advance_status")
    private Long advanceStatus;
    @ApiField("alipay_no")
    private String alipayNo;
    @ApiField("attribute")
    private String attribute;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("company_name")
    private String companyName;
    @ApiField("created")
    private Date created;
    @ApiField("cs_status")
    private Long csStatus;
    @ApiField("desc")
    private String desc;
    @ApiField("good_return_time")
    private Date goodReturnTime;
    @ApiField("good_status")
    private String goodStatus;
    @ApiField("has_good_return")
    private Boolean hasGoodReturn;
    @ApiField("iid")
    private String iid;
    @ApiField("modified")
    private Date modified;
    @ApiField("num")
    private Long num;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("oid")
    private Long oid;
    @ApiField("operation_contraint")
    private String operationContraint;
    @ApiField("order_status")
    private String orderStatus;
    @ApiField("outer_id")
    private String outerId;
    @ApiField("payment")
    private String payment;
    @ApiField("price")
    private String price;
    @ApiField("reason")
    private String reason;
    @ApiField("refund_fee")
    private String refundFee;
    @ApiField("refund_id")
    private Long refundId;
    @ApiField("refund_phase")
    private String refundPhase;
    @ApiField("refund_remind_timeout")
    private RefundRemindTimeout refundRemindTimeout;
    @ApiField("refund_version")
    private Long refundVersion;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("shipping_type")
    private String shippingType;
    @ApiField("sid")
    private String sid;
    @ApiField("sku")
    private String sku;
    @ApiField("split_seller_fee")
    private String splitSellerFee;
    @ApiField("split_taobao_fee")
    private String splitTaobaoFee;
    @ApiField("status")
    private String status;
    @ApiField("tid")
    private Long tid;
    @ApiField("title")
    private String title;
    @ApiField("total_fee")
    private String totalFee;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAdvanceStatus() {
        return this.advanceStatus;
    }

    public void setAdvanceStatus(Long advanceStatus) {
        this.advanceStatus = advanceStatus;
    }

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getCsStatus() {
        return this.csStatus;
    }

    public void setCsStatus(Long csStatus) {
        this.csStatus = csStatus;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getGoodReturnTime() {
        return this.goodReturnTime;
    }

    public void setGoodReturnTime(Date goodReturnTime) {
        this.goodReturnTime = goodReturnTime;
    }

    public String getGoodStatus() {
        return this.goodStatus;
    }

    public void setGoodStatus(String goodStatus) {
        this.goodStatus = goodStatus;
    }

    public Boolean getHasGoodReturn() {
        return this.hasGoodReturn;
    }

    public void setHasGoodReturn(Boolean hasGoodReturn) {
        this.hasGoodReturn = hasGoodReturn;
    }

    public String getIid() {
        return this.iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getOperationContraint() {
        return this.operationContraint;
    }

    public void setOperationContraint(String operationContraint) {
        this.operationContraint = operationContraint;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public RefundRemindTimeout getRefundRemindTimeout() {
        return this.refundRemindTimeout;
    }

    public void setRefundRemindTimeout(RefundRemindTimeout refundRemindTimeout) {
        this.refundRemindTimeout = refundRemindTimeout;
    }

    public Long getRefundVersion() {
        return this.refundVersion;
    }

    public void setRefundVersion(Long refundVersion) {
        this.refundVersion = refundVersion;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getShippingType() {
        return this.shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSku() {
        return this.sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSplitSellerFee() {
        return this.splitSellerFee;
    }

    public void setSplitSellerFee(String splitSellerFee) {
        this.splitSellerFee = splitSellerFee;
    }

    public String getSplitTaobaoFee() {
        return this.splitTaobaoFee;
    }

    public void setSplitTaobaoFee(String splitTaobaoFee) {
        this.splitTaobaoFee = splitTaobaoFee;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }
}


