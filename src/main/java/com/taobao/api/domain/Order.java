package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Order
        extends TaobaoObject {
    private static final long serialVersionUID = 6119292755914679181L;
    @ApiField("adjust_fee")
    private String adjustFee;
    @ApiField("bind_oid")
    private Long bindOid;
    @ApiField("bind_oids")
    private String bindOids;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("buyer_rate")
    private Boolean buyerRate;
    @ApiField("cid")
    private Long cid;
    @ApiField("combo_id")
    private String comboId;
    @ApiField("consign_time")
    private String consignTime;
    @ApiField("customization")
    private String customization;
    @ApiField("discount_fee")
    private String discountFee;
    @ApiField("divide_order_fee")
    private String divideOrderFee;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("estimate_con_time")
    private String estimateConTime;
    @ApiField("et_plate_number")
    private String etPlateNumber;
    @ApiField("et_ser_time")
    private String etSerTime;
    @ApiField("et_shop_name")
    private String etShopName;
    @ApiField("et_verified_shop_name")
    private String etVerifiedShopName;
    @ApiField("f_status")
    private String fStatus;
    @ApiField("f_term")
    private String fTerm;
    @ApiField("f_type")
    private String fType;
    @ApiField("iid")
    private String iid;
    @ApiField("inv_type")
    private String invType;
    @ApiField("invoice_no")
    private String invoiceNo;
    @ApiField("is_daixiao")
    private Boolean isDaixiao;
    @ApiField("is_oversold")
    private Boolean isOversold;
    @ApiField("is_service_order")
    private Boolean isServiceOrder;
    @ApiField("is_sh_ship")
    private Boolean isShShip;
    @ApiField("is_www")
    private Boolean isWww;
    @ApiField("item_meal_id")
    private Long itemMealId;
    @ApiField("item_meal_name")
    private String itemMealName;
    @ApiField("item_memo")
    private String itemMemo;
    @ApiField("logistics_company")
    private String logisticsCompany;
    @ApiField("md_fee")
    private String mdFee;
    @ApiField("md_qualification")
    private String mdQualification;
    @ApiField("modified")
    private Date modified;
    @ApiField("num")
    private Long num;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("o2o_et_order_id")
    private String o2oEtOrderId;
    @ApiField("oid")
    private Long oid;
    @ApiField("order_attr")
    private String orderAttr;
    @ApiField("order_from")
    private String orderFrom;
    @ApiField("outer_iid")
    private String outerIid;
    @ApiField("outer_sku_id")
    private String outerSkuId;
    @ApiField("part_mjz_discount")
    private String partMjzDiscount;
    @ApiField("payment")
    private String payment;
    @ApiField("pic_path")
    private String picPath;
    @ApiField("price")
    private String price;
    @ApiField("refund_id")
    private Long refundId;
    @ApiField("refund_status")
    private String refundStatus;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("seller_rate")
    private Boolean sellerRate;
    @ApiField("seller_type")
    private String sellerType;
    @ApiField("shipper")
    private String shipper;
    @ApiField("shipping_type")
    private String shippingType;
    @ApiField("sku_id")
    private String skuId;
    @ApiField("sku_properties_name")
    private String skuPropertiesName;
    @ApiField("snapshot")
    private String snapshot;
    @ApiField("snapshot_url")
    private String snapshotUrl;
    @ApiField("status")
    private String status;
    @ApiField("store_code")
    private String storeCode;
    @ApiField("sub_order_tax_fee")
    private String subOrderTaxFee;
    @ApiField("sub_order_tax_rate")
    private String subOrderTaxRate;
    @ApiField("ticket_expdate_key")
    private String ticketExpdateKey;
    @ApiField("ticket_outer_id")
    private String ticketOuterId;
    @ApiField("timeout_action_time")
    private Date timeoutActionTime;
    @ApiField("title")
    private String title;
    @ApiField("tmser_spu_code")
    private String tmserSpuCode;
    @ApiField("total_fee")
    private String totalFee;
    @ApiField("type")
    private String type;
    @ApiField("xxx")
    private String xxx;
    @ApiField("zhengji_status")
    private String zhengjiStatus;

    public String getAdjustFee() {
        return this.adjustFee;
    }

    public void setAdjustFee(String adjustFee) {
        this.adjustFee = adjustFee;
    }

    public Long getBindOid() {
        return this.bindOid;
    }

    public void setBindOid(Long bindOid) {
        this.bindOid = bindOid;
    }

    public String getBindOids() {
        return this.bindOids;
    }

    public void setBindOids(String bindOids) {
        this.bindOids = bindOids;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Boolean getBuyerRate() {
        return this.buyerRate;
    }

    public void setBuyerRate(Boolean buyerRate) {
        this.buyerRate = buyerRate;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getComboId() {
        return this.comboId;
    }

    public void setComboId(String comboId) {
        this.comboId = comboId;
    }

    public String getConsignTime() {
        return this.consignTime;
    }

    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    public String getCustomization() {
        return this.customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }

    public String getDiscountFee() {
        return this.discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public String getDivideOrderFee() {
        return this.divideOrderFee;
    }

    public void setDivideOrderFee(String divideOrderFee) {
        this.divideOrderFee = divideOrderFee;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getEstimateConTime() {
        return this.estimateConTime;
    }

    public void setEstimateConTime(String estimateConTime) {
        this.estimateConTime = estimateConTime;
    }

    public String getEtPlateNumber() {
        return this.etPlateNumber;
    }

    public void setEtPlateNumber(String etPlateNumber) {
        this.etPlateNumber = etPlateNumber;
    }

    public String getEtSerTime() {
        return this.etSerTime;
    }

    public void setEtSerTime(String etSerTime) {
        this.etSerTime = etSerTime;
    }

    public String getEtShopName() {
        return this.etShopName;
    }

    public void setEtShopName(String etShopName) {
        this.etShopName = etShopName;
    }

    public String getEtVerifiedShopName() {
        return this.etVerifiedShopName;
    }

    public void setEtVerifiedShopName(String etVerifiedShopName) {
        this.etVerifiedShopName = etVerifiedShopName;
    }

    public String getfStatus() {
        return this.fStatus;
    }

    public void setfStatus(String fStatus) {
        this.fStatus = fStatus;
    }

    public String getfTerm() {
        return this.fTerm;
    }

    public void setfTerm(String fTerm) {
        this.fTerm = fTerm;
    }

    public String getfType() {
        return this.fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public String getIid() {
        return this.iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getInvType() {
        return this.invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Boolean getIsDaixiao() {
        return this.isDaixiao;
    }

    public void setIsDaixiao(Boolean isDaixiao) {
        this.isDaixiao = isDaixiao;
    }

    public Boolean getIsOversold() {
        return this.isOversold;
    }

    public void setIsOversold(Boolean isOversold) {
        this.isOversold = isOversold;
    }

    public Boolean getIsServiceOrder() {
        return this.isServiceOrder;
    }

    public void setIsServiceOrder(Boolean isServiceOrder) {
        this.isServiceOrder = isServiceOrder;
    }

    public Boolean getIsShShip() {
        return this.isShShip;
    }

    public void setIsShShip(Boolean isShShip) {
        this.isShShip = isShShip;
    }

    public Boolean getIsWww() {
        return this.isWww;
    }

    public void setIsWww(Boolean isWww) {
        this.isWww = isWww;
    }

    public Long getItemMealId() {
        return this.itemMealId;
    }

    public void setItemMealId(Long itemMealId) {
        this.itemMealId = itemMealId;
    }

    public String getItemMealName() {
        return this.itemMealName;
    }

    public void setItemMealName(String itemMealName) {
        this.itemMealName = itemMealName;
    }

    public String getItemMemo() {
        return this.itemMemo;
    }

    public void setItemMemo(String itemMemo) {
        this.itemMemo = itemMemo;
    }

    public String getLogisticsCompany() {
        return this.logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getMdFee() {
        return this.mdFee;
    }

    public void setMdFee(String mdFee) {
        this.mdFee = mdFee;
    }

    public String getMdQualification() {
        return this.mdQualification;
    }

    public void setMdQualification(String mdQualification) {
        this.mdQualification = mdQualification;
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

    public String getO2oEtOrderId() {
        return this.o2oEtOrderId;
    }

    public void setO2oEtOrderId(String o2oEtOrderId) {
        this.o2oEtOrderId = o2oEtOrderId;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getOrderAttr() {
        return this.orderAttr;
    }

    public void setOrderAttr(String orderAttr) {
        this.orderAttr = orderAttr;
    }

    public void setOrderAttrString(String orderAttr) {
        this.orderAttr = orderAttr;
    }

    public String getOrderFrom() {
        return this.orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getOuterIid() {
        return this.outerIid;
    }

    public void setOuterIid(String outerIid) {
        this.outerIid = outerIid;
    }

    public String getOuterSkuId() {
        return this.outerSkuId;
    }

    public void setOuterSkuId(String outerSkuId) {
        this.outerSkuId = outerSkuId;
    }

    public String getPartMjzDiscount() {
        return this.partMjzDiscount;
    }

    public void setPartMjzDiscount(String partMjzDiscount) {
        this.partMjzDiscount = partMjzDiscount;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public String getRefundStatus() {
        return this.refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public Boolean getSellerRate() {
        return this.sellerRate;
    }

    public void setSellerRate(Boolean sellerRate) {
        this.sellerRate = sellerRate;
    }

    public String getSellerType() {
        return this.sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getShipper() {
        return this.shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public String getShippingType() {
        return this.shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuPropertiesName() {
        return this.skuPropertiesName;
    }

    public void setSkuPropertiesName(String skuPropertiesName) {
        this.skuPropertiesName = skuPropertiesName;
    }

    public String getSnapshot() {
        return this.snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
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

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getSubOrderTaxFee() {
        return this.subOrderTaxFee;
    }

    public void setSubOrderTaxFee(String subOrderTaxFee) {
        this.subOrderTaxFee = subOrderTaxFee;
    }

    public String getSubOrderTaxRate() {
        return this.subOrderTaxRate;
    }

    public void setSubOrderTaxRate(String subOrderTaxRate) {
        this.subOrderTaxRate = subOrderTaxRate;
    }

    public String getTicketExpdateKey() {
        return this.ticketExpdateKey;
    }

    public void setTicketExpdateKey(String ticketExpdateKey) {
        this.ticketExpdateKey = ticketExpdateKey;
    }

    public String getTicketOuterId() {
        return this.ticketOuterId;
    }

    public void setTicketOuterId(String ticketOuterId) {
        this.ticketOuterId = ticketOuterId;
    }

    public Date getTimeoutActionTime() {
        return this.timeoutActionTime;
    }

    public void setTimeoutActionTime(Date timeoutActionTime) {
        this.timeoutActionTime = timeoutActionTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTmserSpuCode() {
        return this.tmserSpuCode;
    }

    public void setTmserSpuCode(String tmserSpuCode) {
        this.tmserSpuCode = tmserSpuCode;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getXxx() {
        return this.xxx;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    public String getZhengjiStatus() {
        return this.zhengjiStatus;
    }

    public void setZhengjiStatus(String zhengjiStatus) {
        this.zhengjiStatus = zhengjiStatus;
    }
}


