package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemImgDeleteResponse;

import java.util.Map;

public class ItemImgDeleteRequest
        extends BaseTaobaoRequest<ItemImgDeleteResponse> {
    private Long id;
    private Boolean isSixthPic;
    private Long numIid;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setIsSixthPic(Boolean isSixthPic) {
        this.isSixthPic = isSixthPic;
    }

    public Boolean getIsSixthPic() {
        return this.isSixthPic;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getApiMethodName() {
        return "taobao.item.img.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("is_sixth_pic", this.isSixthPic);
        txtParams.put("num_iid", this.numIid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemImgDeleteResponse> getResponseClass() {
        return ItemImgDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.id, "id");
        RequestCheckUtils.checkMinValue(this.id, 1L, "id");
        RequestCheckUtils.checkNotEmpty(this.numIid, "numIid");
        RequestCheckUtils.checkMinValue(this.numIid, 1L, "numIid");
    }
}


