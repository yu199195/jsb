package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOrdersGetResponse;

import java.util.Date;
import java.util.Map;

public class LogisticsOrdersGetRequest
        extends BaseTaobaoRequest<LogisticsOrdersGetResponse> {
    private String buyerNick;
    private Date endCreated;
    private String fields;
    private String freightPayer;
    private Long pageNo;
    private Long pageSize;
    private String receiverName;
    private String sellerConfirm;
    private Date startCreated;
    private String status;
    private Long tid;
    private String type;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public String getFreightPayer() {
        return this.freightPayer;
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

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public void setSellerConfirm(String sellerConfirm) {
        this.sellerConfirm = sellerConfirm;
    }

    public String getSellerConfirm() {
        return this.sellerConfirm;
    }

    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String getApiMethodName() {
        return "taobao.logistics.orders.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("end_created", this.endCreated);
        txtParams.put("fields", this.fields);
        txtParams.put("freight_payer", this.freightPayer);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("receiver_name", this.receiverName);
        txtParams.put("seller_confirm", this.sellerConfirm);
        txtParams.put("start_created", this.startCreated);
        txtParams.put("status", this.status);
        txtParams.put("tid", this.tid);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<LogisticsOrdersGetResponse> getResponseClass() {
        return LogisticsOrdersGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxValue(this.pageSize, 100L, "pageSize");
    }
}


