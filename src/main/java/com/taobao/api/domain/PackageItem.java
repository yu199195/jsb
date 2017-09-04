package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PackageItem
        extends TaobaoObject {
    private static final long serialVersionUID = 4675837532676126644L;
    @ApiField("count")
    private Long count;
    @ApiField("item_name")
    private String itemName;

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}


