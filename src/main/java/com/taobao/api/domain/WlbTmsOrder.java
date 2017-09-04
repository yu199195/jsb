package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbTmsOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 2624429141196851786L;
    @ApiField("code")
    private String code;
    @ApiField("company_code")
    private String companyCode;
    @ApiField("order_code")
    private String orderCode;
    @ApiField("user_id")
    private Long userId;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}


