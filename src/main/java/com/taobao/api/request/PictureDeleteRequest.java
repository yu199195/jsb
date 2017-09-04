package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureDeleteResponse;

import java.util.Map;

public class PictureDeleteRequest
        extends BaseTaobaoRequest<PictureDeleteResponse> {
    private String pictureIds;

    public void setPictureIds(String pictureIds) {
        this.pictureIds = pictureIds;
    }

    public String getPictureIds() {
        return this.pictureIds;
    }

    public String getApiMethodName() {
        return "taobao.picture.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_ids", this.pictureIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureDeleteResponse> getResponseClass() {
        return PictureDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.pictureIds, "pictureIds");
        RequestCheckUtils.checkMaxListSize(this.pictureIds, 100, "pictureIds");
    }
}


