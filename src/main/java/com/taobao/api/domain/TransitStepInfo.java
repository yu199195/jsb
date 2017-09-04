package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class TransitStepInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 5141762964422852541L;
    @ApiField("action")
    private String action;
    @ApiField("desc")
    private String desc;
    @ApiField("node_description")
    private String nodeDescription;
    @ApiField("status_desc")
    private String statusDesc;
    @ApiField("status_time")
    private String statusTime;
    @ApiField("time")
    private String time;

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNodeDescription() {
        return this.nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getStatusTime() {
        return this.statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


