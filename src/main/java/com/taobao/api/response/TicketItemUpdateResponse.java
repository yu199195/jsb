package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItemProcessResult;
import com.taobao.api.internal.mapping.ApiField;

public class TicketItemUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4731627831272684377L;
    @ApiField("ticket_item_process_result")
    private TicketItemProcessResult ticketItemProcessResult;

    public void setTicketItemProcessResult(TicketItemProcessResult ticketItemProcessResult) {
        this.ticketItemProcessResult = ticketItemProcessResult;
    }

    public TicketItemProcessResult getTicketItemProcessResult() {
        return this.ticketItemProcessResult;
    }
}


