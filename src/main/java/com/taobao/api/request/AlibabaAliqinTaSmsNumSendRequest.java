package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAliqinTaSmsNumSendResponse;

import java.util.Map;

public class AlibabaAliqinTaSmsNumSendRequest
        extends BaseTaobaoRequest<AlibabaAliqinTaSmsNumSendResponse> {
    private String extend;
    private String extendCode;
    private String extendName;
    private String recNum;
    private String smsFreeSignName;
    private String smsParam;
    private String smsTemplateCode;
    private String smsType;

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtendCode(String extendCode) {
        this.extendCode = extendCode;
    }

    public String getExtendCode() {
        return this.extendCode;
    }

    public void setExtendName(String extendName) {
        this.extendName = extendName;
    }

    public String getExtendName() {
        return this.extendName;
    }

    public void setRecNum(String recNum) {
        this.recNum = recNum;
    }

    public String getRecNum() {
        return this.recNum;
    }

    public void setSmsFreeSignName(String smsFreeSignName) {
        this.smsFreeSignName = smsFreeSignName;
    }

    public String getSmsFreeSignName() {
        return this.smsFreeSignName;
    }

    public void setSmsParam(String smsParam) {
        this.smsParam = smsParam;
    }

    public void setSmsParamString(String smsParam) {
        this.smsParam = smsParam;
    }

    public String getSmsParam() {
        return this.smsParam;
    }

    public void setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
    }

    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    public String getSmsType() {
        return this.smsType;
    }

    public String getApiMethodName() {
        return "alibaba.aliqin.ta.sms.num.send";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("extend", this.extend);
        txtParams.put("extend_code", this.extendCode);
        txtParams.put("extend_name", this.extendName);
        txtParams.put("rec_num", this.recNum);
        txtParams.put("sms_free_sign_name", this.smsFreeSignName);
        txtParams.put("sms_param", this.smsParam);
        txtParams.put("sms_template_code", this.smsTemplateCode);
        txtParams.put("sms_type", this.smsType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<AlibabaAliqinTaSmsNumSendResponse> getResponseClass() {
        return AlibabaAliqinTaSmsNumSendResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.recNum, "recNum");
        RequestCheckUtils.checkNotEmpty(this.smsFreeSignName, "smsFreeSignName");
        RequestCheckUtils.checkNotEmpty(this.smsTemplateCode, "smsTemplateCode");
        RequestCheckUtils.checkNotEmpty(this.smsType, "smsType");
    }
}


