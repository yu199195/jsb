package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class TradeRate
        extends TaobaoObject {
    private static final long serialVersionUID = 3552334577154528876L;
    @ApiField("content")
    private String content;
    @ApiField("created")
    private Date created;
    @ApiField("item_price")
    private String itemPrice;
    @ApiField("item_title")
    private String itemTitle;
    @ApiField("nick")
    private String nick;
    @ApiField("num_iid")
    private Long numIid;
    @ApiField("oid")
    private Long oid;
    @ApiField("rated_nick")
    private String ratedNick;
    @ApiField("reply")
    private String reply;
    @ApiField("result")
    private String result;
    @ApiField("role")
    private String role;
    @ApiField("tid")
    private Long tid;
    @ApiField("valid_score")
    private Boolean validScore;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getRatedNick() {
        return this.ratedNick;
    }

    public void setRatedNick(String ratedNick) {
        this.ratedNick = ratedNick;
    }

    public String getReply() {
        return this.reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Boolean getValidScore() {
        return this.validScore;
    }

    public void setValidScore(Boolean validScore) {
        this.validScore = validScore;
    }
}


