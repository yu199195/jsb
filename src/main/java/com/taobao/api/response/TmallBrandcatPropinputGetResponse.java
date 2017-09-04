package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropertyInputDO;
import com.taobao.api.internal.mapping.ApiField;

public class TmallBrandcatPropinputGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 5286856278414663254L;
    @ApiField("property_input")
    private PropertyInputDO propertyInput;

    public void setPropertyInput(PropertyInputDO propertyInput) {
        this.propertyInput = propertyInput;
    }

    public PropertyInputDO getPropertyInput() {
        return this.propertyInput;
    }
}


