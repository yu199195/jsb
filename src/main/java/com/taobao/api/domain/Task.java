package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

public class Task
        extends TaobaoObject {
    private static final long serialVersionUID = 8744948436425615583L;
    @ApiField("check_code")
    private String checkCode;
    @ApiField("created")
    private Date created;
    @ApiField("download_url")
    private String downloadUrl;
    @ApiField("method")
    private String method;
    @ApiField("schedule")
    private Date schedule;
    @ApiField("status")
    private String status;
    @ApiListField("subtasks")
    @ApiField("subtask")
    private List<Subtask> subtasks;
    @ApiField("task_id")
    private Long taskId;

    public String getCheckCode() {
        return this.checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Date getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Subtask> getSubtasks() {
        return this.subtasks;
    }

    public void setSubtasks(List<Subtask> subtasks) {
        this.subtasks = subtasks;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}


