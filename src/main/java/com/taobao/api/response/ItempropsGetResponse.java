package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemProp;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class ItempropsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1431271746414765579L;
    @ApiListField("item_props")
    @ApiField("item_prop")
    private List<ItemProp> itemProps;
    @ApiField("last_modified")
    private Date lastModified;

    public void setItemProps(List<ItemProp> itemProps) {
        this.itemProps = itemProps;
    }

    public List<ItemProp> getItemProps() {
        return this.itemProps;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getLastModified() {
        return this.lastModified;
    }
}


