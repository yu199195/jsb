package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class FenxiaoImage
        extends TaobaoObject {
    private static final long serialVersionUID = 8545434788714691789L;
    @ApiField("image_id")
    private Long imageId;
    @ApiField("image_position")
    private Long imagePosition;
    @ApiField("image_url")
    private String imageUrl;
    @ApiField("properties")
    private String properties;
    @ApiField("type")
    private String type;

    public Long getImageId() {
        return this.imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getImagePosition() {
        return this.imagePosition;
    }

    public void setImagePosition(Long imagePosition) {
        this.imagePosition = imagePosition;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


