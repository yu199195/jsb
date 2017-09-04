package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class ArticleUserSubscribe
        extends TaobaoObject {
    private static final long serialVersionUID = 8515221597279772831L;
    @ApiField("deadline")
    private Date deadline;
    @ApiField("item_code")
    private String itemCode;

    public Date getDeadline() {
        return this.deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}


