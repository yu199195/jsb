package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class ItemcatsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 7258794144435742585L;
    @ApiListField("item_cats")
    @ApiField("item_cat")
    private List<ItemCat> itemCats;
    @ApiField("last_modified")
    private Date lastModified;

    public void setItemCats(List<ItemCat> itemCats) {
        this.itemCats = itemCats;
    }

    public List<ItemCat> getItemCats() {
        return this.itemCats;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getLastModified() {
        return this.lastModified;
    }
}


