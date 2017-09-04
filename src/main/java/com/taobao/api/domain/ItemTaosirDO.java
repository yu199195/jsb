package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemTaosirDO
        extends TaobaoObject {
    private static final long serialVersionUID = 3154854487329393481L;
    @ApiListField("expr_el_list")
    @ApiField("item_tao_sir_el_d_o")
    private List<ItemTaoSirElDO> exprElList;
    @ApiField("precision")
    private Long precision;
    @ApiListField("std_unit_list")
    @ApiField("feature")
    private List<Feature> stdUnitList;
    @ApiField("type")
    private Long type;

    public List<ItemTaoSirElDO> getExprElList() {
        return this.exprElList;
    }

    public void setExprElList(List<ItemTaoSirElDO> exprElList) {
        this.exprElList = exprElList;
    }

    public Long getPrecision() {
        return this.precision;
    }

    public void setPrecision(Long precision) {
        this.precision = precision;
    }

    public List<Feature> getStdUnitList() {
        return this.stdUnitList;
    }

    public void setStdUnitList(List<Feature> stdUnitList) {
        this.stdUnitList = stdUnitList;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}


