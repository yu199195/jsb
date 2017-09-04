package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Ticket;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmallProductSpecsTicketGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3239532891865393823L;
    @ApiListField("tickets")
    @ApiField("ticket")
    private List<Ticket> tickets;

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }
}


