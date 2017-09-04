package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class IdsModule
        extends TaobaoObject {
    private static final long serialVersionUID = 5511369644735596891L;
    @ApiField("id")
    private Long id;
    @ApiField("name")
    private String name;
    @ApiField("type")
    private Long type;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}


