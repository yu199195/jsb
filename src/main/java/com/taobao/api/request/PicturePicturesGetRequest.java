package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PicturePicturesGetResponse;

import java.util.Date;
import java.util.Map;

public class PicturePicturesGetRequest
        extends BaseTaobaoRequest<PicturePicturesGetResponse> {
    private String clientType;
    private Long currentPage;
    private String deleted;
    private Date endDate;
    private Boolean isHttps;
    private String orderBy;
    private Long pageSize;
    private Long pictureCategoryId;
    private Long pictureId;
    private Date startDate;
    private Date startModifiedDate;
    private String title;
    private String urls;

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return this.clientType;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDeleted() {
        return this.deleted;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setIsHttps(Boolean isHttps) {
        this.isHttps = isHttps;
    }

    public Boolean getIsHttps() {
        return this.isHttps;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPictureCategoryId(Long pictureCategoryId) {
        this.pictureCategoryId = pictureCategoryId;
    }

    public Long getPictureCategoryId() {
        return this.pictureCategoryId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Long getPictureId() {
        return this.pictureId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartModifiedDate(Date startModifiedDate) {
        this.startModifiedDate = startModifiedDate;
    }

    public Date getStartModifiedDate() {
        return this.startModifiedDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getUrls() {
        return this.urls;
    }

    public String getApiMethodName() {
        return "taobao.picture.pictures.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("client_type", this.clientType);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("deleted", this.deleted);
        txtParams.put("end_date", this.endDate);
        txtParams.put("is_https", this.isHttps);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("picture_category_id", this.pictureCategoryId);
        txtParams.put("picture_id", this.pictureId);
        txtParams.put("start_date", this.startDate);
        txtParams.put("start_modified_date", this.startModifiedDate);
        txtParams.put("title", this.title);
        txtParams.put("urls", this.urls);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<PicturePicturesGetResponse> getResponseClass() {
        return PicturePicturesGetResponse.class;
    }

    public void check()
            throws ApiRuleException {
    }
}


