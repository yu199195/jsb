package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class WlbWmsSkuInfoConfirm
        extends TaobaoObject {
    private static final long serialVersionUID = 3667639781498581762L;
    @ApiField("bar_code")
    private String barCode;
    @ApiField("gross_weight")
    private Long grossWeight;
    @ApiField("height")
    private Long height;
    @ApiField("item_id")
    private String itemId;
    @ApiField("length")
    private Long length;
    @ApiField("net_weight")
    private Long netWeight;
    @ApiField("volume")
    private Long volume;
    @ApiField("width")
    private Long width;

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getGrossWeight() {
        return this.grossWeight;
    }

    public void setGrossWeight(Long grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Long getHeight() {
        return this.height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getLength() {
        return this.length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getNetWeight() {
        return this.netWeight;
    }

    public void setNetWeight(Long netWeight) {
        this.netWeight = netWeight;
    }

    public Long getVolume() {
        return this.volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Long getWidth() {
        return this.width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}


