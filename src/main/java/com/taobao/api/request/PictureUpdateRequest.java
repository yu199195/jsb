package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureUpdateResponse;

import java.util.Map;

public class PictureUpdateRequest
        extends BaseTaobaoRequest<PictureUpdateResponse> {
    private String newName;
    private Long pictureId;

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getNewName() {
        return this.newName;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public String getApiMethodName() {
        return "taobao.picture.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("new_name", this.newName);
        txtParams.put("picture_id", this.pictureId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureUpdateResponse> getResponseClass() {
        return PictureUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.newName, "newName");
        RequestCheckUtils.checkMaxLength(this.newName, 50, "newName");
        RequestCheckUtils.checkNotEmpty(this.pictureId, "pictureId");
    }
}


