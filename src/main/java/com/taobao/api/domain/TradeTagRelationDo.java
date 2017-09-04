package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class TradeTagRelationDo
        extends TaobaoObject {
    private static final long serialVersionUID = 6674347227873662437L;
    @ApiField("gmt_created")
    private Date gmtCreated;
    @ApiField("gmt_modified")
    private Date gmtModified;
    @ApiListField("history_trade_tag_relations")
    @ApiField("history_trade_relation_do")
    private List<HistoryTradeRelationDo> historyTradeTagRelations;
    @ApiField("id")
    private Long id;
    @ApiField("tag_name")
    private String tagName;
    @ApiField("tag_type")
    private Long tagType;
    @ApiField("tag_value")
    private String tagValue;
    @ApiField("tid")
    private Long tid;
    @ApiField("visible")
    private Long visible;

    public Date getGmtCreated() {
        return this.gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public List<HistoryTradeRelationDo> getHistoryTradeTagRelations() {
        return this.historyTradeTagRelations;
    }

    public void setHistoryTradeTagRelations(List<HistoryTradeRelationDo> historyTradeTagRelations) {
        this.historyTradeTagRelations = historyTradeTagRelations;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Long getTagType() {
        return this.tagType;
    }

    public void setTagType(Long tagType) {
        this.tagType = tagType;
    }

    public String getTagValue() {
        return this.tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getVisible() {
        return this.visible;
    }

    public void setVisible(Long visible) {
        this.visible = visible;
    }
}


