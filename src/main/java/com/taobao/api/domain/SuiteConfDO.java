package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SuiteConfDO
        extends TaobaoObject {
    private static final long serialVersionUID = 1631555756362841728L;
    @ApiListField("inputs")
    @ApiField("number")
    private List<Long> inputs;
    @ApiField("max_size")
    private Long maxSize;
    @ApiField("max_total_number")
    private Long maxTotalNumber;
    @ApiField("root_cat_id")
    private Long rootCatId;
    @ApiField("suite_cat_id")
    private Long suiteCatId;

    public List<Long> getInputs() {
        return this.inputs;
    }

    public void setInputs(List<Long> inputs) {
        this.inputs = inputs;
    }

    public Long getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public Long getMaxTotalNumber() {
        return this.maxTotalNumber;
    }

    public void setMaxTotalNumber(Long maxTotalNumber) {
        this.maxTotalNumber = maxTotalNumber;
    }

    public Long getRootCatId() {
        return this.rootCatId;
    }

    public void setRootCatId(Long rootCatId) {
        this.rootCatId = rootCatId;
    }

    public Long getSuiteCatId() {
        return this.suiteCatId;
    }

    public void setSuiteCatId(Long suiteCatId) {
        this.suiteCatId = suiteCatId;
    }
}


