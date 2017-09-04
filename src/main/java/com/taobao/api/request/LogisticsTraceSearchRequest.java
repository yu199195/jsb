package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsTraceSearchResponse;

import java.util.Map;

public class LogisticsTraceSearchRequest
        extends BaseTaobaoRequest<LogisticsTraceSearchResponse> {
    private Long isSplit;
    private String sellerNick;
    private String subTid;
    private Long tid;

    public void setIsSplit(Long isSplit) {
        this.isSplit = isSplit;
    }

    public Long getIsSplit() {
        return this.isSplit;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getSellerNick() {
        return this.sellerNick;
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
        return "taobao.logistics.trace.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_split", this.isSplit);
        txtParams.put("seller_nick", this.sellerNick);
        txtParams.put("sub_tid", this.subTid);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsTraceSearchResponse> getResponseClass() {
        return LogisticsTraceSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.sellerNick, "sellerNick");
        RequestCheckUtils.checkMaxListSize(this.subTid, 50, "subTid");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


