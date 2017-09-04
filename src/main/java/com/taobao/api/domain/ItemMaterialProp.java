package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ItemMaterialProp
        extends TaobaoObject {
    private static final long serialVersionUID = 8376553733783833994L;
    @ApiListField("materials")
    @ApiField("item_materia_value_d_o")
    private List<ItemMateriaValueDO> materials;

    public List<ItemMateriaValueDO> getMaterials() {
        return this.materials;
    }

    public void setMaterials(List<ItemMateriaValueDO> materials) {
        this.materials = materials;
    }
}


