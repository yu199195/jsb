package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSpecPicUploadResponse;

import java.util.HashMap;
import java.util.Map;

public class TmallProductSpecPicUploadRequest
        extends BaseTaobaoRequest<TmallProductSpecPicUploadResponse>
        implements TaobaoUploadRequest<TmallProductSpecPicUploadResponse> {
    private FileItem certifyPic;
    private Long certifyType;

    public void setCertifyPic(FileItem certifyPic) {
        this.certifyPic = certifyPic;
    }

    public FileItem getCertifyPic() {
        return this.certifyPic;
    }

    public void setCertifyType(Long certifyType) {
        this.certifyType = certifyType;
    }

    public Long getCertifyType() {
        return this.certifyType;
    }

    public String getApiMethodName() {
        return "tmall.product.spec.pic.upload";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("certify_type", this.certifyType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmallProductSpecPicUploadResponse> getResponseClass() {
        return TmallProductSpecPicUploadResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.certifyPic, "certifyPic");
        RequestCheckUtils.checkNotEmpty(this.certifyType, "certifyType");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("certify_pic", this.certifyPic);
        return params;
    }
}


