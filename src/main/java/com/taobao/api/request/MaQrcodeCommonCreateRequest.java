package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MaQrcodeCommonCreateResponse;

import java.util.Map;

public class MaQrcodeCommonCreateRequest
        extends BaseTaobaoRequest<MaQrcodeCommonCreateResponse> {
    private String channelName;
    private String content;
    private String logo;
    private String name;
    private Boolean needEps;
    private Long size;
    private String style;
    private String type;

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNeedEps(Boolean needEps) {
        this.needEps = needEps;
    }

    public Boolean getNeedEps() {
        return this.needEps;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getSize() {
        return this.size;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return this.style;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.ma.qrcode.common.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("channel_name", this.channelName);
        txtParams.put("content", this.content);
        txtParams.put("logo", this.logo);
        txtParams.put("name", this.name);
        txtParams.put("need_eps", this.needEps);
        txtParams.put("size", this.size);
        txtParams.put("style", this.style);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<MaQrcodeCommonCreateResponse> getResponseClass() {
        return MaQrcodeCommonCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.channelName, 160, "channelName");
        RequestCheckUtils.checkNotEmpty(this.content, "content");
        RequestCheckUtils.checkMaxLength(this.content, 256, "content");
        RequestCheckUtils.checkMaxLength(this.logo, 256, "logo");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 32, "name");
        RequestCheckUtils.checkNotEmpty(this.size, "size");
        RequestCheckUtils.checkMaxValue(this.size, 300L, "size");
        RequestCheckUtils.checkMinValue(this.size, 60L, "size");
        RequestCheckUtils.checkNotEmpty(this.style, "style");
        RequestCheckUtils.checkMaxLength(this.style, 50, "style");
        RequestCheckUtils.checkNotEmpty(this.type, "type");
        RequestCheckUtils.checkMaxLength(this.type, 10, "type");
    }
}


