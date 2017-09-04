package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class Room
        extends TaobaoObject {
    private static final long serialVersionUID = 4477797971231349169L;
    @ApiField("area")
    private String area;
    @ApiField("bbn")
    private String bbn;
    @ApiField("bed_type")
    private String bedType;
    @ApiField("breakfast")
    private String breakfast;
    @ApiField("created")
    private Date created;
    @ApiField("deposit")
    private Long deposit;
    @ApiField("desc")
    private String desc;
    @ApiField("fee")
    private Long fee;
    @ApiField("gid")
    private Long gid;
    @ApiField("guide")
    private String guide;
    @ApiField("hid")
    private Long hid;
    @ApiField("hotel")
    private Hotel hotel;
    @ApiField("iid")
    private Long iid;
    @ApiField("modified")
    private Date modified;
    @ApiField("multi_room_quotas")
    private String multiRoomQuotas;
    @ApiField("payment_type")
    private String paymentType;
    @ApiField("pic_url")
    private String picUrl;
    @ApiField("price_type")
    private String priceType;
    @ApiField("rid")
    private Long rid;
    @ApiField("room_quotas")
    private String roomQuotas;
    @ApiField("room_type")
    private RoomType roomType;
    @ApiField("service")
    private String service;
    @ApiField("size")
    private String size;
    @ApiField("status")
    private Long status;
    @ApiField("storey")
    private String storey;
    @ApiField("title")
    private String title;

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBbn() {
        return this.bbn;
    }

    public void setBbn(String bbn) {
        this.bbn = bbn;
    }

    public String getBedType() {
        return this.bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getBreakfast() {
        return this.breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getDeposit() {
        return this.deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getFee() {
        return this.fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getGid() {
        return this.gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getGuide() {
        return this.guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public Hotel getHotel() {
        return this.hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Long getIid() {
        return this.iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getMultiRoomQuotas() {
        return this.multiRoomQuotas;
    }

    public void setMultiRoomQuotas(String multiRoomQuotas) {
        this.multiRoomQuotas = multiRoomQuotas;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Long getRid() {
        return this.rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRoomQuotas() {
        return this.roomQuotas;
    }

    public void setRoomQuotas(String roomQuotas) {
        this.roomQuotas = roomQuotas;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getStorey() {
        return this.storey;
    }

    public void setStorey(String storey) {
        this.storey = storey;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


