package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeMemoAddResponse;

import java.util.Map;

public class TradeMemoAddRequest
        extends BaseTaobaoRequest<TradeMemoAddResponse> {
    private Long flag;
    private String memo;
    private Long tid;

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public Long getFlag() {
        return this.flag;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public String getApiMethodName() {
        return "taobao.trade.memo.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("flag", this.flag);
        txtParams.put("memo", this.memo);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TradeMemoAddResponse> getResponseClass() {
        return TradeMemoAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(this.flag, 5L, "flag");
        RequestCheckUtils.checkMinValue(this.flag, 0L, "flag");
        RequestCheckUtils.checkNotEmpty(this.memo, "memo");
        RequestCheckUtils.checkNotEmpty(this.tid, "tid");
    }
}


