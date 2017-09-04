package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class PromotionMjs
        extends TaobaoObject {
    private static final long serialVersionUID = 4455226725452453337L;
    @ApiField("area_ids")
    private String areaIds;
    @ApiField("coupon_time")
    private Date couponTime;
    @ApiField("coupon_value")
    private Long couponValue;
    @ApiField("free_post")
    private Boolean freePost;
    @ApiField("full_money")
    private Long fullMoney;
    @ApiField("gift_name")
    private String giftName;
    @ApiField("gift_url")
    private String giftUrl;
    @ApiField("points")
    private Long points;
    @ApiField("reduce_after")
    private Boolean reduceAfter;
    @ApiField("reduce_money")
    private Long reduceMoney;

    public String getAreaIds() {
        return this.areaIds;
    }

    public void setAreaIds(String areaIds) {
        this.areaIds = areaIds;
    }

    public Date getCouponTime() {
        return this.couponTime;
    }

    public void setCouponTime(Date couponTime) {
        this.couponTime = couponTime;
    }

    public Long getCouponValue() {
        return this.couponValue;
    }

    public void setCouponValue(Long couponValue) {
        this.couponValue = couponValue;
    }

    public Boolean getFreePost() {
        return this.freePost;
    }

    public void setFreePost(Boolean freePost) {
        this.freePost = freePost;
    }

    public Long getFullMoney() {
        return this.fullMoney;
    }

    public void setFullMoney(Long fullMoney) {
        this.fullMoney = fullMoney;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftUrl() {
        return this.giftUrl;
    }

    public void setGiftUrl(String giftUrl) {
        this.giftUrl = giftUrl;
    }

    public Long getPoints() {
        return this.points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Boolean getReduceAfter() {
        return this.reduceAfter;
    }

    public void setReduceAfter(Boolean reduceAfter) {
        this.reduceAfter = reduceAfter;
    }

    public Long getReduceMoney() {
        return this.reduceMoney;
    }

    public void setReduceMoney(Long reduceMoney) {
        this.reduceMoney = reduceMoney;
    }
}


