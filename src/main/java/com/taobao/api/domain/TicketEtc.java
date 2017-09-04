package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TicketEtc
        extends TaobaoObject {
    private static final long serialVersionUID = 2117873592894744768L;
    @ApiField("association_status")
    private Boolean associationStatus;
    @ApiField("auto_refund")
    private Long autoRefund;
    @ApiField("merchant_id")
    private String merchantId;
    @ApiField("merchant_nick")
    private String merchantNick;
    @ApiField("network_id")
    private String networkId;
    @ApiField("overdue_pay")
    private Long overduePay;
    @ApiField("verification_pay")
    private Boolean verificationPay;

    public Boolean getAssociationStatus() {
        return this.associationStatus;
    }

    public void setAssociationStatus(Boolean associationStatus) {
        this.associationStatus = associationStatus;
    }

    public Long getAutoRefund() {
        return this.autoRefund;
    }

    public void setAutoRefund(Long autoRefund) {
        this.autoRefund = autoRefund;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantNick() {
        return this.merchantNick;
    }

    public void setMerchantNick(String merchantNick) {
        this.merchantNick = merchantNick;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public Long getOverduePay() {
        return this.overduePay;
    }

    public void setOverduePay(Long overduePay) {
        this.overduePay = overduePay;
    }

    public Boolean getVerificationPay() {
        return this.verificationPay;
    }

    public void setVerificationPay(Boolean verificationPay) {
        this.verificationPay = verificationPay;
    }
}


