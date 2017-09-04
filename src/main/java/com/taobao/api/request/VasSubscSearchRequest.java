package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasSubscSearchResponse;

import java.util.Date;
import java.util.Map;

public class VasSubscSearchRequest
        extends BaseTaobaoRequest<VasSubscSearchResponse> {
    private String articleCode;
    private Boolean autosub;
    private Date endDeadline;
    private Boolean expireNotice;
    private String itemCode;
    private String nick;
    private Long pageNo;
    private Long pageSize;
    private Date startDeadline;
    private Long status;

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleCode() {
        return this.articleCode;
    }

    public void setAutosub(Boolean autosub) {
        this.autosub = autosub;
    }

    public Boolean getAutosub() {
        return this.autosub;
    }

    public void setEndDeadline(Date endDeadline) {
        this.endDeadline = endDeadline;
    }

    public Date getEndDeadline() {
        return this.endDeadline;
    }

    public void setExpireNotice(Boolean expireNotice) {
        this.expireNotice = expireNotice;
    }

    public Boolean getExpireNotice() {
        return this.expireNotice;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStartDeadline(Date startDeadline) {
        this.startDeadline = startDeadline;
    }

    public Date getStartDeadline() {
        return this.startDeadline;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getApiMethodName() {
        return "taobao.vas.subsc.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("article_code", this.articleCode);
        txtParams.put("autosub", this.autosub);
        txtParams.put("end_deadline", this.endDeadline);
        txtParams.put("expire_notice", this.expireNotice);
        txtParams.put("item_code", this.itemCode);
        txtParams.put("nick", this.nick);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_deadline", this.startDeadline);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<VasSubscSearchResponse> getResponseClass() {
        return VasSubscSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.articleCode, "articleCode");
        RequestCheckUtils.checkMaxValue(this.pageSize, 200L, "pageSize");
    }
}


