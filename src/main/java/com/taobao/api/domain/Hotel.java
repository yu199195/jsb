package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Hotel
        extends TaobaoObject {
    private static final long serialVersionUID = 3349281414848249725L;
    @ApiField("address")
    private String address;
    @ApiField("alias_name")
    private String aliasName;
    @ApiField("audit_deny_reason")
    private String auditDenyReason;
    @ApiField("city")
    private Long city;
    @ApiField("city_str")
    private String cityStr;
    @ApiField("country")
    private String country;
    @ApiField("country_str")
    private String countryStr;
    @ApiField("created")
    private Date created;
    @ApiField("decorate_time")
    private String decorateTime;
    @ApiField("desc")
    private String desc;
    @ApiField("district")
    private Long district;
    @ApiField("district_str")
    private String districtStr;
    @ApiField("hid")
    private Long hid;
    @ApiField("level")
    private String level;
    @ApiField("modified")
    private Date modified;
    @ApiField("name")
    private String name;
    @ApiField("opening_time")
    private String openingTime;
    @ApiField("orientation")
    private String orientation;
    @ApiField("pic_url")
    private String picUrl;
    @ApiField("province")
    private Long province;
    @ApiField("province_str")
    private String provinceStr;
    @ApiListField("room_types")
    @ApiField("room_type")
    private List<RoomType> roomTypes;
    @ApiField("rooms")
    private Long rooms;
    @ApiField("service")
    private String service;
    @ApiField("status")
    private Long status;
    @ApiField("storeys")
    private Long storeys;
    @ApiField("tel")
    private String tel;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAuditDenyReason() {
        return this.auditDenyReason;
    }

    public void setAuditDenyReason(String auditDenyReason) {
        this.auditDenyReason = auditDenyReason;
    }

    public Long getCity() {
        return this.city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public String getCityStr() {
        return this.cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryStr() {
        return this.countryStr;
    }

    public void setCountryStr(String countryStr) {
        this.countryStr = countryStr;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDecorateTime() {
        return this.decorateTime;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getDistrict() {
        return this.district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public String getDistrictStr() {
        return this.districtStr;
    }

    public void setDistrictStr(String districtStr) {
        this.districtStr = districtStr;
    }

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getModified() {
        return this.modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Long getProvince() {
        return this.province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public String getProvinceStr() {
        return this.provinceStr;
    }

    public void setProvinceStr(String provinceStr) {
        this.provinceStr = provinceStr;
    }

    public List<RoomType> getRoomTypes() {
        return this.roomTypes;
    }

    public void setRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public Long getRooms() {
        return this.rooms;
    }

    public void setRooms(Long rooms) {
        this.rooms = rooms;
    }

    public String getService() {
        return this.service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStoreys() {
        return this.storeys;
    }

    public void setStoreys(Long storeys) {
        this.storeys = storeys;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}


