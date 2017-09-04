package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class JzTopArgs
        extends TaobaoObject {
    private static final long serialVersionUID = 5629484848821298884L;
    @ApiField("mail_no")
    private String mailNo;
    @ApiField("package_number")
    private String packageNumber;
    @ApiField("package_remark")
    private String packageRemark;
    @ApiField("package_volume")
    private String packageVolume;
    @ApiField("package_weight")
    private String packageWeight;
    @ApiField("zy_company")
    private String zyCompany;
    @ApiField("zy_consign_time")
    private String zyConsignTime;
    @ApiField("zy_phone_number")
    private String zyPhoneNumber;

    public String getMailNo() {
        return this.mailNo;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getPackageNumber() {
        return this.packageNumber;
    }

    public void setPackageNumber(String packageNumber) {
        this.packageNumber = packageNumber;
    }

    public String getPackageRemark() {
        return this.packageRemark;
    }

    public void setPackageRemark(String packageRemark) {
        this.packageRemark = packageRemark;
    }

    public String getPackageVolume() {
        return this.packageVolume;
    }

    public void setPackageVolume(String packageVolume) {
        this.packageVolume = packageVolume;
    }

    public String getPackageWeight() {
        return this.packageWeight;
    }

    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getZyCompany() {
        return this.zyCompany;
    }

    public void setZyCompany(String zyCompany) {
        this.zyCompany = zyCompany;
    }

    public String getZyConsignTime() {
        return this.zyConsignTime;
    }

    public void setZyConsignTime(String zyConsignTime) {
        this.zyConsignTime = zyConsignTime;
    }

    public String getZyPhoneNumber() {
        return this.zyPhoneNumber;
    }

    public void setZyPhoneNumber(String zyPhoneNumber) {
        this.zyPhoneNumber = zyPhoneNumber;
    }
}


