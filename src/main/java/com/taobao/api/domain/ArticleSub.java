package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class ArticleSub
        extends TaobaoObject {
    private static final long serialVersionUID = 2419671493348478724L;
    @ApiField("article_code")
    private String articleCode;
    @ApiField("article_name")
    private String articleName;
    @ApiField("autosub")
    private Boolean autosub;
    @ApiField("deadline")
    private Date deadline;
    @ApiField("expire_notice")
    private Boolean expireNotice;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_name")
    private String itemName;
    @ApiField("nick")
    private String nick;
    @ApiField("status")
    private Long status;

    public String getArticleCode() {
        return this.articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleName() {
        return this.articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Boolean getAutosub() {
        return this.autosub;
    }

    public void setAutosub(Boolean autosub) {
        this.autosub = autosub;
    }

    public Date getDeadline() {
        return this.deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Boolean getExpireNotice() {
        return this.expireNotice;
    }

    public void setExpireNotice(Boolean expireNotice) {
        this.expireNotice = expireNotice;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}


