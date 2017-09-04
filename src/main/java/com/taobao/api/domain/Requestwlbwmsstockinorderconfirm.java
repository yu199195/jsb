package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class Requestwlbwmsstockinorderconfirm
        extends TaobaoObject {
    private static final long serialVersionUID = 7164465436942865878L;
    @ApiField("confirm_type")
    private Long confirmType;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("order_confirm_time")
    private String orderConfirmTime;
    @ApiListField("order_items")
    @ApiField("order_itemswlbwmsstockinorderconfirm")
    private List<OrderItemswlbwmsstockinorderconfirm> orderItems;
    @ApiField("order_type")
    private Long orderType;
    @ApiField("out_biz_code")
    private String outBizCode;
    @ApiField("store_order_code")
    private String storeOrderCode;

    public Long getConfirmType() {
        return this.confirmType;
    }

    public void setConfirmType(Long confirmType) {
        this.confirmType = confirmType;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderConfirmTime() {
        return this.orderConfirmTime;
    }

    public void setOrderConfirmTime(String orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }

    public List<OrderItemswlbwmsstockinorderconfirm> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(List<OrderItemswlbwmsstockinorderconfirm> orderItems) {
        this.orderItems = orderItems;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getOutBizCode() {
        return this.outBizCode;
    }

    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    public String getStoreOrderCode() {
        return this.storeOrderCode;
    }

    public void setStoreOrderCode(String storeOrderCode) {
        this.storeOrderCode = storeOrderCode;
    }
}


