package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItem;
import com.taobao.api.internal.mapping.ApiField;

public class TicketItemGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6145228788119816971L;
    @ApiField("ticket_item")
    private TicketItem ticketItem;

    public void setTicketItem(TicketItem ticketItem) {
        this.ticketItem = ticketItem;
    }

    public TicketItem getTicketItem() {
        return this.ticketItem;
    }
}


