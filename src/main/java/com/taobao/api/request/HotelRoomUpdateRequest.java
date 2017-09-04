package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelRoomUpdateResponse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HotelRoomUpdateRequest
        extends BaseTaobaoRequest<HotelRoomUpdateResponse>
        implements TaobaoUploadRequest<HotelRoomUpdateResponse> {
    private String area;
    private String bbn;
    private String bedType;
    private String breakfast;
    private String channel;
    private Long deposit;
    private String desc;
    private String endTime;
    private Long fee;
    private Long gid;
    private Date gmtDeadline;
    private Date gmtEffective;
    private String guide;
    private Boolean hasReceipt;
    private Long maxAdvHours;
    private Long maxDays;
    private String memberLevel;
    private Long minAdvHours;
    private Long minDays;
    private String multiRoomQuotas;
    private String outerId;
    private String paymentType;
    private FileItem pic;
    private String picPath;
    private String priceType;
    private String receiptInfo;
    private String receiptOtherTypeDesc;
    private String receiptType;
    private String refundPolicyInfo;
    private Long rid;
    private String roomQuotas;
    private String service;
    private String siteParam;
    private String size;
    private String startTime;
    private Long status;
    private String storey;
    private String title;

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setBbn(String bbn) {
        this.bbn = bbn;
    }

    public String getBbn() {
        return this.bbn;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getBedType() {
        return this.bedType;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getBreakfast() {
        return this.breakfast;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getDeposit() {
        return this.deposit;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return this.fee;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Long getGid() {
        return this.gid;
    }

    public void setGmtDeadline(Date gmtDeadline) {
        this.gmtDeadline = gmtDeadline;
    }

    public Date getGmtDeadline() {
        return this.gmtDeadline;
    }

    public void setGmtEffective(Date gmtEffective) {
        this.gmtEffective = gmtEffective;
    }

    public Date getGmtEffective() {
        return this.gmtEffective;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public String getGuide() {
        return this.guide;
    }

    public void setHasReceipt(Boolean hasReceipt) {
        this.hasReceipt = hasReceipt;
    }

    public Boolean getHasReceipt() {
        return this.hasReceipt;
    }

    public void setMaxAdvHours(Long maxAdvHours) {
        this.maxAdvHours = maxAdvHours;
    }

    public Long getMaxAdvHours() {
        return this.maxAdvHours;
    }

    public void setMaxDays(Long maxDays) {
        this.maxDays = maxDays;
    }

    public Long getMaxDays() {
        return this.maxDays;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getMemberLevel() {
        return this.memberLevel;
    }

    public void setMinAdvHours(Long minAdvHours) {
        this.minAdvHours = minAdvHours;
    }

    public Long getMinAdvHours() {
        return this.minAdvHours;
    }

    public void setMinDays(Long minDays) {
        this.minDays = minDays;
    }

    public Long getMinDays() {
        return this.minDays;
    }

    public void setMultiRoomQuotas(String multiRoomQuotas) {
        this.multiRoomQuotas = multiRoomQuotas;
    }

    public String getMultiRoomQuotas() {
        return this.multiRoomQuotas;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    public FileItem getPic() {
        return this.pic;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getPicPath() {
        return this.picPath;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public void setReceiptInfo(String receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    public String getReceiptInfo() {
        return this.receiptInfo;
    }

    public void setReceiptOtherTypeDesc(String receiptOtherTypeDesc) {
        this.receiptOtherTypeDesc = receiptOtherTypeDesc;
    }

    public String getReceiptOtherTypeDesc() {
        return this.receiptOtherTypeDesc;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getReceiptType() {
        return this.receiptType;
    }

    public void setRefundPolicyInfo(String refundPolicyInfo) {
        this.refundPolicyInfo = refundPolicyInfo;
    }

    public String getRefundPolicyInfo() {
        return this.refundPolicyInfo;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getRid() {
        return this.rid;
    }

    public void setRoomQuotas(String roomQuotas) {
        this.roomQuotas = roomQuotas;
    }

    public String getRoomQuotas() {
        return this.roomQuotas;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getService() {
        return this.service;
    }

    public void setSiteParam(String siteParam) {
        this.siteParam = siteParam;
    }

    public String getSiteParam() {
        return this.siteParam;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public String getStorey() {
        return this.storey;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getApiMethodName() {
        return "taobao.hotel.room.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("area", this.area);
        txtParams.put("bbn", this.bbn);
        txtParams.put("bed_type", this.bedType);
        txtParams.put("breakfast", this.breakfast);
        txtParams.put("channel", this.channel);
        txtParams.put("deposit", this.deposit);
        txtParams.put("desc", this.desc);
        txtParams.put("end_time", this.endTime);
        txtParams.put("fee", this.fee);
        txtParams.put("gid", this.gid);
        txtParams.put("gmt_deadline", this.gmtDeadline);
        txtParams.put("gmt_effective", this.gmtEffective);
        txtParams.put("guide", this.guide);
        txtParams.put("has_receipt", this.hasReceipt);
        txtParams.put("max_adv_hours", this.maxAdvHours);
        txtParams.put("max_days", this.maxDays);
        txtParams.put("member_level", this.memberLevel);
        txtParams.put("min_adv_hours", this.minAdvHours);
        txtParams.put("min_days", this.minDays);
        txtParams.put("multi_room_quotas", this.multiRoomQuotas);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("payment_type", this.paymentType);
        txtParams.put("pic_path", this.picPath);
        txtParams.put("price_type", this.priceType);
        txtParams.put("receipt_info", this.receiptInfo);
        txtParams.put("receipt_other_type_desc", this.receiptOtherTypeDesc);
        txtParams.put("receipt_type", this.receiptType);
        txtParams.put("refund_policy_info", this.refundPolicyInfo);
        txtParams.put("rid", this.rid);
        txtParams.put("room_quotas", this.roomQuotas);
        txtParams.put("service", this.service);
        txtParams.put("site_param", this.siteParam);
        txtParams.put("size", this.size);
        txtParams.put("start_time", this.startTime);
        txtParams.put("status", this.status);
        txtParams.put("storey", this.storey);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelRoomUpdateResponse> getResponseClass() {
        return HotelRoomUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(this.area, 1, "area");
        RequestCheckUtils.checkMaxLength(this.bbn, 1, "bbn");
        RequestCheckUtils.checkMaxLength(this.bedType, 1, "bedType");
        RequestCheckUtils.checkMaxLength(this.breakfast, 1, "breakfast");
        RequestCheckUtils.checkMaxValue(this.deposit, 99999900L, "deposit");
        RequestCheckUtils.checkMinValue(this.deposit, 0L, "deposit");
        RequestCheckUtils.checkMaxLength(this.desc, 50000, "desc");
        RequestCheckUtils.checkMaxValue(this.fee, 99999900L, "fee");
        RequestCheckUtils.checkMinValue(this.fee, 0L, "fee");
        RequestCheckUtils.checkMaxLength(this.guide, 300, "guide");
        RequestCheckUtils.checkMaxLength(this.paymentType, 1, "paymentType");
        RequestCheckUtils.checkMaxLength(this.priceType, 1, "priceType");
        RequestCheckUtils.checkMaxLength(this.size, 1, "size");
        RequestCheckUtils.checkMaxLength(this.storey, 8, "storey");
        RequestCheckUtils.checkMaxLength(this.title, 90, "title");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("pic", this.pic);
        return params;
    }
}


