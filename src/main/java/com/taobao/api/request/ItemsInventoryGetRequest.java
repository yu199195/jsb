package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemsInventoryGetResponse;

import java.util.Date;
import java.util.Map;

public class ItemsInventoryGetRequest
        extends BaseTaobaoRequest<ItemsInventoryGetResponse> {
    private String banner;
    private Long cid;
    private Date endModified;
    private String fields;
    private Boolean hasDiscount;
    private Boolean isCspu;
    private Boolean isEx;
    private Boolean isTaobao;
    private String orderBy;
    private Long pageNo;
    private Long pageSize;
    private String q;
    private String sellerCids;
    private Date startModified;

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getBanner() {
        return this.banner;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setHasDiscount(Boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    public void setIsCspu(Boolean isCspu) {
        this.isCspu = isCspu;
    }

    public Boolean getIsCspu() {
        return this.isCspu;
    }

    public void setIsEx(Boolean isEx) {
        this.isEx = isEx;
    }

    public Boolean getIsEx() {
        return this.isEx;
    }

    public void setIsTaobao(Boolean isTaobao) {
        this.isTaobao = isTaobao;
    }

    public Boolean getIsTaobao() {
        return this.isTaobao;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
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

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ() {
        return this.q;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public void setStartModified(Date startModified) {
        this.startModified = startModified;
    }

    public Date getStartModified() {
        return this.startModified;
    }

    public String getApiMethodName() {
        return "taobao.items.inventory.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("banner", this.banner);
        txtParams.put("cid", this.cid);
        txtParams.put("end_modified", this.endModified);
        txtParams.put("fields", this.fields);
        txtParams.put("has_discount", this.hasDiscount);
        txtParams.put("is_cspu", this.isCspu);
        txtParams.put("is_ex", this.isEx);
        txtParams.put("is_taobao", this.isTaobao);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("q", this.q);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("start_modified", this.startModified);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<ItemsInventoryGetResponse> getResponseClass() {
        return ItemsInventoryGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(this.cid, 0L, "cid");
        RequestCheckUtils.checkNotEmpty(this.fields, "fields");
        RequestCheckUtils.checkMaxValue(this.pageNo, 101L, "pageNo");
        RequestCheckUtils.checkMaxListSize(this.sellerCids, 32, "sellerCids");
    }
}


