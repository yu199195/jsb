package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasOrderSearchResponse;

import java.util.Date;
import java.util.Map;

public class VasOrderSearchRequest
        extends BaseTaobaoRequest<VasOrderSearchResponse> {
    private String articleCode;
    private Long bizOrderId;
    private Long bizType;
    private Date endCreated;
    private String itemCode;
    private String nick;
    private Long orderId;
    private Long pageNo;
    private Long pageSize;
    private Date startCreated;

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getArticleCode() {
        return this.articleCode;
    }

    public void setBizOrderId(Long bizOrderId) {
        this.bizOrderId = bizOrderId;
    }

    public Long getBizOrderId() {
        return this.bizOrderId;
    }

    public void setBizType(Long bizType) {
        this.bizType = bizType;
    }

    public Long getBizType() {
        return this.bizType;
    }

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
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

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
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

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public String getApiMethodName() {
        return "taobao.vas.order.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("article_code", this.articleCode);
        txtParams.put("biz_order_id", this.bizOrderId);
        txtParams.put("biz_type", this.bizType);
        txtParams.put("end_created", this.endCreated);
        txtParams.put("item_code", this.itemCode);
        txtParams.put("nick", this.nick);
        txtParams.put("order_id", this.orderId);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_created", this.startCreated);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<VasOrderSearchResponse> getResponseClass() {
        return VasOrderSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.articleCode, "articleCode");
        RequestCheckUtils.checkMaxValue(this.pageSize, 200L, "pageSize");
    }
}


