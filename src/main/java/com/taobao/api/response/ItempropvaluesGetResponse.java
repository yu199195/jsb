package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropValue;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItempropvaluesGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 4874956749553373777L;
    @ApiField("last_modified")
    private String lastModified;
    @ApiListField("prop_values")
    @ApiField("prop_value")
    private List<PropValue> propValues;

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModified() {
        return this.lastModified;
    }

    public void setPropValues(List<PropValue> propValues) {
        this.propValues = propValues;
    }

    public List<PropValue> getPropValues() {
        return this.propValues;
    }
}


