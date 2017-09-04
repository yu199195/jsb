package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ServiceOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 8127324514567631859L;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("et_plate_number")
    private String etPlateNumber;
    @ApiField("et_ser_time")
    private String etSerTime;
    @ApiField("et_shop_name")
    private String etShopName;
    @ApiField("et_verified_shop_name")
    private String etVerifiedShopName;
    @ApiField("item_oid")
    private Long itemOid;
    @ApiField("num")
    private Long num;
    @ApiField("oid")
    private Long oid;
    @ApiField("payment")
    private String payment;
    @ApiField("pic_path")
    private String picPath;
    @ApiField("price")
    private String price;
    @ApiField("refund_id")
    private Long refundId;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("service_detail_url")
    private String serviceDetailUrl;
    @ApiField("service_id")
    private Long serviceId;
    @ApiField("title")
    private String title;
    @ApiField("tmser_spu_code")
    private String tmserSpuCode;
    @ApiField("total_fee")
    private String totalFee;

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
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

    public Long getItemOid() {
        return this.itemOid;
    }

    public void setItemOid(Long itemOid) {
        this.itemOid = itemOid;
    }

    public Long getNum() {
        return this.num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
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

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getServiceDetailUrl() {
        return this.serviceDetailUrl;
    }

    public void setServiceDetailUrl(String serviceDetailUrl) {
        this.serviceDetailUrl = serviceDetailUrl;
    }

    public Long getServiceId() {
        return this.serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
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
}


