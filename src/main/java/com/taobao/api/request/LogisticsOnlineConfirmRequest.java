package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOnlineConfirmResponse;

import java.util.Map;

public class LogisticsOnlineConfirmRequest
        extends BaseTaobaoRequest<LogisticsOnlineConfirmResponse> {
    private Long isSplit;
    private String outSid;
    private String sellerIp;
    private String subTid;
    private Long tid;

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
        return "taobao.logistics.online.confirm";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_split", this.isSplit);
        txtParams.put("out_sid", this.outSid);
        txtParams.put("seller_ip", this.sellerIp);
        txtParams.put("sub_tid", this.subTid);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsOnlineConfirmResponse> getResponseClass() {
        return LogisticsOnlineConfirmResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.outSid, "outSid");
        RequestCheckUtils.checkMaxListSize(this.subTid, 20, "subTid");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


