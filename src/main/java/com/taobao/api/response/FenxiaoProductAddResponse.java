package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class FenxiaoProductAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4652962486945623829L;
    @ApiField("created")
    private Date created;
    @ApiField("pid")
    private Long pid;

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return this.pid;
    }
}


