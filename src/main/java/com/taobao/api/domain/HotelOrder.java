package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class HotelOrder
        extends TaobaoObject {
    private static final long serialVersionUID = 4123134335737457833L;
    @ApiField("alipay_trade_no")
    private String alipayTradeNo;
    @ApiField("arrive_early")
    private Date arriveEarly;
    @ApiField("arrive_late")
    private Date arriveLate;
    @ApiField("buyer_nick")
    private String buyerNick;
    @ApiField("checkin_date")
    private Date checkinDate;
    @ApiField("checkout_date")
    private Date checkoutDate;
    @ApiField("comment")
    private String comment;
    @ApiField("contact_name")
    private String contactName;
    @ApiField("contact_phone")
    private String contactPhone;
    @ApiField("contact_phone_bak")
    private String contactPhoneBak;
    @ApiField("created")
    private Date created;
    @ApiField("end_time")
    private Date endTime;
    @ApiField("gid")
    private Long gid;
    @ApiListField("guests")
    @ApiField("order_guest")
    private List<OrderGuest> guests;
    @ApiField("hid")
    private Long hid;
    @ApiField("logistics_status")
    private String logisticsStatus;
    @ApiField("message")
    private String message;
    @ApiField("modified")
    private Date modified;
    @ApiField("nights")
    private Long nights;
    @ApiField("oid")
    private Long oid;
    @ApiField("out_oid")
    private String outOid;
    @ApiField("pay_time")
    private Date payTime;
    @ApiField("payment")
    private Long payment;
    @ApiListField("prices")
    @ApiField("number")
    private List<Long> prices;
    @ApiField("refund_status")
    private String refundStatus;
    @ApiField("rid")
    private Long rid;
    @ApiField("room_number")
    private Long roomNumber;
    @ApiField("seller_nick")
    private String sellerNick;
    @ApiField("tid")
    private Long tid;
    @ApiField("total_room_price")
    private Long totalRoomPrice;
    @ApiField("trade_status")
    private String tradeStatus;
    @ApiField("type")
    private String type;

    public String getAlipayTradeNo() {
        return this.alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public Date getArriveEarly() {
        return this.arriveEarly;
    }

    public void setArriveEarly(Date arriveEarly) {
        this.arriveEarly = arriveEarly;
    }

    public Date getArriveLate() {
        return this.arriveLate;
    }

    public void setArriveLate(Date arriveLate) {
        this.arriveLate = arriveLate;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public Date getCheckinDate() {
        return this.checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return this.checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactPhoneBak() {
        return this.contactPhoneBak;
    }

    public void setContactPhoneBak(String contactPhoneBak) {
        this.contactPhoneBak = contactPhoneBak;
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

    public Long getGid() {
        return this.gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public List<OrderGuest> getGuests() {
        return this.guests;
    }

    public void setGuests(List<OrderGuest> guests) {
        this.guests = guests;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getNights() {
        return this.nights;
    }

    public void setNights(Long nights) {
        this.nights = nights;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getOutOid() {
        return this.outOid;
    }

    public void setOutOid(String outOid) {
        this.outOid = outOid;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getPayment() {
        return this.payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public List<Long> getPrices() {
        return this.prices;
    }

    public void setPrices(List<Long> prices) {
        this.prices = prices;
    }

    public String getRefundStatus() {
        return this.refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Long getRid() {
        return this.rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public Long getTid() {
        return this.tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTotalRoomPrice() {
        return this.totalRoomPrice;
    }

    public void setTotalRoomPrice(Long totalRoomPrice) {
        this.totalRoomPrice = totalRoomPrice;
    }

    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


