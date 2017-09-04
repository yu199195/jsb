package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemTemplatesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6677375152214757858L;
    @ApiListField("item_template_list")
    @ApiField("item_template")
    private List<ItemTemplate> itemTemplateList;

    public void setItemTemplateList(List<ItemTemplate> itemTemplateList) {
        this.itemTemplateList = itemTemplateList;
    }

    public List<ItemTemplate> getItemTemplateList() {
        return this.itemTemplateList;
    }
}


