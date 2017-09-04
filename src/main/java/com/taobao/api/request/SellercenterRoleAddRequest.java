package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterRoleAddResponse;

import java.util.Map;

public class SellercenterRoleAddRequest
        extends BaseTaobaoRequest<SellercenterRoleAddResponse> {
    private String description;
    private String name;
    private String nick;
    private String permissionCodes;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setPermissionCodes(String permissionCodes) {
        this.permissionCodes = permissionCodes;
    }

    public String getPermissionCodes() {
        return this.permissionCodes;
    }

    public String getApiMethodName() {
        return "taobao.sellercenter.role.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("description", this.description);
        txtParams.put("name", this.name);
        txtParams.put("nick", this.nick);
        txtParams.put("permission_codes", this.permissionCodes);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<SellercenterRoleAddResponse> getResponseClass() {
        return SellercenterRoleAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.description, 20, "description");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 20, "name");
        RequestCheckUtils.checkNotEmpty(this.nick, "nick");
        RequestCheckUtils.checkMaxLength(this.nick, 500, "nick");
        RequestCheckUtils.checkMaxListSize(this.permissionCodes, 2000, "permissionCodes");
    }
}


