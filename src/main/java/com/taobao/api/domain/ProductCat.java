package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class ProductCat
        extends TaobaoObject {
    private static final long serialVersionUID = 8617198165917515711L;
    @ApiField("cost_percent")
    private String costPercent;
    @ApiField("cost_percent_agent")
    private String costPercentAgent;
    @ApiField("cost_percent_dealer")
    private String costPercentDealer;
    @ApiField("cost_percent_dealer_yuan")
    private String costPercentDealerYuan;
    @ApiField("cost_percent_yuan")
    private String costPercentYuan;
    @ApiField("id")
    private Long id;
    @ApiField("name")
    private String name;
    @ApiField("product_num")
    private Long productNum;
    @ApiField("retail_high_percent")
    private String retailHighPercent;
    @ApiField("retail_high_percent_yuan")
    private String retailHighPercentYuan;
    @ApiField("retail_low_percent")
    private String retailLowPercent;
    @ApiField("retail_low_percent_yuan")
    private String retailLowPercentYuan;

    public String getCostPercent() {
        return this.costPercent;
    }

    public void setCostPercent(String costPercent) {
        this.costPercent = costPercent;
    }

    public String getCostPercentAgent() {
        return this.costPercentAgent;
    }

    public void setCostPercentAgent(String costPercentAgent) {
        this.costPercentAgent = costPercentAgent;
    }

    public String getCostPercentDealer() {
        return this.costPercentDealer;
    }

    public void setCostPercentDealer(String costPercentDealer) {
        this.costPercentDealer = costPercentDealer;
    }

    public String getCostPercentDealerYuan() {
        return this.costPercentDealerYuan;
    }

    public void setCostPercentDealerYuan(String costPercentDealerYuan) {
        this.costPercentDealerYuan = costPercentDealerYuan;
    }

    public String getCostPercentYuan() {
        return this.costPercentYuan;
    }

    public void setCostPercentYuan(String costPercentYuan) {
        this.costPercentYuan = costPercentYuan;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductNum() {
        return this.productNum;
    }

    public void setProductNum(Long productNum) {
        this.productNum = productNum;
    }

    public String getRetailHighPercent() {
        return this.retailHighPercent;
    }

    public void setRetailHighPercent(String retailHighPercent) {
        this.retailHighPercent = retailHighPercent;
    }

    public String getRetailHighPercentYuan() {
        return this.retailHighPercentYuan;
    }

    public void setRetailHighPercentYuan(String retailHighPercentYuan) {
        this.retailHighPercentYuan = retailHighPercentYuan;
    }

    public String getRetailLowPercent() {
        return this.retailLowPercent;
    }

    public void setRetailLowPercent(String retailLowPercent) {
        this.retailLowPercent = retailLowPercent;
    }

    public String getRetailLowPercentYuan() {
        return this.retailLowPercentYuan;
    }

    public void setRetailLowPercentYuan(String retailLowPercentYuan) {
        this.retailLowPercentYuan = retailLowPercentYuan;
    }
}


