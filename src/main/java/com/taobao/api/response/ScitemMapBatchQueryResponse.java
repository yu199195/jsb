package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScItemMap;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ScitemMapBatchQueryResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 3837791612914766851L;
    @ApiListField("sc_item_maps")
    @ApiField("sc_item_map")
    private List<ScItemMap> scItemMaps;

    public void setScItemMaps(List<ScItemMap> scItemMaps) {
        this.scItemMaps = scItemMaps;
    }

    public List<ScItemMap> getScItemMaps() {
        return this.scItemMaps;
    }
}


