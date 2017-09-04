package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.IdsModule;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemAnchorGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2523718646468389327L;
    @ApiListField("anchor_modules")
    @ApiField("ids_module")
    private List<IdsModule> anchorModules;
    @ApiField("total_results")
    private Long totalResults;

    public void setAnchorModules(List<IdsModule> anchorModules) {
        this.anchorModules = anchorModules;
    }

    public List<IdsModule> getAnchorModules() {
        return this.anchorModules;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
}


