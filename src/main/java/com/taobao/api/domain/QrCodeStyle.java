package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class QrCodeStyle
        extends TaobaoObject {
    private static final long serialVersionUID = 5281988299695863124L;
    @ApiField("bg_color")
    private Long bgColor;
    @ApiField("color")
    private Long color;
    @ApiField("level")
    private Long level;
    @ApiField("logo")
    private String logo;
    @ApiField("margin")
    private Long margin;
    @ApiField("size")
    private Long size;

    public Long getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(Long bgColor) {
        this.bgColor = bgColor;
    }

    public Long getColor() {
        return this.color;
    }

    public void setColor(Long color) {
        this.color = color;
    }

    public Long getLevel() {
        return this.level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getMargin() {
        return this.margin;
    }

    public void setMargin(Long margin) {
        this.margin = margin;
    }

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}


