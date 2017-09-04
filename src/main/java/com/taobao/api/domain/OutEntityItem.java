package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class OutEntityItem
        extends TaobaoObject {
    private static final long serialVersionUID = 7367455996837934163L;
    @ApiField("entity_id")
    private String entityId;
    @ApiField("entity_type")
    private String entityType;

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return this.entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
}


