package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Shipping
        extends TaobaoObject {
    private static final long serialVersionUID = 7121185263758392213L;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("company_name")
    private String companyName;
    @ApiField("created")
    private Date created;
    @ApiField("delivery_end")
    private Date deliveryEnd;
    @ApiField("delivery_start")
    private Date deliveryStart;
    @ApiField("freight_payer")
    private String freightPayer;
    @ApiField("is_quick_cod_order")
    private Boolean isQuickCodOrder;
    @ApiField("is_spilt")
    private Long isSpilt;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("item_title")
    private String itemTitle;
    @ApiField("location")
    private Location location;
    @ApiField("modified")
    private Date modified;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("out_sid")
    private String outSid;
    @ApiField("receiver_mobile")
    private String receiverMobile;
    @ApiField("receiver_name")
    private String receiverName;
    @ApiField("receiver_phone")
    private String receiverPhone;
    @ApiField("seller_confirm")
    private String sellerConfirm;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("status")
    private String status;
    @ApiListField("sub_tids")
    @ApiField("number")
    private List<Long> subTids;
    @ApiField("tid")
    private Long tid;
    @ApiField("type")
    private String type;

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

    public Date getDeliveryEnd() {
        return this.deliveryEnd;
    }

    public void setDeliveryEnd(Date deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public Date getDeliveryStart() {
        return this.deliveryStart;
    }

    public void setDeliveryStart(Date deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public String getFreightPayer() {
        return this.freightPayer;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public Boolean getIsQuickCodOrder() {
        return this.isQuickCodOrder;
    }

    public void setIsQuickCodOrder(Boolean isQuickCodOrder) {
        this.isQuickCodOrder = isQuickCodOrder;
    }

    public Long getIsSpilt() {
        return this.isSpilt;
    }

    public void setIsSpilt(Long isSpilt) {
        this.isSpilt = isSpilt;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOutSid() {
        return this.outSid;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
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

    public String getSellerConfirm() {
        return this.sellerConfirm;
    }

    public void setSellerConfirm(String sellerConfirm) {
        this.sellerConfirm = sellerConfirm;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Long> getSubTids() {
        return this.subTids;
    }

    public void setSubTids(List<Long> subTids) {
        this.subTids = subTids;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


