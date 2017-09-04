package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemMateriaValueDO
        extends TaobaoObject {
    private static final long serialVersionUID = 6267898849174543228L;
    @ApiField("name")
    private String name;
    @ApiField("need_content_number")
    private Boolean needContentNumber;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNeedContentNumber() {
        return this.needContentNumber;
    }

    public void setNeedContentNumber(Boolean needContentNumber) {
        this.needContentNumber = needContentNumber;
    }
}


