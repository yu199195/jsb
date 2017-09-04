package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class PurchaseOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 6133791555379312415L;
    @ApiField("alipay_no")
    private String alipayNo;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("buyer_payment")
    private String buyerPayment;
    @ApiField("buyer_taobao_id")
    private String buyerTaobaoId;
    @ApiField("consign_time")
    private Date consignTime;
    @ApiField("created")
    private Date created;
    @ApiField("distributor_from")
    private String distributorFrom;
    @ApiField("distributor_payment")
    private String distributorPayment;
    @ApiField("distributor_username")
    private String distributorUsername;
    @ApiField("end_time")
    private Date endTime;
    @ApiListField("features")
    @ApiField("feature")
    private List<Feature> features;
    @ApiField("fenxiao_id")
    private Long fenxiaoId;
    @ApiField("id")
    private Long id;
    @ApiListField("isv_custom_key")
    @ApiField("string")
    private List<String> isvCustomKey;
    @ApiListField("isv_custom_value")
    @ApiField("string")
    private List<String> isvCustomValue;
    @ApiField("logistics_company_name")
    private String logisticsCompanyName;
    @ApiField("logistics_id")
    private String logisticsId;
    @ApiField("memo")
    private String memo;
    @ApiField("modified")
    private Date modified;
    @ApiListField("order_messages")
    @ApiField("order_message")
    private List<OrderMessage> orderMessages;
    @ApiField("pay_time")
    private Date payTime;
    @ApiField("pay_type")
    private String payType;
    @ApiField("post_fee")
    private String postFee;
    @ApiField("receiver")
    private Receiver receiver;
    @ApiField("shipping")
    private String shipping;
    @ApiField("snapshot_url")
    private String snapshotUrl;
    @ApiField("status")
    private String status;
    @ApiListField("sub_purchase_orders")
    @ApiField("sub_purchase_order")
    private List<SubPurchaseOrder> subPurchaseOrders;
    @ApiField("supplier_flag")
    private Long supplierFlag;
    @ApiField("supplier_from")
    private String supplierFrom;
    @ApiField("supplier_memo")
    private String supplierMemo;
    @ApiField("supplier_username")
    private String supplierUsername;
    @ApiField("tc_order_id")
    private Long tcOrderId;
    @ApiField("total_fee")
    private String totalFee;
    @ApiField("trade_type")
    private String tradeType;
    @ApiField("type")
    private String type;

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerPayment() {
        return this.buyerPayment;
    }

    public void setBuyerPayment(String buyerPayment) {
        this.buyerPayment = buyerPayment;
    }

    public String getBuyerTaobaoId() {
        return this.buyerTaobaoId;
    }

    public void setBuyerTaobaoId(String buyerTaobaoId) {
        this.buyerTaobaoId = buyerTaobaoId;
    }

    public Date getConsignTime() {
        return this.consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDistributorFrom() {
        return this.distributorFrom;
    }

    public void setDistributorFrom(String distributorFrom) {
        this.distributorFrom = distributorFrom;
    }

    public String getDistributorPayment() {
        return this.distributorPayment;
    }

    public void setDistributorPayment(String distributorPayment) {
        this.distributorPayment = distributorPayment;
    }

    public String getDistributorUsername() {
        return this.distributorUsername;
    }

    public void setDistributorUsername(String distributorUsername) {
        this.distributorUsername = distributorUsername;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Long getFenxiaoId() {
        return this.fenxiaoId;
    }

    public void setFenxiaoId(Long fenxiaoId) {
        this.fenxiaoId = fenxiaoId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getIsvCustomKey() {
        return this.isvCustomKey;
    }

    public void setIsvCustomKey(List<String> isvCustomKey) {
        this.isvCustomKey = isvCustomKey;
    }

    public List<String> getIsvCustomValue() {
        return this.isvCustomValue;
    }

    public void setIsvCustomValue(List<String> isvCustomValue) {
        this.isvCustomValue = isvCustomValue;
    }

    public String getLogisticsCompanyName() {
        return this.logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName;
    }

    public String getLogisticsId() {
        return this.logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public List<OrderMessage> getOrderMessages() {
        return this.orderMessages;
    }

    public void setOrderMessages(List<OrderMessage> orderMessages) {
        this.orderMessages = orderMessages;
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

    public String getPostFee() {
        return this.postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public Receiver getReceiver() {
        return this.receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public String getShipping() {
        return this.shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SubPurchaseOrder> getSubPurchaseOrders() {
        return this.subPurchaseOrders;
    }

    public void setSubPurchaseOrders(List<SubPurchaseOrder> subPurchaseOrders) {
        this.subPurchaseOrders = subPurchaseOrders;
    }

    public Long getSupplierFlag() {
        return this.supplierFlag;
    }

    public void setSupplierFlag(Long supplierFlag) {
        this.supplierFlag = supplierFlag;
    }

    public String getSupplierFrom() {
        return this.supplierFrom;
    }

    public void setSupplierFrom(String supplierFrom) {
        this.supplierFrom = supplierFrom;
    }

    public String getSupplierMemo() {
        return this.supplierMemo;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo;
    }

    public String getSupplierUsername() {
        return this.supplierUsername;
    }

    public void setSupplierUsername(String supplierUsername) {
        this.supplierUsername = supplierUsername;
    }

    public Long getTcOrderId() {
        return this.tcOrderId;
    }

    public void setTcOrderId(Long tcOrderId) {
        this.tcOrderId = tcOrderId;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


