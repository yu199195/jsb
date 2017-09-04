package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TicketItemProcessResult
        extends TaobaoObject {
    private static final long serialVersionUID = 6648613996248615558L;
    @ApiField("broken")
    private Boolean broken;
    @ApiListField("broken_reasons")
    @ApiField("string")
    private List<String> brokenReasons;
    @ApiField("item_id")
    private Long itemId;

    public Boolean getBroken() {
        return this.broken;
    }

    public void setBroken(Boolean broken) {
        this.broken = broken;
    }

    public List<String> getBrokenReasons() {
        return this.brokenReasons;
    }

    public void setBrokenReasons(List<String> brokenReasons) {
        this.brokenReasons = brokenReasons;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}


