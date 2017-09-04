package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelImageUploadResponse;

import java.util.HashMap;
import java.util.Map;

public class HotelImageUploadRequest
        extends BaseTaobaoRequest<HotelImageUploadResponse>
        implements TaobaoUploadRequest<HotelImageUploadResponse> {
    private Long hid;
    private FileItem pic;

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    public FileItem getPic() {
        return this.pic;
    }

    public String getApiMethodName() {
        return "taobao.hotel.image.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("hid", this.hid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelImageUploadResponse> getResponseClass() {
        return HotelImageUploadResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.hid, "hid");
        RequestCheckUtils.checkNotEmpty(this.pic, "pic");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("pic", this.pic);
        return params;
    }
}


