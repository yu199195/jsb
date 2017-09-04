package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.Materialitemswlbwmsstockpruductprocessingnotify;
import com.taobao.api.domain.Productitemswlbwmsstockpruductprocessingnotify;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.WlbWmsStockPruductProcessingNotifyResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class WlbWmsStockPruductProcessingNotifyRequest
        extends BaseTaobaoRequest<WlbWmsStockPruductProcessingNotifyResponse> {
    private String extendFields;
    private String materialItems;
    private String orderCode;
    private Date orderCreateTime;
    private Long orderType;
    private Long planQty;
    private Date planWorkTime;
    private String productItems;
    private String remark;
    private Long serviceType;
    private String storeCode;

    public void setExtendFields(String extendFields) {
        this.extendFields = extendFields;
    }

    public String getExtendFields() {
        return this.extendFields;
    }

    public void setMaterialItems(String materialItems) {
        this.materialItems = materialItems;
    }

    public void setMaterialItems(List<Materialitemswlbwmsstockpruductprocessingnotify> materialItems) {
        this.materialItems = new JSONWriter(false, true).write(materialItems);
    }

    public String getMaterialItems() {
        return this.materialItems;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setPlanQty(Long planQty) {
        this.planQty = planQty;
    }

    public Long getPlanQty() {
        return this.planQty;
    }

    public void setPlanWorkTime(Date planWorkTime) {
        this.planWorkTime = planWorkTime;
    }

    public Date getPlanWorkTime() {
        return this.planWorkTime;
    }

    public void setProductItems(String productItems) {
        this.productItems = productItems;
    }

    public void setProductItems(List<Productitemswlbwmsstockpruductprocessingnotify> productItems) {
        this.productItems = new JSONWriter(false, true).write(productItems);
    }

    public String getProductItems() {
        return this.productItems;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getApiMethodName() {
        return "taobao.wlb.wms.stock.pruduct.processing.notify";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("extend_fields", this.extendFields);
        txtParams.put("material_items", this.materialItems);
        txtParams.put("order_code", this.orderCode);
        txtParams.put("order_create_time", this.orderCreateTime);
        txtParams.put("order_type", this.orderType);
        txtParams.put("plan_qty", this.planQty);
        txtParams.put("plan_work_time", this.planWorkTime);
        txtParams.put("product_items", this.productItems);
        txtParams.put("remark", this.remark);
        txtParams.put("service_type", this.serviceType);
        txtParams.put("store_code", this.storeCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<WlbWmsStockPruductProcessingNotifyResponse> getResponseClass() {
        return WlbWmsStockPruductProcessingNotifyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkObjectMaxListSize(this.materialItems, 1000, "materialItems");
        RequestCheckUtils.checkNotEmpty(this.orderCode, "orderCode");
        RequestCheckUtils.checkNotEmpty(this.orderType, "orderType");
        RequestCheckUtils.checkObjectMaxListSize(this.productItems, 1000, "productItems");
        RequestCheckUtils.checkNotEmpty(this.serviceType, "serviceType");
    }
}


