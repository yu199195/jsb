package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class SubUserInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 4718874922224845171L;
    @ApiField("full_name")
    private String fullName;
    @ApiField("is_online")
    private Long isOnline;
    @ApiField("nick")
    private String nick;
    @ApiField("seller_id")
    private Long sellerId;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("status")
    private Long status;
    @ApiField("sub_id")
    private Long subId;

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Long isOnline) {
        this.isOnline = isOnline;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }
}


