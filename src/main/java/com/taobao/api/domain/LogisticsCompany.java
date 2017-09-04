package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class LogisticsCompany
        extends TaobaoObject {
    private static final long serialVersionUID = 1861727398893295187L;
    @ApiField("code")
    private String code;
    @ApiField("id")
    private Long id;
    @ApiField("name")
    private String name;
    @ApiField("reg_mail_no")
    private String regMailNo;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegMailNo() {
        return this.regMailNo;
    }

    public void setRegMailNo(String regMailNo) {
        this.regMailNo = regMailNo;
    }
}


