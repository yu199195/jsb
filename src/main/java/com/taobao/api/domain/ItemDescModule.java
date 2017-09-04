package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ItemDescModule
        extends TaobaoObject {
    private static final long serialVersionUID = 1264527248214584931L;
    @ApiField("content")
    private String content;
    @ApiField("intros")
    private String intros;
    @ApiField("module_id")
    private Long moduleId;
    @ApiField("module_name")
    private String moduleName;
    @ApiField("required")
    private Boolean required;
    @ApiField("tpl_urls")
    private String tplUrls;
    @ApiField("type")
    private String type;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIntros() {
        return this.intros;
    }

    public void setIntros(String intros) {
        this.intros = intros;
    }

    public Long getModuleId() {
        return this.moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getTplUrls() {
        return this.tplUrls;
    }

    public void setTplUrls(String tplUrls) {
        this.tplUrls = tplUrls;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


