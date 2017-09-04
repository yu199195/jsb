package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureIsreferencedGetResponse;

import java.util.Map;

public class PictureIsreferencedGetRequest
        extends BaseTaobaoRequest<PictureIsreferencedGetResponse> {
    private Long pictureId;

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public String getApiMethodName() {
        return "taobao.picture.isreferenced.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_id", this.pictureId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureIsreferencedGetResponse> getResponseClass() {
        return PictureIsreferencedGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.pictureId, "pictureId");
    }
}


