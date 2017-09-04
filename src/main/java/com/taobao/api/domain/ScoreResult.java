package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class ScoreResult
        extends TaobaoObject {
    private static final long serialVersionUID = 3721482674582312748L;
    @ApiField("attitude_score")
    private String attitudeScore;
    @ApiField("avg_score")
    private String avgScore;
    @ApiField("easyuse_score")
    private String easyuseScore;
    @ApiField("gmt_create")
    private Date gmtCreate;
    @ApiField("id")
    private Long id;
    @ApiField("is_pay")
    private Long isPay;
    @ApiField("is_valid")
    private Long isValid;
    @ApiField("item_code")
    private String itemCode;
    @ApiField("item_name")
    private String itemName;
    @ApiField("matched_score")
    private String matchedScore;
    @ApiField("prof_score")
    private String profScore;
    @ApiField("rapid_score")
    private String rapidScore;
    @ApiField("service_code")
    private String serviceCode;
    @ApiField("stability_score")
    private String stabilityScore;
    @ApiField("suggestion")
    private String suggestion;
    @ApiField("user_nick")
    private String userNick;

    public String getAttitudeScore() {
        return this.attitudeScore;
    }

    public void setAttitudeScore(String attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    public String getAvgScore() {
        return this.avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public String getEasyuseScore() {
        return this.easyuseScore;
    }

    public void setEasyuseScore(String easyuseScore) {
        this.easyuseScore = easyuseScore;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIsPay() {
        return this.isPay;
    }

    public void setIsPay(Long isPay) {
        this.isPay = isPay;
    }

    public Long getIsValid() {
        return this.isValid;
    }

    public void setIsValid(Long isValid) {
        this.isValid = isValid;
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

    public String getMatchedScore() {
        return this.matchedScore;
    }

    public void setMatchedScore(String matchedScore) {
        this.matchedScore = matchedScore;
    }

    public String getProfScore() {
        return this.profScore;
    }

    public void setProfScore(String profScore) {
        this.profScore = profScore;
    }

    public String getRapidScore() {
        return this.rapidScore;
    }

    public void setRapidScore(String rapidScore) {
        this.rapidScore = rapidScore;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getStabilityScore() {
        return this.stabilityScore;
    }

    public void setStabilityScore(String stabilityScore) {
        this.stabilityScore = stabilityScore;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}


