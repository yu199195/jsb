package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OpenSmsSendvercodeResponse;

import java.util.Map;

public class OpenSmsSendvercodeRequest
        extends BaseTaobaoRequest<OpenSmsSendvercodeResponse> {
    private String sendVerCodeRequest;

    public void setSendVerCodeRequest(String sendVerCodeRequest) {
        this.sendVerCodeRequest = sendVerCodeRequest;
    }

    public void setSendVerCodeRequest(SendVerCodeRequest sendVerCodeRequest) {
        this.sendVerCodeRequest = new JSONWriter(false, true).write(sendVerCodeRequest);
    }

    public String getSendVerCodeRequest() {
        return this.sendVerCodeRequest;
    }

    public String getApiMethodName() {
        return "taobao.open.sms.sendvercode";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("send_ver_code_request", this.sendVerCodeRequest);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<OpenSmsSendvercodeResponse> getResponseClass() {
        return OpenSmsSendvercodeResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }

    public static class SendVerCodeRequest
            extends TaobaoObject {
        private static final long serialVersionUID = 3518382189862774617L;

        @ApiField("context")
        private String context;

        @ApiField("device_id")
        private String deviceId;

        @ApiField("device_limit")
        private Long deviceLimit;

        @ApiField("device_limit_in_time")
        private Long deviceLimitInTime;

        @ApiField("domain")
        private String domain;

        @ApiField("expire_time")
        private Long expireTime;

        @ApiField("external_id")
        private String externalId;

        @ApiField("mobile")
        private String mobile;

        @ApiField("mobile_limit")
        private Long mobileLimit;

        @ApiField("mobile_limit_in_time")
        private Long mobileLimitInTime;

        @ApiField("session_id")
        private String sessionId;

        @ApiField("session_limit")
        private Long sessionLimit;

        @ApiField("session_limit_in_time")
        private Long sessionLimitInTime;

        @ApiField("signature")
        private String signature;

        @ApiField("signature_id")
        private Long signatureId;

        @ApiField("template_id")
        private Long templateId;

        @ApiField("ver_code_length")
        private Long verCodeLength;

        public String getContext() {
            return this.context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public void setContextString(String context) {
            this.context = context;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public Long getDeviceLimit() {
            return this.deviceLimit;
        }

        public void setDeviceLimit(Long deviceLimit) {
            this.deviceLimit = deviceLimit;
        }

        public Long getDeviceLimitInTime() {
            return this.deviceLimitInTime;
        }

        public void setDeviceLimitInTime(Long deviceLimitInTime) {
            this.deviceLimitInTime = deviceLimitInTime;
        }

        public String getDomain() {
            return this.domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public Long getExpireTime() {
            return this.expireTime;
        }

        public void setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
        }

        public String getExternalId() {
            return this.externalId;
        }

        public void setExternalId(String externalId) {
            this.externalId = externalId;
        }

        public String getMobile() {
            return this.mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public Long getMobileLimit() {
            return this.mobileLimit;
        }

        public void setMobileLimit(Long mobileLimit) {
            this.mobileLimit = mobileLimit;
        }

        public Long getMobileLimitInTime() {
            return this.mobileLimitInTime;
        }

        public void setMobileLimitInTime(Long mobileLimitInTime) {
            this.mobileLimitInTime = mobileLimitInTime;
        }

        public String getSessionId() {
            return this.sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public Long getSessionLimit() {
            return this.sessionLimit;
        }

        public void setSessionLimit(Long sessionLimit) {
            this.sessionLimit = sessionLimit;
        }

        public Long getSessionLimitInTime() {
            return this.sessionLimitInTime;
        }

        public void setSessionLimitInTime(Long sessionLimitInTime) {
            this.sessionLimitInTime = sessionLimitInTime;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public Long getSignatureId() {
            return this.signatureId;
        }

        public void setSignatureId(Long signatureId) {
            this.signatureId = signatureId;
        }

        public Long getTemplateId() {
            return this.templateId;
        }

        public void setTemplateId(Long templateId) {
            this.templateId = templateId;
        }

        public Long getVerCodeLength() {
            return this.verCodeLength;
        }

        public void setVerCodeLength(Long verCodeLength) {
            this.verCodeLength = verCodeLength;
        }
    }
}


