package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOnlineSendResponse;

import java.util.Map;

public class LogisticsOnlineSendRequest
        extends BaseTaobaoRequest<LogisticsOnlineSendResponse> {
    private Long cancelId;
    private String companyCode;
    private String feature;
    private Long isSplit;
    private String outSid;
    private String sellerIp;
    private Long senderId;
    private String subTid;
    private Long tid;

    public void setCancelId(Long cancelId) {
        this.cancelId = cancelId;
    }

    public Long getCancelId() {
        return this.cancelId;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setIsSplit(Long isSplit) {
        this.isSplit = isSplit;
    }

    public Long getIsSplit() {
        return this.isSplit;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public String getOutSid() {
        return this.outSid;
    }

    public void setSellerIp(String sellerIp) {
        this.sellerIp = sellerIp;
    }

    public String getSellerIp() {
        return this.sellerIp;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getSenderId() {
        return this.senderId;
    }

    public void setSubTid(String subTid) {
        this.subTid = subTid;
    }

    public String getSubTid() {
        return this.subTid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.logistics.online.send";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cancel_id", this.cancelId);
        txtParams.put("company_code", this.companyCode);
        txtParams.put("feature", this.feature);
        txtParams.put("is_split", this.isSplit);
        txtParams.put("out_sid", this.outSid);
        txtParams.put("seller_ip", this.sellerIp);
        txtParams.put("sender_id", this.senderId);
        txtParams.put("sub_tid", this.subTid);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsOnlineSendResponse> getResponseClass() {
        return LogisticsOnlineSendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.companyCode, "companyCode");
        RequestCheckUtils.checkMaxListSize(this.subTid, 20, "subTid");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


