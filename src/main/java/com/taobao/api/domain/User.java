package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class User
        extends TaobaoObject {
    private static final long serialVersionUID = 5178524791433699439L;
    @ApiField("age")
    private Long age;
    @ApiField("alipay_account")
    private String alipayAccount;
    @ApiField("alipay_bind")
    private String alipayBind;
    @ApiField("alipay_no")
    private String alipayNo;
    @ApiField("auto_repost")
    private String autoRepost;
    @ApiField("avatar")
    private String avatar;
    @ApiField("birthday")
    private Date birthday;
    @ApiField("buyer_credit")
    private UserCredit buyerCredit;
    @ApiField("consumer_protection")
    private Boolean consumerProtection;
    @ApiField("created")
    private Date created;
    @ApiField("email")
    private String email;
    @ApiField("has_more_pic")
    private Boolean hasMorePic;
    @ApiField("has_shop")
    private Boolean hasShop;
    @ApiField("has_sub_stock")
    private Boolean hasSubStock;
    @ApiField("is_golden_seller")
    private Boolean isGoldenSeller;
    @ApiField("is_lightning_consignment")
    private Boolean isLightningConsignment;
    @ApiField("item_img_num")
    private Long itemImgNum;
    @ApiField("item_img_size")
    private Long itemImgSize;
    @ApiField("last_visit")
    private Date lastVisit;
    @ApiField("liangpin")
    private Boolean liangpin;
    @ApiField("location")
    private Location location;
    @ApiField("magazine_subscribe")
    private Boolean magazineSubscribe;
    @ApiField("manage_book")
    private Boolean manageBook;
    @ApiField("mobile")
    private String mobile;
    @ApiField("nick")
    private String nick;
    @ApiField("online_gaming")
    private Boolean onlineGaming;
    @ApiField("phone")
    private String phone;
    @ApiField("promoted_type")
    private String promotedType;
    @ApiField("prop_img_num")
    private Long propImgNum;
    @ApiField("prop_img_size")
    private Long propImgSize;
    @ApiField("real_name")
    private String realName;
    @ApiField("seller_credit")
    private UserCredit sellerCredit;
    @ApiField("sex")
    private String sex;
    @ApiField("sign_consumer_protection")
    private Boolean signConsumerProtection;
    @ApiField("sign_food_seller_promise")
    private Boolean signFoodSellerPromise;
    @ApiField("status")
    private String status;
    @ApiField("type")
    private String type;
    @ApiField("uid")
    private String uid;
    @ApiField("user_id")
    private Long userId;
    @ApiField("vertical_market")
    private String verticalMarket;
    @ApiField("vip_info")
    private String vipInfo;

    public Long getAge() {
        return this.age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getAlipayAccount() {
        return this.alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getAlipayBind() {
        return this.alipayBind;
    }

    public void setAlipayBind(String alipayBind) {
        this.alipayBind = alipayBind;
    }

    public String getAlipayNo() {
        return this.alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getAutoRepost() {
        return this.autoRepost;
    }

    public void setAutoRepost(String autoRepost) {
        this.autoRepost = autoRepost;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public UserCredit getBuyerCredit() {
        return this.buyerCredit;
    }

    public void setBuyerCredit(UserCredit buyerCredit) {
        this.buyerCredit = buyerCredit;
    }

    public Boolean getConsumerProtection() {
        return this.consumerProtection;
    }

    public void setConsumerProtection(Boolean consumerProtection) {
        this.consumerProtection = consumerProtection;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getHasMorePic() {
        return this.hasMorePic;
    }

    public void setHasMorePic(Boolean hasMorePic) {
        this.hasMorePic = hasMorePic;
    }

    public Boolean getHasShop() {
        return this.hasShop;
    }

    public void setHasShop(Boolean hasShop) {
        this.hasShop = hasShop;
    }

    public Boolean getHasSubStock() {
        return this.hasSubStock;
    }

    public void setHasSubStock(Boolean hasSubStock) {
        this.hasSubStock = hasSubStock;
    }

    public Boolean getIsGoldenSeller() {
        return this.isGoldenSeller;
    }

    public void setIsGoldenSeller(Boolean isGoldenSeller) {
        this.isGoldenSeller = isGoldenSeller;
    }

    public Boolean getIsLightningConsignment() {
        return this.isLightningConsignment;
    }

    public void setIsLightningConsignment(Boolean isLightningConsignment) {
        this.isLightningConsignment = isLightningConsignment;
    }

    public Long getItemImgNum() {
        return this.itemImgNum;
    }

    public void setItemImgNum(Long itemImgNum) {
        this.itemImgNum = itemImgNum;
    }

    public Long getItemImgSize() {
        return this.itemImgSize;
    }

    public void setItemImgSize(Long itemImgSize) {
        this.itemImgSize = itemImgSize;
    }

    public Date getLastVisit() {
        return this.lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Boolean getLiangpin() {
        return this.liangpin;
    }

    public void setLiangpin(Boolean liangpin) {
        this.liangpin = liangpin;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Boolean getMagazineSubscribe() {
        return this.magazineSubscribe;
    }

    public void setMagazineSubscribe(Boolean magazineSubscribe) {
        this.magazineSubscribe = magazineSubscribe;
    }

    public Boolean getManageBook() {
        return this.manageBook;
    }

    public void setManageBook(Boolean manageBook) {
        this.manageBook = manageBook;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Boolean getOnlineGaming() {
        return this.onlineGaming;
    }

    public void setOnlineGaming(Boolean onlineGaming) {
        this.onlineGaming = onlineGaming;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPromotedType() {
        return this.promotedType;
    }

    public void setPromotedType(String promotedType) {
        this.promotedType = promotedType;
    }

    public Long getPropImgNum() {
        return this.propImgNum;
    }

    public void setPropImgNum(Long propImgNum) {
        this.propImgNum = propImgNum;
    }

    public Long getPropImgSize() {
        return this.propImgSize;
    }

    public void setPropImgSize(Long propImgSize) {
        this.propImgSize = propImgSize;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public UserCredit getSellerCredit() {
        return this.sellerCredit;
    }

    public void setSellerCredit(UserCredit sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getSignConsumerProtection() {
        return this.signConsumerProtection;
    }

    public void setSignConsumerProtection(Boolean signConsumerProtection) {
        this.signConsumerProtection = signConsumerProtection;
    }

    public Boolean getSignFoodSellerPromise() {
        return this.signFoodSellerPromise;
    }

    public void setSignFoodSellerPromise(Boolean signFoodSellerPromise) {
        this.signFoodSellerPromise = signFoodSellerPromise;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getVerticalMarket() {
        return this.verticalMarket;
    }

    public void setVerticalMarket(String verticalMarket) {
        this.verticalMarket = verticalMarket;
    }

    public String getVipInfo() {
        return this.vipInfo;
    }

    public void setVipInfo(String vipInfo) {
        this.vipInfo = vipInfo;
    }
}


