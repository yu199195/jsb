package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryTemplateUpdateResponse;

import java.util.Map;

public class DeliveryTemplateUpdateRequest
        extends BaseTaobaoRequest<DeliveryTemplateUpdateResponse> {
    private Long assumer;
    private String name;
    private String templateAddFees;
    private String templateAddStandards;
    private String templateDests;
    private Long templateId;
    private String templateStartFees;
    private String templateStartStandards;
    private String templateTypes;

    public void setAssumer(Long assumer) {
        this.assumer = assumer;
    }

    public Long getAssumer() {
        return this.assumer;
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

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getTemplateId() {
        return this.templateId;
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

    public String getApiMethodName() {
        return "taobao.delivery.template.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("assumer", this.assumer);
        txtParams.put("name", this.name);
        txtParams.put("template_add_fees", this.templateAddFees);
        txtParams.put("template_add_standards", this.templateAddStandards);
        txtParams.put("template_dests", this.templateDests);
        txtParams.put("template_id", this.templateId);
        txtParams.put("template_start_fees", this.templateStartFees);
        txtParams.put("template_start_standards", this.templateStartStandards);
        txtParams.put("template_types", this.templateTypes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<DeliveryTemplateUpdateResponse> getResponseClass() {
        return DeliveryTemplateUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.templateAddFees, "templateAddFees");
        RequestCheckUtils.checkNotEmpty(this.templateAddStandards, "templateAddStandards");
        RequestCheckUtils.checkNotEmpty(this.templateDests, "templateDests");
        RequestCheckUtils.checkNotEmpty(this.templateId, "templateId");
        RequestCheckUtils.checkNotEmpty(this.templateStartFees, "templateStartFees");
        RequestCheckUtils.checkNotEmpty(this.templateStartStandards, "templateStartStandards");
        RequestCheckUtils.checkNotEmpty(this.templateTypes, "templateTypes");
    }
}


