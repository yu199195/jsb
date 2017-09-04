package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PictureReplaceResponse;

import java.util.HashMap;
import java.util.Map;

public class PictureReplaceRequest
        extends BaseTaobaoRequest<PictureReplaceResponse>
        implements TaobaoUploadRequest<PictureReplaceResponse> {
    private FileItem imageData;
    private Long pictureId;

    public void setImageData(FileItem imageData) {
        this.imageData = imageData;
    }

    public FileItem getImageData() {
        return this.imageData;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public String getApiMethodName() {
        return "taobao.picture.replace";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("picture_id", this.pictureId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PictureReplaceResponse> getResponseClass() {
        return PictureReplaceResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.imageData, "imageData");
        RequestCheckUtils.checkNotEmpty(this.pictureId, "pictureId");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image_data", this.imageData);
        return params;
    }
}


