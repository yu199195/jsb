package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class ModularDescInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 1285773391842858536L;
    @ApiField("dead_line")
    private String deadLine;
    @ApiListField("itm_dsc_modules")
    @ApiField("item_desc_module")
    private List<ItemDescModule> itmDscModules;
    @ApiField("user_order")
    private Boolean userOrder;
    @ApiField("usr_def_max_num")
    private Long usrDefMaxNum;

    public String getDeadLine() {
        return this.deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public List<ItemDescModule> getItmDscModules() {
        return this.itmDscModules;
    }

    public void setItmDscModules(List<ItemDescModule> itmDscModules) {
        this.itmDscModules = itmDscModules;
    }

    public Boolean getUserOrder() {
        return this.userOrder;
    }

    public void setUserOrder(Boolean userOrder) {
        this.userOrder = userOrder;
    }

    public Long getUsrDefMaxNum() {
        return this.usrDefMaxNum;
    }

    public void setUsrDefMaxNum(Long usrDefMaxNum) {
        this.usrDefMaxNum = usrDefMaxNum;
    }
}


