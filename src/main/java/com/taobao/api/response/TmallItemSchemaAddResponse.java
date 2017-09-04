package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class TmallItemSchemaAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1861947641915832935L;
    @ApiField("add_item_result")
    private String addItemResult;
    @ApiField("gmt_create")
    private Date gmtCreate;

    public void setAddItemResult(String addItemResult) {
        this.addItemResult = addItemResult;
    }

    public String getAddItemResult() {
        return this.addItemResult;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }
}


