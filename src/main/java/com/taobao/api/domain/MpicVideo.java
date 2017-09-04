package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class MpicVideo
        extends TaobaoObject {
    private static final long serialVersionUID = 6443171368223911135L;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("video_duaration")
    private Long videoDuaration;
    @ApiField("video_id")
    private Long videoId;
    @ApiField("video_pic")
    private String videoPic;
    @ApiField("video_status")
    private Long videoStatus;

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getVideoDuaration() {
        return this.videoDuaration;
    }

    public void setVideoDuaration(Long videoDuaration) {
        this.videoDuaration = videoDuaration;
    }

    public Long getVideoId() {
        return this.videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoPic() {
        return this.videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic;
    }

    public Long getVideoStatus() {
        return this.videoStatus;
    }

    public void setVideoStatus(Long videoStatus) {
        this.videoStatus = videoStatus;
    }
}


