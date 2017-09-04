package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class PropertyInputDO
        extends TaobaoObject {
    private static final long serialVersionUID = 6713148758723811679L;
    @ApiField("is_allow_input")
    private Boolean isAllowInput;
    @ApiField("is_root_allow_input")
    private Boolean isRootAllowInput;
    @ApiField("is_sub_property")
    private Boolean isSubProperty;
    @ApiField("property_id")
    private Long propertyId;

    public Boolean getIsAllowInput() {
        return this.isAllowInput;
    }

    public void setIsAllowInput(Boolean isAllowInput) {
        this.isAllowInput = isAllowInput;
    }

    public Boolean getIsRootAllowInput() {
        return this.isRootAllowInput;
    }

    public void setIsRootAllowInput(Boolean isRootAllowInput) {
        this.isRootAllowInput = isRootAllowInput;
    }

    public Boolean getIsSubProperty() {
        return this.isSubProperty;
    }

    public void setIsSubProperty(Boolean isSubProperty) {
        this.isSubProperty = isSubProperty;
    }

    public Long getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }
}


