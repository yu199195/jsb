package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRefundMessageAddResponse;

import java.util.HashMap;
import java.util.Map;

public class FenxiaoRefundMessageAddRequest
        extends BaseTaobaoRequest<FenxiaoRefundMessageAddResponse>
        implements TaobaoUploadRequest<FenxiaoRefundMessageAddResponse> {
    private FileItem image;
    private String messageContent;
    private Long subOrderId;

    public void setImage(FileItem image) {
        this.image = image;
    }

    public FileItem getImage() {
        return this.image;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return this.messageContent;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    public Long getSubOrderId() {
        return this.subOrderId;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.refund.message.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message_content", this.messageContent);
        txtParams.put("sub_order_id", this.subOrderId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<FenxiaoRefundMessageAddResponse> getResponseClass() {
        return FenxiaoRefundMessageAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.messageContent, "messageContent");
        RequestCheckUtils.checkNotEmpty(this.subOrderId, "subOrderId");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("image", this.image);
        return params;
    }
}


