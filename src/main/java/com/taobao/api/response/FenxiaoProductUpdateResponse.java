package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class FenxiaoProductUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8218785991321275465L;
    @ApiField("modified")
    private Date modified;
    @ApiField("pid")
    private Long pid;

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return this.pid;
    }
}


