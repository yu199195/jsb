package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Activity
        extends TaobaoObject {
    private static final long serialVersionUID = 3525223971284131889L;
    @ApiField("activity_id")
    private Long activityId;
    @ApiField("activity_url")
    private String activityUrl;
    @ApiField("applied_count")
    private Long appliedCount;
    @ApiField("coupon_id")
    private Long couponId;
    @ApiField("create_user")
    private String createUser;
    @ApiField("person_limit_count")
    private Long personLimitCount;
    @ApiField("status")
    private String status;
    @ApiField("total_count")
    private Long totalCount;

    public Long getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityUrl() {
        return this.activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public Long getAppliedCount() {
        return this.appliedCount;
    }

    public void setAppliedCount(Long appliedCount) {
        this.appliedCount = appliedCount;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Long getPersonLimitCount() {
        return this.personLimitCount;
    }

    public void setPersonLimitCount(Long personLimitCount) {
        this.personLimitCount = personLimitCount;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}


