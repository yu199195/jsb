package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.QueryPagination;
import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ScitemQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 1477746373998978676L;
    @ApiField("page_index")
    private Long pageIndex;
    @ApiField("page_size")
    private Long pageSize;
    @ApiField("query_pagination")
    private QueryPagination queryPagination;
    @ApiListField("sc_item_list")
    @ApiField("sc_item")
    private List<ScItem> scItemList;
    @ApiField("total_page")
    private Long totalPage;

    public void setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Long getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setQueryPagination(QueryPagination queryPagination) {
        this.queryPagination = queryPagination;
    }

    public QueryPagination getQueryPagination() {
        return this.queryPagination;
    }

    public void setScItemList(List<ScItem> scItemList) {
        this.scItemList = scItemList;
    }

    public List<ScItem> getScItemList() {
        return this.scItemList;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalPage() {
        return this.totalPage;
    }
}


