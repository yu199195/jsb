package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class PictureGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3161999492395599112L;
    @ApiListField("pictures")
    @ApiField("picture")
    private List<Picture> pictures;
    @ApiField("totalResults")
    private Long totalResults;

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Picture> getPictures() {
        return this.pictures;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


