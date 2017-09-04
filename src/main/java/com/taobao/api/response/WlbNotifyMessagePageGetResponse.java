package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbMessage;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class WlbNotifyMessagePageGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2564783844234435381L;
    @ApiField("total_count")
    private Long totalCount;
    @ApiListField("wlb_messages")
    @ApiField("wlb_message")
    private List<WlbMessage> wlbMessages;

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setWlbMessages(List<WlbMessage> wlbMessages) {
        this.wlbMessages = wlbMessages;
    }

    public List<WlbMessage> getWlbMessages() {
        return this.wlbMessages;
    }
}


