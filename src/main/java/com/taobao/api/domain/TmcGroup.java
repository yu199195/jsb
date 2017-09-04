package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class TmcGroup
        extends TaobaoObject {
    private static final long serialVersionUID = 5169838197963196255L;
    @ApiField("name")
    private String name;
    @ApiListField("users")
    @ApiField("string")
    private List<String> users;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUsers() {
        return this.users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}


