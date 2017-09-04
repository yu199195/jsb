package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundMessageAddResponse;

import java.util.HashMap;
import java.util.Map;

public class RefundMessageAddRequest
        extends BaseTaobaoRequest<RefundMessageAddResponse>
        implements TaobaoUploadRequest<RefundMessageAddResponse> {
    private String content;
    private FileItem image;
    private Long refundId;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public String getApiMethodName() {
        return "taobao.refund.message.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        txtParams.put("refund_id", this.refundId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<RefundMessageAddResponse> getResponseClass() {
        return RefundMessageAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.content, "content");
        RequestCheckUtils.checkNotEmpty(this.image, "image");
        RequestCheckUtils.checkNotEmpty(this.refundId, "refundId");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


