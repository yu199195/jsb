package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class QrcodeDO
        extends TaobaoObject {
    private static final long serialVersionUID = 1212152597647922384L;
    @ApiField("channel_id")
    private Long channelId;
    @ApiField("channel_name")
    private String channelName;
    @ApiField("eps_url")
    private String epsUrl;
    @ApiField("qrcode_id")
    private Long qrcodeId;
    @ApiField("qrcode_url")
    private String qrcodeUrl;
    @ApiField("short_url")
    private String shortUrl;
    @ApiField("url")
    private String url;

    public Long getChannelId() {
        return this.channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getEpsUrl() {
        return this.epsUrl;
    }

    public void setEpsUrl(String epsUrl) {
        this.epsUrl = epsUrl;
    }

    public Long getQrcodeId() {
        return this.qrcodeId;
    }

    public void setQrcodeId(Long qrcodeId) {
        this.qrcodeId = qrcodeId;
    }

    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getShortUrl() {
        return this.shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


