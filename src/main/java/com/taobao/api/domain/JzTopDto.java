package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class JzTopDto
        extends TaobaoObject {
    private static final long serialVersionUID = 6866815395627774612L;
    @ApiListField("expresses")
    @ApiField("expresses")
    private List<Expresses> expresses;
    @ApiField("goods_relations")
    private String goodsRelations;
    @ApiListField("ins_tps")
    @ApiField("instps")
    private List<Instps> insTps;
    @ApiListField("lg_cps")
    @ApiField("lgcps")
    private List<Lgcps> lgCps;
    @ApiField("supp_modify_ins_add")
    private Boolean suppModifyInsAdd;
    @ApiField("support_delivery")
    private Boolean supportDelivery;
    @ApiField("support_install")
    private Boolean supportInstall;

    public List<Expresses> getExpresses() {
        return this.expresses;
    }

    public void setExpresses(List<Expresses> expresses) {
        this.expresses = expresses;
    }

    public String getGoodsRelations() {
        return this.goodsRelations;
    }

    public void setGoodsRelations(String goodsRelations) {
        this.goodsRelations = goodsRelations;
    }

    public void setGoodsRelationsString(String goodsRelations) {
        this.goodsRelations = goodsRelations;
    }

    public List<Instps> getInsTps() {
        return this.insTps;
    }

    public void setInsTps(List<Instps> insTps) {
        this.insTps = insTps;
    }

    public List<Lgcps> getLgCps() {
        return this.lgCps;
    }

    public void setLgCps(List<Lgcps> lgCps) {
        this.lgCps = lgCps;
    }

    public Boolean getSuppModifyInsAdd() {
        return this.suppModifyInsAdd;
    }

    public void setSuppModifyInsAdd(Boolean suppModifyInsAdd) {
        this.suppModifyInsAdd = suppModifyInsAdd;
    }

    public Boolean getSupportDelivery() {
        return this.supportDelivery;
    }

    public void setSupportDelivery(Boolean supportDelivery) {
        this.supportDelivery = supportDelivery;
    }

    public Boolean getSupportInstall() {
        return this.supportInstall;
    }

    public void setSupportInstall(Boolean supportInstall) {
        this.supportInstall = supportInstall;
    }
}


