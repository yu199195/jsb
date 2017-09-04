package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class TopSecretGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2855475879815999431L;
    @ApiField("interval")
    private Long interval;
    @ApiField("max_interval")
    private Long maxInterval;
    @ApiField("secret")
    private String secret;
    @ApiField("secret_version")
    private Long secretVersion;

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Long getInterval() {
        return this.interval;
    }

    public void setMaxInterval(Long maxInterval) {
        this.maxInterval = maxInterval;
    }

    public Long getMaxInterval() {
        return this.maxInterval;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecretVersion(Long secretVersion) {
        this.secretVersion = secretVersion;
    }

    public Long getSecretVersion() {
        return this.secretVersion;
    }
}


