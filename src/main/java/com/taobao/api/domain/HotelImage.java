package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class HotelImage
        extends TaobaoObject {
    private static final long serialVersionUID = 1736376918321753737L;
    @ApiField("hid")
    private Long hid;
    @ApiField("pic")
    private String pic;

    public Long getHid() {
        return this.hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getPic() {
        return this.pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}


