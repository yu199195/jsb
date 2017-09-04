package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemPropimgUploadResponse;

import java.util.HashMap;
import java.util.Map;

public class ItemPropimgUploadRequest
        extends BaseTaobaoRequest<ItemPropimgUploadResponse>
        implements TaobaoUploadRequest<ItemPropimgUploadResponse> {
    private Long id;
    private FileItem image;
    private Long numIid;
    private Long position;
    private String properties;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public String getApiMethodName() {
        return "taobao.item.propimg.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("position", this.position);
        txtParams.put("properties", this.properties);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemPropimgUploadResponse> getResponseClass() {
        return ItemPropimgUploadResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(this.properties, "properties");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


