package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Brand
        extends TaobaoObject {
    private static final long serialVersionUID = 4315188947742329793L;
    @ApiField("name")
    private String name;
    @ApiField("pid")
    private Long pid;
    @ApiField("prop_name")
    private String propName;
    @ApiField("vid")
    private Long vid;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPid() {
        return this.pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPropName() {
        return this.propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public Long getVid() {
        return this.vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }
}


