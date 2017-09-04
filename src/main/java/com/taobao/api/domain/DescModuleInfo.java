package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class DescModuleInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 6137638393176158928L;
    @ApiField("anchor_module_ids")
    private String anchorModuleIds;
    @ApiField("ids_module_ids")
    private String idsModuleIds;
    @ApiField("type")
    private Long type;

    public String getAnchorModuleIds() {
        return this.anchorModuleIds;
    }

    public void setAnchorModuleIds(String anchorModuleIds) {
        this.anchorModuleIds = anchorModuleIds;
    }

    public String getIdsModuleIds() {
        return this.idsModuleIds;
    }

    public void setIdsModuleIds(String idsModuleIds) {
        this.idsModuleIds = idsModuleIds;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}


