package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CarriageDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 7722368369215177579L;
    @ApiField("add_fee")
    private Long addFee;
    @ApiField("add_weight")
    private Long addWeight;
    @ApiField("damage_payment")
    private String damagePayment;
    @ApiField("got_time")
    private String gotTime;
    @ApiField("initial_fee")
    private Long initialFee;
    @ApiField("initial_weight")
    private Long initialWeight;
    @ApiField("lost_payment")
    private String lostPayment;
    @ApiField("way_day")
    private String wayDay;

    public Long getAddFee() {
        return this.addFee;
    }

    public void setAddFee(Long addFee) {
        this.addFee = addFee;
    }

    public Long getAddWeight() {
        return this.addWeight;
    }

    public void setAddWeight(Long addWeight) {
        this.addWeight = addWeight;
    }

    public String getDamagePayment() {
        return this.damagePayment;
    }

    public void setDamagePayment(String damagePayment) {
        this.damagePayment = damagePayment;
    }

    public String getGotTime() {
        return this.gotTime;
    }

    public void setGotTime(String gotTime) {
        this.gotTime = gotTime;
    }

    public Long getInitialFee() {
        return this.initialFee;
    }

    public void setInitialFee(Long initialFee) {
        this.initialFee = initialFee;
    }

    public Long getInitialWeight() {
        return this.initialWeight;
    }

    public void setInitialWeight(Long initialWeight) {
        this.initialWeight = initialWeight;
    }

    public String getLostPayment() {
        return this.lostPayment;
    }

    public void setLostPayment(String lostPayment) {
        this.lostPayment = lostPayment;
    }

    public String getWayDay() {
        return this.wayDay;
    }

    public void setWayDay(String wayDay) {
        this.wayDay = wayDay;
    }
}


