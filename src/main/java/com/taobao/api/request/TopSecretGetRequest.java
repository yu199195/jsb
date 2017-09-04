package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopSecretGetResponse;

import java.util.Map;

public class TopSecretGetRequest
        extends BaseTaobaoRequest<TopSecretGetResponse> {
    private String randomNum;
    private Long secretVersion;

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public String getRandomNum() {
        return this.randomNum;
    }

    public void setSecretVersion(Long secretVersion) {
        this.secretVersion = secretVersion;
    }

    public Long getSecretVersion() {
        return this.secretVersion;
    }

    public String getApiMethodName() {
        return "taobao.top.secret.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("random_num", this.randomNum);
        txtParams.put("secret_version", this.secretVersion);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TopSecretGetResponse> getResponseClass() {
        return TopSecretGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.randomNum, "randomNum");
    }
}


