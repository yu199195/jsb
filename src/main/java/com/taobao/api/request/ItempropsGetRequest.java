package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItempropsGetResponse;

import java.util.Date;
import java.util.Map;

public class ItempropsGetRequest
        extends BaseTaobaoRequest<ItempropsGetResponse> {
    private String attrKeys;
    private String childPath;
    private Long cid;
    private Date datetime;
    private String fields;
    private Boolean isColorProp;
    private Boolean isEnumProp;
    private Boolean isInputProp;
    private Boolean isItemProp;
    private Boolean isKeyProp;
    private Boolean isSaleProp;
    private Long parentPid;
    private Long pid;
    private Long type;

    public void setAttrKeys(String attrKeys) {
        this.attrKeys = attrKeys;
    }

    public String getAttrKeys() {
        return this.attrKeys;
    }

    public void setChildPath(String childPath) {
        this.childPath = childPath;
    }

    public String getChildPath() {
        return this.childPath;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getDatetime() {
        return this.datetime;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setIsColorProp(Boolean isColorProp) {
        this.isColorProp = isColorProp;
    }

    public Boolean getIsColorProp() {
        return this.isColorProp;
    }

    public void setIsEnumProp(Boolean isEnumProp) {
        this.isEnumProp = isEnumProp;
    }

    public Boolean getIsEnumProp() {
        return this.isEnumProp;
    }

    public void setIsInputProp(Boolean isInputProp) {
        this.isInputProp = isInputProp;
    }

    public Boolean getIsInputProp() {
        return this.isInputProp;
    }

    public void setIsItemProp(Boolean isItemProp) {
        this.isItemProp = isItemProp;
    }

    public Boolean getIsItemProp() {
        return this.isItemProp;
    }

    public void setIsKeyProp(Boolean isKeyProp) {
        this.isKeyProp = isKeyProp;
    }

    public Boolean getIsKeyProp() {
        return this.isKeyProp;
    }

    public void setIsSaleProp(Boolean isSaleProp) {
        this.isSaleProp = isSaleProp;
    }

    public Boolean getIsSaleProp() {
        return this.isSaleProp;
    }

    public void setParentPid(Long parentPid) {
        this.parentPid = parentPid;
    }

    public Long getParentPid() {
        return this.parentPid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.itemprops.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("attr_keys", this.attrKeys);
        txtParams.put("child_path", this.childPath);
        txtParams.put("cid", this.cid);
        txtParams.put("datetime", this.datetime);
        txtParams.put("fields", this.fields);
        txtParams.put("is_color_prop", this.isColorProp);
        txtParams.put("is_enum_prop", this.isEnumProp);
        txtParams.put("is_input_prop", this.isInputProp);
        txtParams.put("is_item_prop", this.isItemProp);
        txtParams.put("is_key_prop", this.isKeyProp);
        txtParams.put("is_sale_prop", this.isSaleProp);
        txtParams.put("parent_pid", this.parentPid);
        txtParams.put("pid", this.pid);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItempropsGetResponse> getResponseClass() {
        return ItempropsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(this.attrKeys, 50, "attrKeys");
        RequestCheckUtils.checkNotEmpty(this.cid, "cid");
        RequestCheckUtils.checkMaxValue(this.type, 2L, "type");
        RequestCheckUtils.checkMinValue(this.type, 1L, "type");
    }
}


