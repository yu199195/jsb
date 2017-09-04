package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemJointImgResponse;

import java.util.Map;

public class ItemJointImgRequest
        extends BaseTaobaoRequest<ItemJointImgResponse> {
    private Long id;
    private Boolean isMajor;
    private Long numIid;
    private String picPath;
    private Long position;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setIsMajor(Boolean isMajor) {
        this.isMajor = isMajor;
    }

    public Boolean getIsMajor() {
        return this.isMajor;
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

    public String getApiMethodName() {
        return "taobao.item.joint.img";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_major", this.isMajor);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("position", this.position);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemJointImgResponse> getResponseClass() {
        return ItemJointImgResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 0L, "numIid");
        RequestCheckUtils.checkNotEmpty(this.picPath, "picPath");
    }
}


