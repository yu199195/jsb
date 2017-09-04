package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemTaoSirElDO
        extends TaobaoObject {
    private static final long serialVersionUID = 5461279641673876556L;
    @ApiField("is_input")
    private Boolean isInput;
    @ApiField("is_label")
    private Boolean isLabel;
    @ApiField("is_show_label")
    private Boolean isShowLabel;
    @ApiField("text")
    private String text;
    @ApiField("type")
    private Long type;

    public Boolean getIsInput() {
        return this.isInput;
    }

    public void setIsInput(Boolean isInput) {
        this.isInput = isInput;
    }

    public Boolean getIsLabel() {
        return this.isLabel;
    }

    public void setIsLabel(Boolean isLabel) {
        this.isLabel = isLabel;
    }

    public Boolean getIsShowLabel() {
        return this.isShowLabel;
    }

    public void setIsShowLabel(Boolean isShowLabel) {
        this.isShowLabel = isShowLabel;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}


