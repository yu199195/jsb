package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class BuyerRefund
        extends TaobaoObject {
    private static final long serialVersionUID = 3138371399354157175L;
    @ApiField("biz_order_id")
    private Long bizOrderId;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("goods_status_desc")
    private String goodsStatusDesc;
    @ApiField("modified")
    private Date modified;
    @ApiField("need_return_goods")
    private Boolean needReturnGoods;
    @ApiField("refund_create_time")
    private Date refundCreateTime;
    @ApiField("refund_desc")
    private String refundDesc;
    @ApiField("refund_id")
    private Long refundId;
    @ApiField("refund_reason")
    private String refundReason;
    @ApiField("refund_status")
    private Long refundStatus;
    @ApiField("return_fee")
    private Long returnFee;
    @ApiField("sub_order_id")
    private Long subOrderId;
    @ApiField("to_seller_fee")
    private Long toSellerFee;

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getGoodsStatusDesc() {
        return this.goodsStatusDesc;
    }

    public void setGoodsStatusDesc(String goodsStatusDesc) {
        this.goodsStatusDesc = goodsStatusDesc;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Boolean getNeedReturnGoods() {
        return this.needReturnGoods;
    }

    public void setNeedReturnGoods(Boolean needReturnGoods) {
        this.needReturnGoods = needReturnGoods;
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

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
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

    public Long getReturnFee() {
        return this.returnFee;
    }

    public void setReturnFee(Long returnFee) {
        this.returnFee = returnFee;
    }

    public Long getSubOrderId() {
        return this.subOrderId;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Long getToSellerFee() {
        return this.toSellerFee;
    }

    public void setToSellerFee(Long toSellerFee) {
        this.toSellerFee = toSellerFee;
    }
}


