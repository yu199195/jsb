package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUserinfoGetResponse;

import java.util.Map;

public class PictureUserinfoGetRequest
        extends BaseTaobaoRequest<PictureUserinfoGetResponse> {
    public String getApiMethodName() {
        return "taobao.picture.userinfo.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureUserinfoGetResponse> getResponseClass() {
        return PictureUserinfoGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


