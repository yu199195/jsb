package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TicketItemsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6468657728168543549L;
    @ApiListField("ticket_items")
    @ApiField("ticket_item")
    private List<TicketItem> ticketItems;

    public void setTicketItems(List<TicketItem> ticketItems) {
        this.ticketItems = ticketItems;
    }

    public List<TicketItem> getTicketItems() {
        return this.ticketItems;
    }
}


