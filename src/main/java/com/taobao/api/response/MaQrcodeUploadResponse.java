package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TopResultCode;
import com.taobao.api.internal.mapping.ApiField;

public class MaQrcodeUploadResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8797234381659347143L;
    @ApiField("img_url")
    private String imgUrl;
    @ApiField("is_success")
    private Boolean isSuccess;
    @ApiField("reult_code")
    private TopResultCode reultCode;

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setReultCode(TopResultCode reultCode) {
        this.reultCode = reultCode;
    }

    public TopResultCode getReultCode() {
        return this.reultCode;
    }
}


