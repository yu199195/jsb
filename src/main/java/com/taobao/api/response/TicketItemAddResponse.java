package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TicketItemProcessResult;
import com.taobao.api.internal.mapping.ApiField;

public class TicketItemAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6283735147376138253L;
    @ApiField("ticket_item_process_result")
    private TicketItemProcessResult ticketItemProcessResult;

    public void setTicketItemProcessResult(TicketItemProcessResult ticketItemProcessResult) {
        this.ticketItemProcessResult = ticketItemProcessResult;
    }

    public TicketItemProcessResult getTicketItemProcessResult() {
        return this.ticketItemProcessResult;
    }
}


