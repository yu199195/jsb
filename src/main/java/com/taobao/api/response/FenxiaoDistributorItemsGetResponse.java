package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FenxiaoItemRecord;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class FenxiaoDistributorItemsGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 6452455698695169498L;
    @ApiListField("records")
    @ApiField("fenxiao_item_record")
    private List<FenxiaoItemRecord> records;
    @ApiField("total_results")
    private Long totalResults;

    public void setRecords(List<FenxiaoItemRecord> records) {
        this.records = records;
    }

    public List<FenxiaoItemRecord> getRecords() {
        return this.records;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


