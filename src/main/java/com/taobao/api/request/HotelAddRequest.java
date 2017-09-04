package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelAddResponse;

import java.util.HashMap;
import java.util.Map;

public class HotelAddRequest
        extends BaseTaobaoRequest<HotelAddResponse>
        implements TaobaoUploadRequest<HotelAddResponse> {
    private String address;
    private Long city;
    private String country;
    private String decorateTime;
    private String desc;
    private Long district;
    private Boolean domestic;
    private String level;
    private String name;
    private String openingTime;
    private String orientation;
    private String outerId;
    private FileItem pic;
    private Long province;
    private Long rooms;
    private String service;
    private String siteParam;
    private Long storeys;
    private String tel;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getCity() {
        return this.city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setDecorateTime(String decorateTime) {
        this.decorateTime = decorateTime;
    }

    public String getDecorateTime() {
        return this.decorateTime;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }

    public Long getDistrict() {
        return this.district;
    }

    public void setDomestic(Boolean domestic) {
        this.domestic = domestic;
    }

    public Boolean getDomestic() {
        return this.domestic;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return this.level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getOpeningTime() {
        return this.openingTime;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPic(FileItem pic) {
        this.pic = pic;
    }

    public FileItem getPic() {
        return this.pic;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getProvince() {
        return this.province;
    }

    public void setRooms(Long rooms) {
        this.rooms = rooms;
    }

    public Long getRooms() {
        return this.rooms;
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

    public void setStoreys(Long storeys) {
        this.storeys = storeys;
    }

    public Long getStoreys() {
        return this.storeys;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public String getApiMethodName() {
        return "taobao.hotel.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("city", this.city);
        txtParams.put("country", this.country);
        txtParams.put("decorate_time", this.decorateTime);
        txtParams.put("desc", this.desc);
        txtParams.put("district", this.district);
        txtParams.put("domestic", this.domestic);
        txtParams.put("level", this.level);
        txtParams.put("name", this.name);
        txtParams.put("opening_time", this.openingTime);
        txtParams.put("orientation", this.orientation);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("province", this.province);
        txtParams.put("rooms", this.rooms);
        txtParams.put("service", this.service);
        txtParams.put("site_param", this.siteParam);
        txtParams.put("storeys", this.storeys);
        txtParams.put("tel", this.tel);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Class<HotelAddResponse> getResponseClass() {
        return HotelAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(this.address, "address");
        RequestCheckUtils.checkMaxLength(this.address, 120, "address");
        RequestCheckUtils.checkNotEmpty(this.city, "city");
        RequestCheckUtils.checkMaxValue(this.city, 999999L, "city");
        RequestCheckUtils.checkMinValue(this.city, 0L, "city");
        RequestCheckUtils.checkNotEmpty(this.country, "country");
        RequestCheckUtils.checkMaxLength(this.decorateTime, 4, "decorateTime");
        RequestCheckUtils.checkNotEmpty(this.desc, "desc");
        RequestCheckUtils.checkMaxLength(this.desc, 50000, "desc");
        RequestCheckUtils.checkMaxValue(this.district, 999999L, "district");
        RequestCheckUtils.checkMinValue(this.district, 0L, "district");
        RequestCheckUtils.checkNotEmpty(this.domestic, "domestic");
        RequestCheckUtils.checkNotEmpty(this.level, "level");
        RequestCheckUtils.checkMaxLength(this.level, 1, "level");
        RequestCheckUtils.checkNotEmpty(this.name, "name");
        RequestCheckUtils.checkMaxLength(this.name, 60, "name");
        RequestCheckUtils.checkMaxLength(this.openingTime, 4, "openingTime");
        RequestCheckUtils.checkNotEmpty(this.orientation, "orientation");
        RequestCheckUtils.checkMaxLength(this.orientation, 1, "orientation");
        RequestCheckUtils.checkNotEmpty(this.pic, "pic");
        RequestCheckUtils.checkNotEmpty(this.province, "province");
        RequestCheckUtils.checkMaxValue(this.province, 999999L, "province");
        RequestCheckUtils.checkMinValue(this.province, 0L, "province");
        RequestCheckUtils.checkMaxValue(this.rooms, 9999L, "rooms");
        RequestCheckUtils.checkMinValue(this.rooms, 0L, "rooms");
        RequestCheckUtils.checkMaxLength(this.siteParam, 100, "siteParam");
        RequestCheckUtils.checkMaxValue(this.storeys, 9999L, "storeys");
        RequestCheckUtils.checkMinValue(this.storeys, 0L, "storeys");
        RequestCheckUtils.checkMaxLength(this.tel, 32, "tel");
    }

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap();
        params.put("pic", this.pic);
        return params;
    }
}


