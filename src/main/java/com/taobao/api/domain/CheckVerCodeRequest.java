package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class CheckVerCodeRequest
        extends TaobaoObject {
    private static final long serialVersionUID = 6639927741456275334L;
    @ApiField("app_key")
    private String appKey;
    @ApiField("biz_type")
    private Long bizType;
    @ApiField("check_fail_limit")
    private Long checkFailLimit;
    @ApiField("check_success_limit")
    private Long checkSuccessLimit;
    @ApiField("domain")
    private String domain;
    @ApiField("mobile")
    private String mobile;
    @ApiField("user_id")
    private Long userId;
    @ApiField("ver_code")
    private String verCode;

    public String getAppKey() {
        return this.appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public Long getBizType() {
        return this.bizType;
    }

    public void setBizType(Long bizType) {
        this.bizType = bizType;
    }

    public Long getCheckFailLimit() {
        return this.checkFailLimit;
    }

    public void setCheckFailLimit(Long checkFailLimit) {
        this.checkFailLimit = checkFailLimit;
    }

    public Long getCheckSuccessLimit() {
        return this.checkSuccessLimit;
    }

    public void setCheckSuccessLimit(Long checkSuccessLimit) {
        this.checkSuccessLimit = checkSuccessLimit;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVerCode() {
        return this.verCode;
    }

    public void setVerCode(String verCode) {
        this.verCode = verCode;
    }
}


