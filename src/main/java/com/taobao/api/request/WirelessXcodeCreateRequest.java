package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.QrCodeStyle;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WirelessXcodeCreateResponse;

import java.util.Map;

public class WirelessXcodeCreateRequest
        extends BaseTaobaoRequest<WirelessXcodeCreateResponse> {
    private String bizCode;
    private String content;
    private String style;

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setStyle(QrCodeStyle style) {
        this.style = new JSONWriter(false, true).write(style);
    }

    public String getStyle() {
        return this.style;
    }

    public String getApiMethodName() {
        return "taobao.wireless.xcode.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_code", this.bizCode);
        txtParams.put("content", this.content);
        txtParams.put("style", this.style);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WirelessXcodeCreateResponse> getResponseClass() {
        return WirelessXcodeCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.content, "content");
    }
}


