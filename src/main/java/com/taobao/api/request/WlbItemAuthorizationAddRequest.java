package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAuthorizationAddResponse;

import java.util.Date;
import java.util.Map;

public class WlbItemAuthorizationAddRequest
        extends BaseTaobaoRequest<WlbItemAuthorizationAddResponse> {
    private Long authType;
    private Date authorizeEndTime;
    private Date authorizeStartTime;
    private String consignUserNick;
    private String itemIdList;
    private String name;
    private Long quantity;
    private String ruleCode;

    public void setAuthType(Long authType) {
        this.authType = authType;
    }

    public Long getAuthType() {
        return this.authType;
    }

    public void setAuthorizeEndTime(Date authorizeEndTime) {
        this.authorizeEndTime = authorizeEndTime;
    }

    public Date getAuthorizeEndTime() {
        return this.authorizeEndTime;
    }

    public void setAuthorizeStartTime(Date authorizeStartTime) {
        this.authorizeStartTime = authorizeStartTime;
    }

    public Date getAuthorizeStartTime() {
        return this.authorizeStartTime;
    }

    public void setConsignUserNick(String consignUserNick) {
        this.consignUserNick = consignUserNick;
    }

    public String getConsignUserNick() {
        return this.consignUserNick;
    }

    public void setItemIdList(String itemIdList) {
        this.itemIdList = itemIdList;
    }

    public String getItemIdList() {
        return this.itemIdList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public String getRuleCode() {
        return this.ruleCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.authorization.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auth_type", this.authType);
        txtParams.put("authorize_end_time", this.authorizeEndTime);
        txtParams.put("authorize_start_time", this.authorizeStartTime);
        txtParams.put("consign_user_nick", this.consignUserNick);
        txtParams.put("item_id_list", this.itemIdList);
        txtParams.put("name", this.name);
        txtParams.put("quantity", this.quantity);
        txtParams.put("rule_code", this.ruleCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbItemAuthorizationAddResponse> getResponseClass() {
        return WlbItemAuthorizationAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.authType, "authType");
        RequestCheckUtils.checkNotEmpty(this.authorizeEndTime, "authorizeEndTime");
        RequestCheckUtils.checkNotEmpty(this.authorizeStartTime, "authorizeStartTime");
        RequestCheckUtils.checkNotEmpty(this.consignUserNick, "consignUserNick");
        RequestCheckUtils.checkNotEmpty(this.itemIdList, "itemIdList");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 255, "name");
        RequestCheckUtils.checkNotEmpty(this.ruleCode, "ruleCode");
    }
}


