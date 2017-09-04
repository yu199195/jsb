package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class QueryPagination
        extends TaobaoObject {
    private static final long serialVersionUID = 4646538145391727572L;
    @ApiField("page_index")
    private Long pageIndex;
    @ApiField("page_size")
    private Long pageSize;

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }
}


