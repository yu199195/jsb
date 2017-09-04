package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaNumberSinglecallbyttsResponse;

import java.util.Map;

public class AlibabaAliqinTaNumberSinglecallbyttsRequest
        extends BaseTaobaoRequest<AlibabaAliqinTaNumberSinglecallbyttsResponse> {
    private String calledNum;
    private String calledShowNum;
    private String params;
    private String ttsCode;

    public void setCalledNum(String calledNum) {
        this.calledNum = calledNum;
    }

    public String getCalledNum() {
        return this.calledNum;
    }

    public void setCalledShowNum(String calledShowNum) {
        this.calledShowNum = calledShowNum;
    }

    public String getCalledShowNum() {
        return this.calledShowNum;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setParamsString(String params) {
        this.params = params;
    }

    public String getParams() {
        return this.params;
    }

    public void setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
    }

    public String getTtsCode() {
        return this.ttsCode;
    }

    public String getApiMethodName() {
        return "alibaba.aliqin.ta.number.singlecallbytts";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("called_num", this.calledNum);
        txtParams.put("called_show_num", this.calledShowNum);
        txtParams.put("params", this.params);
        txtParams.put("tts_code", this.ttsCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AlibabaAliqinTaNumberSinglecallbyttsResponse> getResponseClass() {
        return AlibabaAliqinTaNumberSinglecallbyttsResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.calledNum, "calledNum");
        RequestCheckUtils.checkNotEmpty(this.calledShowNum, "calledShowNum");
        RequestCheckUtils.checkNotEmpty(this.ttsCode, "ttsCode");
    }
}


