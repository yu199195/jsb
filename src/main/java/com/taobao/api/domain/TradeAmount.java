package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class TradeAmount
        extends TaobaoObject {
    private static final long serialVersionUID = 6225419264194592299L;
    @ApiField("alipay_no")
    private String alipayNo;
    @ApiField("buyer_cod_fee")
    private String buyerCodFee;
    @ApiField("buyer_obtain_point_fee")
    private String buyerObtainPointFee;
    @ApiField("cod_fee")
    private String codFee;
    @ApiField("commission_fee")
    private String commissionFee;
    @ApiField("created")
    private Date created;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("express_agency_fee")
    private String expressAgencyFee;
    @ApiListField("order_amounts")
    @ApiField("order_amount")
    private List<OrderAmount> orderAmounts;
    @ApiField("pay_time")
    private Date payTime;
    @ApiField("payment")
    private String payment;
    @ApiField("post_fee")
    private String postFee;
    @ApiListField("promotion_details")
    @ApiField("promotion_detail")
    private List<PromotionDetail> promotionDetails;
    @ApiField("seller_cod_fee")
    private String sellerCodFee;
    @ApiField("tid")
    private Long tid;
    @ApiField("total_fee")
    private String totalFee;

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getBuyerCodFee() {
        return this.buyerCodFee;
    }

    public void setBuyerCodFee(String buyerCodFee) {
        this.buyerCodFee = buyerCodFee;
    }

    public String getBuyerObtainPointFee() {
        return this.buyerObtainPointFee;
    }

    public void setBuyerObtainPointFee(String buyerObtainPointFee) {
        this.buyerObtainPointFee = buyerObtainPointFee;
    }

    public String getCodFee() {
        return this.codFee;
    }

    public void setCodFee(String codFee) {
        this.codFee = codFee;
    }

    public String getCommissionFee() {
        return this.commissionFee;
    }

    public void setCommissionFee(String commissionFee) {
        this.commissionFee = commissionFee;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getExpressAgencyFee() {
        return this.expressAgencyFee;
    }

    public void setExpressAgencyFee(String expressAgencyFee) {
        this.expressAgencyFee = expressAgencyFee;
    }

    public List<OrderAmount> getOrderAmounts() {
        return this.orderAmounts;
    }

    public void setOrderAmounts(List<OrderAmount> orderAmounts) {
        this.orderAmounts = orderAmounts;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayment() {
        return this.payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPostFee() {
        return this.postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public List<PromotionDetail> getPromotionDetails() {
        return this.promotionDetails;
    }

    public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
        this.promotionDetails = promotionDetails;
    }

    public String getSellerCodFee() {
        return this.sellerCodFee;
    }

    public void setSellerCodFee(String sellerCodFee) {
        this.sellerCodFee = sellerCodFee;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }
}


