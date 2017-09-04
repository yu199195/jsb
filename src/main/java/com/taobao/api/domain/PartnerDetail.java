package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PartnerDetail
        extends TaobaoObject {
    private static final long serialVersionUID = 6582168818213288962L;
    @ApiField("account_no")
    private String accountNo;
    @ApiField("company_code")
    private String companyCode;
    @ApiField("company_id")
    private Long companyId;
    @ApiField("company_name")
    private String companyName;
    @ApiField("full_name")
    private String fullName;
    @ApiField("reg_mail_no")
    private String regMailNo;
    @ApiField("wangwang_id")
    private String wangwangId;

    public String getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Long getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRegMailNo() {
        return this.regMailNo;
    }

    public void setRegMailNo(String regMailNo) {
        this.regMailNo = regMailNo;
    }

    public String getWangwangId() {
        return this.wangwangId;
    }

    public void setWangwangId(String wangwangId) {
        this.wangwangId = wangwangId;
    }
}


