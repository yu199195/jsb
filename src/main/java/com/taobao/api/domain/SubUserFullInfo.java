package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

public class SubUserFullInfo
        extends TaobaoObject {
    private static final long serialVersionUID = 5282915542691828171L;
    @ApiField("department_id")
    private Long departmentId;
    @ApiField("department_name")
    private String departmentName;
    @ApiField("duty_id")
    private Long dutyId;
    @ApiField("duty_level")
    private Long dutyLevel;
    @ApiField("duty_name")
    private String dutyName;
    @ApiField("employee_id")
    private Long employeeId;
    @ApiField("employee_name")
    private String employeeName;
    @ApiField("employee_nickname")
    private String employeeNickname;
    @ApiField("employee_num")
    private String employeeNum;
    @ApiField("entry_date")
    private Date entryDate;
    @ApiField("leader_id")
    private Long leaderId;
    @ApiField("office_phone")
    private String officePhone;
    @ApiField("parent_department")
    private Long parentDepartment;
    @ApiField("sex")
    private Long sex;
    @ApiField("sub_dispatch_status")
    private Boolean subDispatchStatus;
    @ApiField("sub_id")
    private Long subId;
    @ApiField("sub_nick")
    private String subNick;
    @ApiField("sub_owed_status")
    private Boolean subOwedStatus;
    @ApiField("sub_status")
    private Long subStatus;
    @ApiField("subuser_email")
    private String subuserEmail;
    @ApiField("user_email")
    private String userEmail;
    @ApiField("user_id")
    private Long userId;
    @ApiField("user_nick")
    private String userNick;
    @ApiField("work_location")
    private String workLocation;

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getDutyId() {
        return this.dutyId;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public Long getDutyLevel() {
        return this.dutyLevel;
    }

    public void setDutyLevel(Long dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public String getDutyName() {
        return this.dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNickname() {
        return this.employeeNickname;
    }

    public void setEmployeeNickname(String employeeNickname) {
        this.employeeNickname = employeeNickname;
    }

    public String getEmployeeNum() {
        return this.employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public String getOfficePhone() {
        return this.officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public Long getParentDepartment() {
        return this.parentDepartment;
    }

    public void setParentDepartment(Long parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public Long getSex() {
        return this.sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Boolean getSubDispatchStatus() {
        return this.subDispatchStatus;
    }

    public void setSubDispatchStatus(Boolean subDispatchStatus) {
        this.subDispatchStatus = subDispatchStatus;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getSubNick() {
        return this.subNick;
    }

    public void setSubNick(String subNick) {
        this.subNick = subNick;
    }

    public Boolean getSubOwedStatus() {
        return this.subOwedStatus;
    }

    public void setSubOwedStatus(Boolean subOwedStatus) {
        this.subOwedStatus = subOwedStatus;
    }

    public Long getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(Long subStatus) {
        this.subStatus = subStatus;
    }

    public String getSubuserEmail() {
        return this.subuserEmail;
    }

    public void setSubuserEmail(String subuserEmail) {
        this.subuserEmail = subuserEmail;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getWorkLocation() {
        return this.workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
}


