package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaNumberSinglecallbyvoiceResponse;

import java.util.Map;

public class AlibabaAliqinTaNumberSinglecallbyvoiceRequest
        extends BaseTaobaoRequest<AlibabaAliqinTaNumberSinglecallbyvoiceResponse> {
    private String calledNum;
    private String calledShowNum;
    private String params;
    private String voiceCode;

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

    public void setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
    }

    public String getVoiceCode() {
        return this.voiceCode;
    }

    public String getApiMethodName() {
        return "alibaba.aliqin.ta.number.singlecallbyvoice";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("called_num", this.calledNum);
        txtParams.put("called_show_num", this.calledShowNum);
        txtParams.put("params", this.params);
        txtParams.put("voice_code", this.voiceCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AlibabaAliqinTaNumberSinglecallbyvoiceResponse> getResponseClass() {
        return AlibabaAliqinTaNumberSinglecallbyvoiceResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.calledNum, "calledNum");
        RequestCheckUtils.checkNotEmpty(this.calledShowNum, "calledShowNum");
        RequestCheckUtils.checkNotEmpty(this.voiceCode, "voiceCode");
    }
}


