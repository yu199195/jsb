package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class ScitemUpdateResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4498536355943987322L;
    @ApiField("update_rows")
    private Long updateRows;

    public void setUpdateRows(Long updateRows) {
        this.updateRows = updateRows;
    }

    public Long getUpdateRows() {
        return this.updateRows;
    }
}


