package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemJointPropimgResponse;

import java.util.Map;

public class ItemJointPropimgRequest
        extends BaseTaobaoRequest<ItemJointPropimgResponse> {
    private Long id;
    private Long numIid;
    private String picPath;
    private Long position;
    private String properties;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicPath() {
        return this.picPath;
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
        return "taobao.item.joint.propimg";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("position", this.position);
        txtParams.put("properties", this.properties);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemJointPropimgResponse> getResponseClass() {
        return ItemJointPropimgResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(this.picPath, "picPath");
        RequestCheckUtils.checkNotEmpty(this.properties, "properties");
    }
}


