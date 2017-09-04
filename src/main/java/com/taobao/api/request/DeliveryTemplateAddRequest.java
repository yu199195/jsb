package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryTemplateAddResponse;

import java.util.Map;

public class DeliveryTemplateAddRequest
        extends BaseTaobaoRequest<DeliveryTemplateAddResponse> {
    private Long assumer;
    private Long consignAreaId;
    private String name;
    private String templateAddFees;
    private String templateAddStandards;
    private String templateDests;
    private String templateStartFees;
    private String templateStartStandards;
    private String templateTypes;
    private Long valuation;

    public void setAssumer(Long assumer) {
        this.assumer = assumer;
    }

    public Long getAssumer() {
        return this.assumer;
    }

    public void setConsignAreaId(Long consignAreaId) {
        this.consignAreaId = consignAreaId;
    }

    public Long getConsignAreaId() {
        return this.consignAreaId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTemplateAddFees(String templateAddFees) {
        this.templateAddFees = templateAddFees;
    }

    public String getTemplateAddFees() {
        return this.templateAddFees;
    }

    public void setTemplateAddStandards(String templateAddStandards) {
        this.templateAddStandards = templateAddStandards;
    }

    public String getTemplateAddStandards() {
        return this.templateAddStandards;
    }

    public void setTemplateDests(String templateDests) {
        this.templateDests = templateDests;
    }

    public String getTemplateDests() {
        return this.templateDests;
    }

    public void setTemplateStartFees(String templateStartFees) {
        this.templateStartFees = templateStartFees;
    }

    public String getTemplateStartFees() {
        return this.templateStartFees;
    }

    public void setTemplateStartStandards(String templateStartStandards) {
        this.templateStartStandards = templateStartStandards;
    }

    public String getTemplateStartStandards() {
        return this.templateStartStandards;
    }

    public void setTemplateTypes(String templateTypes) {
        this.templateTypes = templateTypes;
    }

    public String getTemplateTypes() {
        return this.templateTypes;
    }

    public void setValuation(Long valuation) {
        this.valuation = valuation;
    }

    public Long getValuation() {
        return this.valuation;
    }

    public String getApiMethodName() {
        return "taobao.delivery.template.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("assumer", this.assumer);
        txtParams.put("consign_area_id", this.consignAreaId);
        txtParams.put("name", this.name);
        txtParams.put("template_add_fees", this.templateAddFees);
        txtParams.put("template_add_standards", this.templateAddStandards);
        txtParams.put("template_dests", this.templateDests);
        txtParams.put("template_start_fees", this.templateStartFees);
        txtParams.put("template_start_standards", this.templateStartStandards);
        txtParams.put("template_types", this.templateTypes);
        txtParams.put("valuation", this.valuation);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<DeliveryTemplateAddResponse> getResponseClass() {
        return DeliveryTemplateAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.assumer, "assumer");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 50, "name");
        RequestCheckUtils.checkNotEmpty(this.templateAddFees, "templateAddFees");
        RequestCheckUtils.checkNotEmpty(this.templateAddStandards, "templateAddStandards");
        RequestCheckUtils.checkNotEmpty(this.templateDests, "templateDests");
        RequestCheckUtils.checkNotEmpty(this.templateStartFees, "templateStartFees");
        RequestCheckUtils.checkNotEmpty(this.templateStartStandards, "templateStartStandards");
        RequestCheckUtils.checkNotEmpty(this.templateTypes, "templateTypes");
        RequestCheckUtils.checkNotEmpty(this.valuation, "valuation");
    }
}


