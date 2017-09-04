package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class FoodSecurity
        extends TaobaoObject {
    private static final long serialVersionUID = 8171792146315336689L;
    @ApiField("contact")
    private String contact;
    @ApiField("design_code")
    private String designCode;
    @ApiField("factory")
    private String factory;
    @ApiField("factory_site")
    private String factorySite;
    @ApiField("food_additive")
    private String foodAdditive;
    @ApiField("health_product_no")
    private String healthProductNo;
    @ApiField("mix")
    private String mix;
    @ApiField("period")
    private String period;
    @ApiField("plan_storage")
    private String planStorage;
    @ApiField("prd_license_no")
    private String prdLicenseNo;
    @ApiField("product_date_end")
    private String productDateEnd;
    @ApiField("product_date_start")
    private String productDateStart;
    @ApiField("stock_date_end")
    private String stockDateEnd;
    @ApiField("stock_date_start")
    private String stockDateStart;
    @ApiField("supplier")
    private String supplier;

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDesignCode() {
        return this.designCode;
    }

    public void setDesignCode(String designCode) {
        this.designCode = designCode;
    }

    public String getFactory() {
        return this.factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getFactorySite() {
        return this.factorySite;
    }

    public void setFactorySite(String factorySite) {
        this.factorySite = factorySite;
    }

    public String getFoodAdditive() {
        return this.foodAdditive;
    }

    public void setFoodAdditive(String foodAdditive) {
        this.foodAdditive = foodAdditive;
    }

    public String getHealthProductNo() {
        return this.healthProductNo;
    }

    public void setHealthProductNo(String healthProductNo) {
        this.healthProductNo = healthProductNo;
    }

    public String getMix() {
        return this.mix;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    public String getPeriod() {
        return this.period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPlanStorage() {
        return this.planStorage;
    }

    public void setPlanStorage(String planStorage) {
        this.planStorage = planStorage;
    }

    public String getPrdLicenseNo() {
        return this.prdLicenseNo;
    }

    public void setPrdLicenseNo(String prdLicenseNo) {
        this.prdLicenseNo = prdLicenseNo;
    }

    public String getProductDateEnd() {
        return this.productDateEnd;
    }

    public void setProductDateEnd(String productDateEnd) {
        this.productDateEnd = productDateEnd;
    }

    public String getProductDateStart() {
        return this.productDateStart;
    }

    public void setProductDateStart(String productDateStart) {
        this.productDateStart = productDateStart;
    }

    public String getStockDateEnd() {
        return this.stockDateEnd;
    }

    public void setStockDateEnd(String stockDateEnd) {
        this.stockDateEnd = stockDateEnd;
    }

    public String getStockDateStart() {
        return this.stockDateStart;
    }

    public void setStockDateStart(String stockDateStart) {
        this.stockDateStart = stockDateStart;
    }

    public String getSupplier() {
        return this.supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}


