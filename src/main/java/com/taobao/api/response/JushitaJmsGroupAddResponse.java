package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class JushitaJmsGroupAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2491999349497115388L;
    @ApiField("created")
    private Date created;
    @ApiField("group_name")
    private String groupName;

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }
}


