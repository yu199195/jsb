package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class LocalityLife
        extends TaobaoObject {
    private static final long serialVersionUID = 1135537617461927372L;
    @ApiField("choose_logis")
    private String chooseLogis;
    @ApiField("eticket")
    private String eticket;
    @ApiField("expirydate")
    private String expirydate;
    @ApiField("merchant")
    private String merchant;
    @ApiField("network_id")
    private String networkId;
    @ApiField("obs")
    private String obs;
    @ApiField("onsale_auto_refund_ratio")
    private Long onsaleAutoRefundRatio;
    @ApiField("packageid")
    private String packageid;
    @ApiField("refund_ratio")
    private Long refundRatio;
    @ApiField("refundmafee")
    private String refundmafee;
    @ApiField("verification")
    private String verification;
    @ApiField("version")
    private String version;

    public String getChooseLogis() {
        return this.chooseLogis;
    }

    public void setChooseLogis(String chooseLogis) {
        this.chooseLogis = chooseLogis;
    }

    public String getEticket() {
        return this.eticket;
    }

    public void setEticket(String eticket) {
        this.eticket = eticket;
    }

    public String getExpirydate() {
        return this.expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getMerchant() {
        return this.merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getObs() {
        return this.obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Long getOnsaleAutoRefundRatio() {
        return this.onsaleAutoRefundRatio;
    }

    public void setOnsaleAutoRefundRatio(Long onsaleAutoRefundRatio) {
        this.onsaleAutoRefundRatio = onsaleAutoRefundRatio;
    }

    public String getPackageid() {
        return this.packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid;
    }

    public Long getRefundRatio() {
        return this.refundRatio;
    }

    public void setRefundRatio(Long refundRatio) {
        this.refundRatio = refundRatio;
    }

    public String getRefundmafee() {
        return this.refundmafee;
    }

    public void setRefundmafee(String refundmafee) {
        this.refundmafee = refundmafee;
    }

    public String getVerification() {
        return this.verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}


