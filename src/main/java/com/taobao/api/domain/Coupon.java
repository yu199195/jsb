package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Coupon
        extends TaobaoObject {
    private static final long serialVersionUID = 5229978214847664495L;
    @ApiField("condition")
    private Long condition;
    @ApiField("coupon_id")
    private Long couponId;
    @ApiField("creat_time")
    private Date creatTime;
    @ApiField("create_channel")
    private String createChannel;
    @ApiField("denominations")
    private Long denominations;
    @ApiField("end_time")
    private Date endTime;

    public Long getCondition() {
        return this.condition;
    }

    public void setCondition(Long condition) {
        this.condition = condition;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Date getCreatTime() {
        return this.creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getCreateChannel() {
        return this.createChannel;
    }

    public void setCreateChannel(String createChannel) {
        this.createChannel = createChannel;
    }

    public Long getDenominations() {
        return this.denominations;
    }

    public void setDenominations(Long denominations) {
        this.denominations = denominations;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}


