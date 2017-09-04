package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcMessageProduceResponse;

import java.util.HashMap;
import java.util.Map;

public class TmcMessageProduceRequest
        extends BaseTaobaoRequest<TmcMessageProduceResponse>
        implements TaobaoUploadRequest<TmcMessageProduceResponse> {
    private String content;
    private String exContent;
    private FileItem mediaContent;
    private FileItem mediaContent2;
    private FileItem mediaContent3;
    private FileItem mediaContent4;
    private FileItem mediaContent5;
    private String targetAppkey;
    private String topic;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setExContent(String exContent) {
        this.exContent = exContent;
    }

    public String getExContent() {
        return this.exContent;
    }

    public void setMediaContent(FileItem mediaContent) {
        this.mediaContent = mediaContent;
    }

    public FileItem getMediaContent() {
        return this.mediaContent;
    }

    public void setMediaContent2(FileItem mediaContent2) {
        this.mediaContent2 = mediaContent2;
    }

    public FileItem getMediaContent2() {
        return this.mediaContent2;
    }

    public void setMediaContent3(FileItem mediaContent3) {
        this.mediaContent3 = mediaContent3;
    }

    public FileItem getMediaContent3() {
        return this.mediaContent3;
    }

    public void setMediaContent4(FileItem mediaContent4) {
        this.mediaContent4 = mediaContent4;
    }

    public FileItem getMediaContent4() {
        return this.mediaContent4;
    }

    public void setMediaContent5(FileItem mediaContent5) {
        this.mediaContent5 = mediaContent5;
    }

    public FileItem getMediaContent5() {
        return this.mediaContent5;
    }

    public void setTargetAppkey(String targetAppkey) {
        this.targetAppkey = targetAppkey;
    }

    public String getTargetAppkey() {
        return this.targetAppkey;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return this.topic;
    }

    public String getApiMethodName() {
        return "taobao.tmc.message.produce";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        txtParams.put("ex_content", this.exContent);
        txtParams.put("target_appkey", this.targetAppkey);
        txtParams.put("topic", this.topic);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<TmcMessageProduceResponse> getResponseClass() {
        return TmcMessageProduceResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.content, "content");
        RequestCheckUtils.checkMaxLength(this.content, 5000, "content");
        RequestCheckUtils.checkMaxLength(this.exContent, 500, "exContent");
        RequestCheckUtils.checkMaxLength(this.targetAppkey, 256, "targetAppkey");
        RequestCheckUtils.checkNotEmpty(this.topic, "topic");
        RequestCheckUtils.checkMaxLength(this.topic, 256, "topic");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("media_content", this.mediaContent);
        params.put("media_content2", this.mediaContent2);
        params.put("media_content3", this.mediaContent3);
        params.put("media_content4", this.mediaContent4);
        params.put("media_content5", this.mediaContent5);
        return params;
    }
}


