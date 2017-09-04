package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class ArticleBizOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 2552599333311855926L;
    @ApiField("article_code")
    private String articleCode;
    @ApiField("article_item_name")
    private String articleItemName;
    @ApiField("article_name")
    private String articleName;
    @ApiField("biz_order_id")
    private Long bizOrderId;
    @ApiField("biz_type")
    private Long bizType;
    @ApiField("create")
    private Date create;
    @ApiField("fee")
    private String fee;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_name")
    private String itemName;
    @ApiField("nick")
    private String nick;
    @ApiField("order_cycle")
    private String orderCycle;
    @ApiField("order_cycle_end")
    private Date orderCycleEnd;
    @ApiField("order_cycle_start")
    private Date orderCycleStart;
    @ApiField("order_id")
    private Long orderId;
    @ApiField("prom_fee")
    private String promFee;
    @ApiField("refund_fee")
    private String refundFee;
    @ApiField("total_pay_fee")
    private String totalPayFee;

    public String getArticleCode() {
        return this.articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleItemName() {
        return this.articleItemName;
    }

    public void setArticleItemName(String articleItemName) {
        this.articleItemName = articleItemName;
    }

    public String getArticleName() {
        return this.articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Long getBizType() {
        return this.bizType;
    }

    public void setBizType(Long bizType) {
        this.bizType = bizType;
    }

    public Date getCreate() {
        return this.create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public String getFee() {
        return this.fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getOrderCycle() {
        return this.orderCycle;
    }

    public void setOrderCycle(String orderCycle) {
        this.orderCycle = orderCycle;
    }

    public Date getOrderCycleEnd() {
        return this.orderCycleEnd;
    }

    public void setOrderCycleEnd(Date orderCycleEnd) {
        this.orderCycleEnd = orderCycleEnd;
    }

    public Date getOrderCycleStart() {
        return this.orderCycleStart;
    }

    public void setOrderCycleStart(Date orderCycleStart) {
        this.orderCycleStart = orderCycleStart;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPromFee() {
        return this.promFee;
    }

    public void setPromFee(String promFee) {
        this.promFee = promFee;
    }

    public String getRefundFee() {
        return this.refundFee;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public String getTotalPayFee() {
        return this.totalPayFee;
    }

    public void setTotalPayFee(String totalPayFee) {
        this.totalPayFee = totalPayFee;
    }
}


